//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.25 at 08:59:01 AM EDT 
//


package com.dlt.division.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dlt.weather.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WindDirDegrees_QNAME = new QName("", "wind_dir_degrees");
    private final static QName _Pcp3HrIn_QNAME = new QName("", "pcp3hr_in");
    private final static QName _Corrected_QNAME = new QName("", "corrected");
    private final static QName _Pcp24HrIn_QNAME = new QName("", "pcp24hr_in");
    private final static QName _PresentWeatherSensorOff_QNAME = new QName("", "present_weather_sensor_off");
    private final static QName _FlightCategory_QNAME = new QName("", "flight_category");
    private final static QName _MaxTC_QNAME = new QName("", "maxT_c");
    private final static QName _RawText_QNAME = new QName("", "raw_text");
    private final static QName _MinT24HrC_QNAME = new QName("", "minT24hr_c");
    private final static QName _DewpointC_QNAME = new QName("", "dewpoint_c");
    private final static QName _MetarType_QNAME = new QName("", "metar_type");
    private final static QName _WindSpeedKt_QNAME = new QName("", "wind_speed_kt");
    private final static QName _MaintenanceIndicatorOn_QNAME = new QName("", "maintenance_indicator_on");
    private final static QName _RequestIndex_QNAME = new QName("", "request_index");
    private final static QName _ThreeHrPressureTendencyMb_QNAME = new QName("", "three_hr_pressure_tendency_mb");
    private final static QName _Longitude_QNAME = new QName("", "longitude");
    private final static QName _WindGustKt_QNAME = new QName("", "wind_gust_kt");
    private final static QName _NoSignal_QNAME = new QName("", "no_signal");
    private final static QName _StationId_QNAME = new QName("", "station_id");
    private final static QName _SeaLevelPressureMb_QNAME = new QName("", "sea_level_pressure_mb");
    private final static QName _AltimInHg_QNAME = new QName("", "altim_in_hg");
    private final static QName _FreezingRainSensorOff_QNAME = new QName("", "freezing_rain_sensor_off");
    private final static QName _SnowIn_QNAME = new QName("", "snow_in");
    private final static QName _ObservationTime_QNAME = new QName("", "observation_time");
    private final static QName _LightningSensorOff_QNAME = new QName("", "lightning_sensor_off");
    private final static QName _Error_QNAME = new QName("", "error");
    private final static QName _TempC_QNAME = new QName("", "temp_c");
    private final static QName _VisibilityStatuteMi_QNAME = new QName("", "visibility_statute_mi");
    private final static QName _MaxT24HrC_QNAME = new QName("", "maxT24hr_c");
    private final static QName _AutoStation_QNAME = new QName("", "auto_station");
    private final static QName _Pcp6HrIn_QNAME = new QName("", "pcp6hr_in");
    private final static QName _MinTC_QNAME = new QName("", "minT_c");
    private final static QName _TimeTakenMs_QNAME = new QName("", "time_taken_ms");
    private final static QName _VertVisFt_QNAME = new QName("", "vert_vis_ft");
    private final static QName _Auto_QNAME = new QName("", "auto");
    private final static QName _PrecipIn_QNAME = new QName("", "precip_in");
    private final static QName _Latitude_QNAME = new QName("", "latitude");
    private final static QName _WxString_QNAME = new QName("", "wx_string");
    private final static QName _ElevationM_QNAME = new QName("", "elevation_m");
    private final static QName _Warning_QNAME = new QName("", "warning");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jboss.as.quickstarts.hellosport.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataSource }
     * 
     */
    public DataSource createDataSource() {
        return new DataSource();
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link METAR }
     * 
     */
    public METAR createMETAR() {
        return new METAR();
    }

    /**
     * Create an instance of {@link QualityControlFlags }
     * 
     */
    public QualityControlFlags createQualityControlFlags() {
        return new QualityControlFlags();
    }

    /**
     * Create an instance of {@link SkyCondition }
     * 
     */
    public SkyCondition createSkyCondition() {
        return new SkyCondition();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link Errors }
     * 
     */
    public Errors createErrors() {
        return new Errors();
    }

    /**
     * Create an instance of {@link Warnings }
     * 
     */
    public Warnings createWarnings() {
        return new Warnings();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "wind_dir_degrees")
    public JAXBElement<Integer> createWindDirDegrees(Integer value) {
        return new JAXBElement<Integer>(_WindDirDegrees_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pcp3hr_in")
    public JAXBElement<Float> createPcp3HrIn(Float value) {
        return new JAXBElement<Float>(_Pcp3HrIn_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "corrected")
    public JAXBElement<String> createCorrected(String value) {
        return new JAXBElement<String>(_Corrected_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pcp24hr_in")
    public JAXBElement<Float> createPcp24HrIn(Float value) {
        return new JAXBElement<Float>(_Pcp24HrIn_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "present_weather_sensor_off")
    public JAXBElement<String> createPresentWeatherSensorOff(String value) {
        return new JAXBElement<String>(_PresentWeatherSensorOff_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flight_category")
    public JAXBElement<String> createFlightCategory(String value) {
        return new JAXBElement<String>(_FlightCategory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "maxT_c")
    public JAXBElement<Float> createMaxTC(Float value) {
        return new JAXBElement<Float>(_MaxTC_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "raw_text")
    public JAXBElement<String> createRawText(String value) {
        return new JAXBElement<String>(_RawText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "minT24hr_c")
    public JAXBElement<Float> createMinT24HrC(Float value) {
        return new JAXBElement<Float>(_MinT24HrC_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dewpoint_c")
    public JAXBElement<Float> createDewpointC(Float value) {
        return new JAXBElement<Float>(_DewpointC_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "metar_type")
    public JAXBElement<String> createMetarType(String value) {
        return new JAXBElement<String>(_MetarType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "wind_speed_kt")
    public JAXBElement<Integer> createWindSpeedKt(Integer value) {
        return new JAXBElement<Integer>(_WindSpeedKt_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "maintenance_indicator_on")
    public JAXBElement<String> createMaintenanceIndicatorOn(String value) {
        return new JAXBElement<String>(_MaintenanceIndicatorOn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "request_index")
    public JAXBElement<Integer> createRequestIndex(Integer value) {
        return new JAXBElement<Integer>(_RequestIndex_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "three_hr_pressure_tendency_mb")
    public JAXBElement<Float> createThreeHrPressureTendencyMb(Float value) {
        return new JAXBElement<Float>(_ThreeHrPressureTendencyMb_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "longitude")
    public JAXBElement<Float> createLongitude(Float value) {
        return new JAXBElement<Float>(_Longitude_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "wind_gust_kt")
    public JAXBElement<Integer> createWindGustKt(Integer value) {
        return new JAXBElement<Integer>(_WindGustKt_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "no_signal")
    public JAXBElement<String> createNoSignal(String value) {
        return new JAXBElement<String>(_NoSignal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "station_id")
    public JAXBElement<String> createStationId(String value) {
        return new JAXBElement<String>(_StationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sea_level_pressure_mb")
    public JAXBElement<Float> createSeaLevelPressureMb(Float value) {
        return new JAXBElement<Float>(_SeaLevelPressureMb_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "altim_in_hg")
    public JAXBElement<Float> createAltimInHg(Float value) {
        return new JAXBElement<Float>(_AltimInHg_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "freezing_rain_sensor_off")
    public JAXBElement<String> createFreezingRainSensorOff(String value) {
        return new JAXBElement<String>(_FreezingRainSensorOff_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "snow_in")
    public JAXBElement<Float> createSnowIn(Float value) {
        return new JAXBElement<Float>(_SnowIn_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "observation_time")
    public JAXBElement<String> createObservationTime(String value) {
        return new JAXBElement<String>(_ObservationTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lightning_sensor_off")
    public JAXBElement<String> createLightningSensorOff(String value) {
        return new JAXBElement<String>(_LightningSensorOff_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "error")
    public JAXBElement<String> createError(String value) {
        return new JAXBElement<String>(_Error_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "temp_c")
    public JAXBElement<Float> createTempC(Float value) {
        return new JAXBElement<Float>(_TempC_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "visibility_statute_mi")
    public JAXBElement<Float> createVisibilityStatuteMi(Float value) {
        return new JAXBElement<Float>(_VisibilityStatuteMi_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "maxT24hr_c")
    public JAXBElement<Float> createMaxT24HrC(Float value) {
        return new JAXBElement<Float>(_MaxT24HrC_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "auto_station")
    public JAXBElement<String> createAutoStation(String value) {
        return new JAXBElement<String>(_AutoStation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pcp6hr_in")
    public JAXBElement<Float> createPcp6HrIn(Float value) {
        return new JAXBElement<Float>(_Pcp6HrIn_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "minT_c")
    public JAXBElement<Float> createMinTC(Float value) {
        return new JAXBElement<Float>(_MinTC_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "time_taken_ms")
    public JAXBElement<Integer> createTimeTakenMs(Integer value) {
        return new JAXBElement<Integer>(_TimeTakenMs_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vert_vis_ft")
    public JAXBElement<Integer> createVertVisFt(Integer value) {
        return new JAXBElement<Integer>(_VertVisFt_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "auto")
    public JAXBElement<String> createAuto(String value) {
        return new JAXBElement<String>(_Auto_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "precip_in")
    public JAXBElement<Float> createPrecipIn(Float value) {
        return new JAXBElement<Float>(_PrecipIn_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "latitude")
    public JAXBElement<Float> createLatitude(Float value) {
        return new JAXBElement<Float>(_Latitude_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "wx_string")
    public JAXBElement<String> createWxString(String value) {
        return new JAXBElement<String>(_WxString_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "elevation_m")
    public JAXBElement<Float> createElevationM(Float value) {
        return new JAXBElement<Float>(_ElevationM_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "warning")
    public JAXBElement<String> createWarning(String value) {
        return new JAXBElement<String>(_Warning_QNAME, String.class, null, value);
    }

}