package com.zz.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @文件名称：SYQ_starting.java
 * @创建时间：2020-04-10 16:10:27
 * @创 建  人：曾凡宇
 * @文件描述：SYQ_starting 实体类
 * @文件版本：V0.01
 */

@Data
@Accessors(chain = true)
public class SYQ_starting {
    private Integer id;
    private String FH;
    private String Cstation;
    private String TENstation;
    private String PassWord;
    private String Function_Code;
    private String Lmessage;
    private String Smessage;
    private String Nwater;
    private String TAG;
    private String IOT;
    private Date DATAmessage;
    private String TAGstation;
    private String Nstation;
    private String Tstation;
    private String TAG_one;
    private String Identification_one;
    private String TAG_Card_one;
    private String Card_one;
    private String TAG_two;
    private String Identification_two;
    private String TAG_Card_two;
    private String Card_two;
    private String TAG_hardware;
    private String Hardware_message;
    private String TAGvoltage;
    private double Voltage_data;
    private String TAGelectricity;
    private double Ectricity_data;
    private String TAGVE;
    private double VE_data;
    private String TAGE_battery;
    private double Battery_current_data;
    private String TAG_IOT;
    private String IOT_strength;
    private String TAG_signal;
    private String Signal_strength;
    private String TAG_temperature;
    private double Temperature_data;
    private String TAG_humidity;
    private double Humidity_data;
    private String TAG_video;
    private String Video_message;
    private String Crash_status;
    private String Crash_status_message;
    private String TAG_diagnose;
    private String Diagnose_message;
    private String TAG_longitude;
    private double Longitude;
    private String TAG_latitude;
    private double Latitude;
    private String Fluid_character;
    private String CRC_HEX;
    private String RSNM;
    private String Type = "译文";
//	public void setId(Integer id){
//	this.id=id;
//	}
//	public Integer getId(){
//		return id;
//	}
//	public void setFH(String FH){
//	this.FH=FH;
//	}
//	public String getFH(){
//		return FH;
//	}
//	public void setCstation(String Cstation){
//	this.Cstation=Cstation;
//	}
//	public String getCstation(){
//		return Cstation;
//	}
//	public void setTENstation(String TENstation){
//	this.TENstation=TENstation;
//	}
//	public String getTENstation(){
//		return TENstation;
//	}
//	public void setPassWord(String PassWord){
//	this.PassWord=PassWord;
//	}
//	public String getPassWord(){
//		return PassWord;
//	}
//	public void setFunction_Code(String Function_Code){
//	this.Function_Code=Function_Code;
//	}
//	public String getFunction_Code(){
//		return Function_Code;
//	}
//	public void setLmessage(String Lmessage){
//	this.Lmessage=Lmessage;
//	}
//	public String getLmessage(){
//		return Lmessage;
//	}
//	public void setSmessage(String Smessage){
//	this.Smessage=Smessage;
//	}
//	public String getSmessage(){
//		return Smessage;
//	}
//	public void setNwater(String Nwater){
//	this.Nwater=Nwater;
//	}
//	public String getNwater(){
//		return Nwater;
//	}
//	public void setTAG(String TAG){
//	this.TAG=TAG;
//	}
//	public String getTAG(){
//		return TAG;
//	}
//	public void setIOT(String IOT){
//	this.IOT=IOT;
//	}
//	public String getIOT(){
//		return IOT;
//	}
//	public void setDATAmessage(String DATAmessage){
//	this.DATAmessage=DATAmessage;
//	}
//	public String getDATAmessage(){
//		return DATAmessage;
//	}
//	public void setTAGstation(String TAGstation){
//	this.TAGstation=TAGstation;
//	}
//	public String getTAGstation(){
//		return TAGstation;
//	}
//	public void setNstation(Long Nstation){
//	this.Nstation=Nstation;
//	}
//	public Long getNstation(){
//		return Nstation;
//	}
//	public void setTstation(String Tstation){
//	this.Tstation=Tstation;
//	}
//	public String getTstation(){
//		return Tstation;
//	}
//	public void setTAG_one(String TAG_one){
//	this.TAG_one=TAG_one;
//	}
//	public String getTAG_one(){
//		return TAG_one;
//	}
//	public void setIdentification_one(String Identification_one){
//	this.Identification_one=Identification_one;
//	}
//	public String getIdentification_one(){
//		return Identification_one;
//	}
//	public void setTAG_Card_one(String TAG_Card_one){
//	this.TAG_Card_one=TAG_Card_one;
//	}
//	public String getTAG_Card_one(){
//		return TAG_Card_one;
//	}
//	public void setCard_one(String Card_one){
//	this.Card_one=Card_one;
//	}
//	public String getCard_one(){
//		return Card_one;
//	}
//	public void setTAG_two(String TAG_two){
//	this.TAG_two=TAG_two;
//	}
//	public String getTAG_two(){
//		return TAG_two;
//	}
//	public void setIdentification_two(String Identification_two){
//	this.Identification_two=Identification_two;
//	}
//	public String getIdentification_two(){
//		return Identification_two;
//	}
//	public void setTAG_Card_two(String TAG_Card_two){
//	this.TAG_Card_two=TAG_Card_two;
//	}
//	public String getTAG_Card_two(){
//		return TAG_Card_two;
//	}
//	public void setCard_two(String Card_two){
//	this.Card_two=Card_two;
//	}
//	public String getCard_two(){
//		return Card_two;
//	}
//	public void setTAG_hardware(String TAG_hardware){
//	this.TAG_hardware=TAG_hardware;
//	}
//	public String getTAG_hardware(){
//		return TAG_hardware;
//	}
//	public void setHardware_message(String Hardware_message){
//	this.Hardware_message=Hardware_message;
//	}
//	public String getHardware_message(){
//		return Hardware_message;
//	}
//	public void setTAGvoltage(String TAGvoltage){
//	this.TAGvoltage=TAGvoltage;
//	}
//	public String getTAGvoltage(){
//		return TAGvoltage;
//	}
//	public void setVoltage_data(Long Voltage_data){
//	this.Voltage_data=Voltage_data;
//	}
//	public Long getVoltage_data(){
//		return Voltage_data;
//	}
//	public void setTAGelectricity(String TAGelectricity){
//	this.TAGelectricity=TAGelectricity;
//	}
//	public String getTAGelectricity(){
//		return TAGelectricity;
//	}
//	public void setEctricity_data(Long Ectricity_data){
//	this.Ectricity_data=Ectricity_data;
//	}
//	public Long getEctricity_data(){
//		return Ectricity_data;
//	}
//	public void setTAGVE(String TAGVE){
//	this.TAGVE=TAGVE;
//	}
//	public String getTAGVE(){
//		return TAGVE;
//	}
//	public void setVE_data(Long VE_data){
//	this.VE_data=VE_data;
//	}
//	public Long getVE_data(){
//		return VE_data;
//	}
//	public void setTAGE_battery(String TAGE_battery){
//	this.TAGE_battery=TAGE_battery;
//	}
//	public String getTAGE_battery(){
//		return TAGE_battery;
//	}
//	public void setBattery_current_data(Long Battery_current_data){
//	this.Battery_current_data=Battery_current_data;
//	}
//	public Long getBattery_current_data(){
//		return Battery_current_data;
//	}
//	public void setTAG_IOT(String TAG_IOT){
//	this.TAG_IOT=TAG_IOT;
//	}
//	public String getTAG_IOT(){
//		return TAG_IOT;
//	}
//	public void setIOT_strength(String IOT_strength){
//	this.IOT_strength=IOT_strength;
//	}
//	public String getIOT_strength(){
//		return IOT_strength;
//	}
//	public void setTAG_signal(String TAG_signal){
//	this.TAG_signal=TAG_signal;
//	}
//	public String getTAG_signal(){
//		return TAG_signal;
//	}
//	public void setSignal_strength(String Signal_strength){
//	this.Signal_strength=Signal_strength;
//	}
//	public String getSignal_strength(){
//		return Signal_strength;
//	}
//	public void setTAG_temperature(String TAG_temperature){
//	this.TAG_temperature=TAG_temperature;
//	}
//	public String getTAG_temperature(){
//		return TAG_temperature;
//	}
//	public void setTemperature_data(Long Temperature_data){
//	this.Temperature_data=Temperature_data;
//	}
//	public Long getTemperature_data(){
//		return Temperature_data;
//	}
//	public void setTAG_humidity(String TAG_humidity){
//	this.TAG_humidity=TAG_humidity;
//	}
//	public String getTAG_humidity(){
//		return TAG_humidity;
//	}
//	public void setHumidity_data(Long Humidity_data){
//	this.Humidity_data=Humidity_data;
//	}
//	public Long getHumidity_data(){
//		return Humidity_data;
//	}
//	public void setTAG_video(String TAG_video){
//	this.TAG_video=TAG_video;
//	}
//	public String getTAG_video(){
//		return TAG_video;
//	}
//	public void setVideo_message(String Video_message){
//	this.Video_message=Video_message;
//	}
//	public String getVideo_message(){
//		return Video_message;
//	}
//	public void setCrash_status(String Crash_status){
//	this.Crash_status=Crash_status;
//	}
//	public String getCrash_status(){
//		return Crash_status;
//	}
//	public void setCrash_status_message(String Crash_status_message){
//	this.Crash_status_message=Crash_status_message;
//	}
//	public String getCrash_status_message(){
//		return Crash_status_message;
//	}
//	public void setTAG_diagnose(String TAG_diagnose){
//	this.TAG_diagnose=TAG_diagnose;
//	}
//	public String getTAG_diagnose(){
//		return TAG_diagnose;
//	}
//	public void setDiagnose_message(String Diagnose_message){
//	this.Diagnose_message=Diagnose_message;
//	}
//	public String getDiagnose_message(){
//		return Diagnose_message;
//	}
//	public void setTAG_longitude(String TAG_longitude){
//	this.TAG_longitude=TAG_longitude;
//	}
//	public String getTAG_longitude(){
//		return TAG_longitude;
//	}
//	public void setLongitude(Long Longitude){
//	this.Longitude=Longitude;
//	}
//	public Long getLongitude(){
//		return Longitude;
//	}
//	public void setTAG_latitude(String TAG_latitude){
//	this.TAG_latitude=TAG_latitude;
//	}
//	public String getTAG_latitude(){
//		return TAG_latitude;
//	}
//	public void setLatitude(Long Latitude){
//	this.Latitude=Latitude;
//	}
//	public Long getLatitude(){
//		return Latitude;
//	}
//	public void setFluid_character(String Fluid_character){
//	this.Fluid_character=Fluid_character;
//	}
//	public String getFluid_character(){
//		return Fluid_character;
//	}
//	public void setCRC_HEX(String CRC_HEX){
//	this.CRC_HEX=CRC_HEX;
//	}
//	public String getCRC_HEX(){
//		return CRC_HEX;
//	}
}

