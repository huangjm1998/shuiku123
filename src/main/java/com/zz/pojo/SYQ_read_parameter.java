package com.zz.pojo;

import lombok.Data;

/**
 * @文件名称：SYQ_read_parameter.java
 * @创建时间：2020-04-10 16:03:50
 * @创 建  人：曾凡宇
 * @文件描述：SYQ_read_parameter 实体类
 * @文件版本：V0.01
 */

@Data
public class SYQ_read_parameter {
    private Integer id;
    private String FH;
    private String Caddress;
    private String TENstation;
    private String PassWord;
    private String Function_Code;
    private String Lmessage;
    private String Smessage;
    private String Nwater;
    private String TAG;
    private String IOT;
    private String DATAmessage;
    private String TAGstation;
    private String Nstation;
    private String TAG_interval_hour;
    private Long Nhour;
    private String TAG_interval_plus;
    private Long Nminute;
    private String TAG_start_day;
    private Long DAY_nhour;
    private String TAG_rainfall_plus;
    private String Nmillimeter;
    private String TAG_Water_based;
    private Long Nmeter;
    private String TAG_alter_water;
    private Long Alert_Nmeter;
    private String TAG_plus_water;
    private Long Plus_Nmeter;
    private String TAG_above;
    private Long Above_Nmeter;
    private String TAG_under;
    private Long Under_Nmeter;
    private String TAG_incline_plus;
    private Long Ndegree;
    private String TAG_crash_plus;
    private Long NG;
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
//	public void setCaddress(String Caddress){
//	this.Caddress=Caddress;
//	}
//	public String getCaddress(){
//		return Caddress;
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
//	public void setTAG_interval_hour(String TAG_interval_hour){
//	this.TAG_interval_hour=TAG_interval_hour;
//	}
//	public String getTAG_interval_hour(){
//		return TAG_interval_hour;
//	}
//	public void setNhour(Long Nhour){
//	this.Nhour=Nhour;
//	}
//	public Long getNhour(){
//		return Nhour;
//	}
//	public void setTAG_interval_plus(String TAG_interval_plus){
//	this.TAG_interval_plus=TAG_interval_plus;
//	}
//	public String getTAG_interval_plus(){
//		return TAG_interval_plus;
//	}
//	public void setNminute(Long Nminute){
//	this.Nminute=Nminute;
//	}
//	public Long getNminute(){
//		return Nminute;
//	}
//	public void setTAG_start_day(String TAG_start_day){
//	this.TAG_start_day=TAG_start_day;
//	}
//	public String getTAG_start_day(){
//		return TAG_start_day;
//	}
//	public void setDAY_nhour(Long DAY_nhour){
//	this.DAY_nhour=DAY_nhour;
//	}
//	public Long getDAY_nhour(){
//		return DAY_nhour;
//	}
//	public void setTAG_rainfall_plus(String TAG_rainfall_plus){
//	this.TAG_rainfall_plus=TAG_rainfall_plus;
//	}
//	public String getTAG_rainfall_plus(){
//		return TAG_rainfall_plus;
//	}
//	public void setNmillimeter(Long Nmillimeter){
//	this.Nmillimeter=Nmillimeter;
//	}
//	public Long getNmillimeter(){
//		return Nmillimeter;
//	}
//	public void setTAG_Water_based(String TAG_Water_based){
//	this.TAG_Water_based=TAG_Water_based;
//	}
//	public String getTAG_Water_based(){
//		return TAG_Water_based;
//	}
//	public void setNmeter(Long Nmeter){
//	this.Nmeter=Nmeter;
//	}
//	public Long getNmeter(){
//		return Nmeter;
//	}
//	public void setTAG_alter_water(String TAG_alter_water){
//	this.TAG_alter_water=TAG_alter_water;
//	}
//	public String getTAG_alter_water(){
//		return TAG_alter_water;
//	}
//	public void setAlert_Nmeter(Long Alert_Nmeter){
//	this.Alert_Nmeter=Alert_Nmeter;
//	}
//	public Long getAlert_Nmeter(){
//		return Alert_Nmeter;
//	}
//	public void setTAG_plus_water(String TAG_plus_water){
//	this.TAG_plus_water=TAG_plus_water;
//	}
//	public String getTAG_plus_water(){
//		return TAG_plus_water;
//	}
//	public void setPlus_Nmeter(Long Plus_Nmeter){
//	this.Plus_Nmeter=Plus_Nmeter;
//	}
//	public Long getPlus_Nmeter(){
//		return Plus_Nmeter;
//	}
//	public void setTAG_above(String TAG_above){
//	this.TAG_above=TAG_above;
//	}
//	public String getTAG_above(){
//		return TAG_above;
//	}
//	public void setAbove_Nmeter(Long Above_Nmeter){
//	this.Above_Nmeter=Above_Nmeter;
//	}
//	public Long getAbove_Nmeter(){
//		return Above_Nmeter;
//	}
//	public void setTAG_under(String TAG_under){
//	this.TAG_under=TAG_under;
//	}
//	public String getTAG_under(){
//		return TAG_under;
//	}
//	public void setUnder_Nmeter(Long Under_Nmeter){
//	this.Under_Nmeter=Under_Nmeter;
//	}
//	public Long getUnder_Nmeter(){
//		return Under_Nmeter;
//	}
//	public void setTAG_incline_plus(String TAG_incline_plus){
//	this.TAG_incline_plus=TAG_incline_plus;
//	}
//	public String getTAG_incline_plus(){
//		return TAG_incline_plus;
//	}
//	public void setNdegree(Long Ndegree){
//	this.Ndegree=Ndegree;
//	}
//	public Long getNdegree(){
//		return Ndegree;
//	}
//	public void setTAG_crash_plus(String TAG_crash_plus){
//	this.TAG_crash_plus=TAG_crash_plus;
//	}
//	public String getTAG_crash_plus(){
//		return TAG_crash_plus;
//	}
//	public void setNG(Long NG){
//	this.NG=NG;
//	}
//	public Long getNG(){
//		return NG;
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

