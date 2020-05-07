package com.zz.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @文件名称：SYQ_picture_plus.java
 * @创建时间：2020-04-10 16:02:00
 * @创 建  人：曾凡宇
 * @文件描述：SYQ_picture_plus 实体类
 * @文件版本：V0.01
 */

@Data
@Accessors(chain = true)
public class SYQ_picture_plus {
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
    private String DATAmessage;
    private String TAGstation;
    private String Nstation;
    private String Tstation;
    private String TAG_picture;
    private String Photograph_message;
    private String Fluid_character;
    private String CRC_HEX;
    private String RSNM;
    private String Type = "译文";

    //图片大小
    private double IMGSZ;
    //图片名称
    private String IMGNM;
    //图片后缀名
    private String IMGTP = ".jpg";
    //图片路径
    private String IMGPH;
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
//	public void setTAG_picture(String TAG_picture){
//	this.TAG_picture=TAG_picture;
//	}
//	public String getTAG_picture(){
//		return TAG_picture;
//	}
//	public void setPhotograph_message(String Photograph_message){
//	this.Photograph_message=Photograph_message;
//	}
//	public String getPhotograph_message(){
//		return Photograph_message;
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

