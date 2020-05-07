package com.zz.pojo;

import java.sql.Date;

/**
 * @文件名称：ST_NVR_LOG.java
 * @创建时间：2020-04-10 15:56:52
 * @创 建  人：曾凡宇
 * @文件描述：ST_NVR_LOG 实体类
 * @文件版本：V0.01
 */


public class ST_NVR_LOG {
    private Integer id;
    private String STCD;
    private String NVRID;
    private Date BTIME;
    private String RUNTP;
    private String VSTAT;
    private String VDSS;
    private Date UTIME;
    private Date ETIME;

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

    public void setNVRID(String NVRID) {
        this.NVRID = NVRID;
    }

    public String getNVRID() {
        return NVRID;
    }

    public void setBTIME(Date BTIME) {
        this.BTIME = BTIME;
    }

    public Date getBTIME() {
        return BTIME;
    }

    public void setRUNTP(String RUNTP) {
        this.RUNTP = RUNTP;
    }

    public String getRUNTP() {
        return RUNTP;
    }

    public void setVSTAT(String VSTAT) {
        this.VSTAT = VSTAT;
    }

    public String getVSTAT() {
        return VSTAT;
    }

    public void setVDSS(String VDSS) {
        this.VDSS = VDSS;
    }

    public String getVDSS() {
        return VDSS;
    }

    public void setUTIME(Date UTIME) {
        this.UTIME = UTIME;
    }

    public Date getUTIME() {
        return UTIME;
    }

    public void setETIME(Date ETIME) {
        this.ETIME = ETIME;
    }

    public Date getETIME() {
        return ETIME;
    }
}

