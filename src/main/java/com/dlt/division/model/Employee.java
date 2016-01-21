package com.dlt.division.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="employee")
public class Employee {

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    int id;
    
    @Column(name = "first_name")
    String first_name;
    
    @Column(name = "last_name")
    String last_name;

    @OneToOne(mappedBy = "employee")
    private List<Schedule> schedules;

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getFirstName() {
      return this.first_name;
    }

    public void setFirstName(String fname) {
      this.first_name = fname;
    }

    public String getLastName() {
      return this.last_name;
    }

    public void setLastName(String lname) {
      this.last_name = lname;
    }

	public List<Schedule> getSchedules() {
		return schedules;
	}

	public void setSchedules(List<Schedule> schedules) {
		this.schedules = schedules;
	}
    
}
