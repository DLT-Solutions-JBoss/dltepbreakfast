package com.dlt.division.rest;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.dlt.division.model.Schedule;

//Path to REST Service 
@Path("/EP")
public class BreakfastReminder implements DivisionService{



        @DivisionService(ServiceType.EP)
        @PersistenceContext(unitName="Division", type=PersistenceContextType.EXTENDED)
        private EntityManager emSchedule;

        @GET()
        @Path("email")
        @Produces("application/json")
        @DivisionService(ServiceType.EP)
        public List<Schedule> sendEmail()
        {

                Query query = emSchedule.createQuery("FROM com.dlt.division.model.Schedule where delivery_date > current_date()")
                		.setMaxResults(1);
                @SuppressWarnings("unchecked")
                List <Schedule> Schedule = query.getResultList();
                
                if(!Schedule.isEmpty())
                {
                	//Email scheduled employee
            		final String username = System.getenv("DLT_JBOSS_EMAIL_USER");
            		final String password = System.getenv("DLT_JBOSS_EMAIL_PWD")

            		Properties props = new Properties();
            		props.put("mail.smtp.auth", "true");
            		props.put("mail.smtp.starttls.enable", "true");
            		props.put("mail.smtp.host", "smtp.gmail.com");
            		props.put("mail.smtp.port", "587");
            		
            		Session session = Session.getInstance(props,
            				  new javax.mail.Authenticator() {
            					protected PasswordAuthentication getPasswordAuthentication() {
            						return new PasswordAuthentication(username, password);
            					}
            				  });
            		
            		try {

            			Message message = new MimeMessage(session);
            			message.setFrom(new InternetAddress(username));
            			Schedule sched = Schedule.get(0);
            			message.setRecipients(Message.RecipientType.TO,
            					InternetAddress.parse(sched.getEmployee().getEmail()));
            			message.setSubject("DLT EP Breakfast Reminder");
            			
            			SimpleDateFormat ft = 
            				      new SimpleDateFormat ("E, M/d/yyyy");
            			
            			message.setText("Dear "+sched.getEmployee().getFirstName()+","
            				+ "\n\n This is a reminder you are scheduled to get the EP team breakfast on "
            				+ ft.format(sched.getDeliveryDate()) + "."
            				+ "\n\nLove,"
            				+ "\nDLT EP Breakfast Service");

            			Transport.send(message);

            			System.out.println("Done");

            		} catch (MessagingException e) {
            			throw new RuntimeException(e);
            		}	
            		
                }

                return Schedule;
        }


        @Override
        public Class<? extends Annotation> annotationType() {
                return null;
        }
        @Override
        public ServiceType value() {
                return null;
        }
}

