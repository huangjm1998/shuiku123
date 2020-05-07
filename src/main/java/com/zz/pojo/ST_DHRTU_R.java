package com.zz.pojo;

import java.sql.Date;

/**
 * @文件名称：ST_DHRTU_R.java
 * @创建时间：2020-04-10 15:56:32
 * @创 建  人：曾凡宇
 * @文件描述：ST_DHRTU_R 实体类
 * @文件版本：V0.01
 */


public class ST_DHRTU_R {
    private Integer id;
    private String STCD;
    private String EMTC;
    private String LGID;
    private String LGTP;
    private Long RSSINB;
    private Long RSSI4G;
    private Long SolarP_V;
    private Long SolarP_A;
    private Long Battery_V;
    private Long Battery_A;
    private Long ATMP;
    private Long AHR;
    private Long NBMOD;
    private String TILTXY;
    private String VIB;
    private String DIADT;
    private Date MODITIME;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD;
    }

    public String getSTCD() {
        return STCD;
    }

    public void setEMTC(String EMTC) {
        this.EMTC = EMTC;
    }

    public String getEMTC() {
        return EMTC;
    }

    public void setLGID(String LGID) {
        this.LGID = LGID;
    }

    public String getLGID() {
        return LGID;
    }

    public void setLGTP(String LGTP) {
        this.LGTP = LGTP;
    }

    public String getLGTP() {
        return LGTP;
    }

    public void setRSSINB(Long RSSINB) {
        this.RSSINB = RSSINB;
    }

    public Long getRSSINB() {
        return RSSINB;
    }

    public void setRSSI4G(Long RSSI4G) {
        this.RSSI4G = RSSI4G;
    }

    public Long getRSSI4G() {
        return RSSI4G;
    }

    public void setSolarP_V(Long SolarP_V) {
        this.SolarP_V = SolarP_V;
    }

    public Long getSolarP_V() {
        return SolarP_V;
    }

    public void setSolarP_A(Long SolarP_A) {
        this.SolarP_A = SolarP_A;
    }

    public Long getSolarP_A() {
        return SolarP_A;
    }

    public void setBattery_V(Long Battery_V) {
        this.Battery_V = Battery_V;
    }

    public Long getBattery_V() {
        return Battery_V;
    }

    public void setBattery_A(Long Battery_A) {
        this.Battery_A = Battery_A;
    }

    public Long getBattery_A() {
        return Battery_A;
    }

    public void setATMP(Long ATMP) {
        this.ATMP = ATMP;
    }

    public Long getATMP() {
        return ATMP;
    }

    public void setAHR(Long AHR) {
        this.AHR = AHR;
    }

    public Long getAHR() {
        return AHR;
    }

    public void setNBMOD(Long NBMOD) {
        this.NBMOD = NBMOD;
    }

    public Long getNBMOD() {
        return NBMOD;
    }

    public void setTILTXY(String TILTXY) {
        this.TILTXY = TILTXY;
    }

    public String getTILTXY() {
        return TILTXY;
    }

    public void setVIB(String VIB) {
        this.VIB = VIB;
    }

    public String getVIB() {
        return VIB;
    }

    public void setDIADT(String DIADT) {
        this.DIADT = DIADT;
    }

    public String getDIADT() {
        return DIADT;
    }

    public void setMODITIME(Date MODITIME) {
        this.MODITIME = MODITIME;
    }

    public Date getMODITIME() {
        return MODITIME;
    }
}

