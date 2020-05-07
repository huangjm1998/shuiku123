package com.zz.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;


/**
 * @文件名称：SYQ_heartbeat.java
 * @创建时间：2020-04-10 16:01:18
 * @创 建  人：曾凡宇
 * @文件描述：SYQ_heartbeat 实体类
 * @文件版本：V0.01
 */

@Data
@Accessors(chain = true)
public class SYQ_heartbeat {
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
    private Date DATEmessage;
    private String Fcharacter;
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
//	public void setDATEmessage(Date DATEmessage){
//	this.DATEmessage=DATEmessage;
//	}
//	public Date getDATEmessage(){
//		return DATEmessage;
//	}
//	public void setFcharacter(String Fcharacter){
//	this.Fcharacter=Fcharacter;
//	}
//	public String getFcharacter(){
//		return Fcharacter;
//	}
//	public void setCRC_HEX(String CRC_HEX){
//	this.CRC_HEX=CRC_HEX;
//	}
//	public String getCRC_HEX(){
//		return CRC_HEX;
//	}
}

