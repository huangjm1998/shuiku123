package com.zz.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @文件名称：SYQ_plus.java
 * @创建时间：2020-04-10 16:02:27
 * @创 建  人：曾凡宇
 * @文件描述：SYQ_plus 实体类
 * @文件版本：V0.01
 */

@Data
@Accessors(chain = true)
public class SYQ_plus {
    private Integer id;
    private String FH;
    private String Cstation;
    private String TENstation;
    private String PassWord;
    private String TZmessage;
    private String Lmessage;
    private String Smessage;
    private String Nwater;
    private String TAG;
    private String IOT;
    private String DATAmessage;
    private String TAGstation;
    private String Nstation;
    private String Tstation;
    private String TAGDATE;
    private String DATEobservation;
    private String TAGwater;
    private double Lwater;
    private String TAGrainfall;
    private double Cumulative_rainfal;
    private String Curve_precipitation;
    private double Eight_Now_precipitation;
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
    private String TAG_incline;
    private String incline_message;
    private String TAG_crash;
    private String crash_message;
    private String fluid_character;
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
//	public void setTZmessage(String TZmessage){
//	this.TZmessage=TZmessage;
//	}
//	public String getTZmessage(){
//		return TZmessage;
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
//	public void setTAGDATE(String TAGDATE){
//	this.TAGDATE=TAGDATE;
//	}
//	public String getTAGDATE(){
//		return TAGDATE;
//	}
//	public void setDATEobservation(Long DATEobservation){
//	this.DATEobservation=DATEobservation;
//	}
//	public Long getDATEobservation(){
//		return DATEobservation;
//	}
//	public void setTAGwater(String TAGwater){
//	this.TAGwater=TAGwater;
//	}
//	public String getTAGwater(){
//		return TAGwater;
//	}
//	public void setLwater(Long Lwater){
//	this.Lwater=Lwater;
//	}
//	public Long getLwater(){
//		return Lwater;
//	}
//	public void setTAGrainfall(String TAGrainfall){
//	this.TAGrainfall=TAGrainfall;
//	}
//	public String getTAGrainfall(){
//		return TAGrainfall;
//	}
//	public void setCumulative_rainfal(Long Cumulative_rainfal){
//	this.Cumulative_rainfal=Cumulative_rainfal;
//	}
//	public Long getCumulative_rainfal(){
//		return Cumulative_rainfal;
//	}
//	public void setCurve_precipitation(String Curve_precipitation){
//	this.Curve_precipitation=Curve_precipitation;
//	}
//	public String getCurve_precipitation(){
//		return Curve_precipitation;
//	}
//	public void setEight_Now_precipitation(Long Eight_Now_precipitation){
//	this.Eight_Now_precipitation=Eight_Now_precipitation;
//	}
//	public Long getEight_Now_precipitation(){
//		return Eight_Now_precipitation;
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
//	public void setTAG_incline(String TAG_incline){
//	this.TAG_incline=TAG_incline;
//	}
//	public String getTAG_incline(){
//		return TAG_incline;
//	}
//	public void setIncline_message(String incline_message){
//	this.incline_message=incline_message;
//	}
//	public String getIncline_message(){
//		return incline_message;
//	}
//	public void setTAG_crash(String TAG_crash){
//	this.TAG_crash=TAG_crash;
//	}
//	public String getTAG_crash(){
//		return TAG_crash;
//	}
//	public void setCrash_message(String crash_message){
//	this.crash_message=crash_message;
//	}
//	public String getCrash_message(){
//		return crash_message;
//	}
//	public void setFluid_character(String fluid_character){
//	this.fluid_character=fluid_character;
//	}
//	public String getFluid_character(){
//		return fluid_character;
//	}
//	public void setCRC_HEX(String CRC_HEX){
//	this.CRC_HEX=CRC_HEX;
//	}
//	public String getCRC_HEX(){
//		return CRC_HEX;
//	}
}

