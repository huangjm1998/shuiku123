package com.zz.pojo;

import java.sql.Date;

/**
 * @文件名称：ST_PICTURE_R.java
 * @创建时间：2020-04-10 15:57:23
 * @创 建  人：曾凡宇
 * @文件描述：ST_PICTURE_R 实体类
 * @文件版本：V0.01
 */


public class ST_PICTURE_R {
    private Integer id;
    private String STCD;
    private Date MODITIME;
    private String IMGNM;
    private String IMGTP;
    private Long IMGSZ;
    private String IMGPH;
    private String IMGURL;

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

    public void setMODITIME(Date MODITIME) {
        this.MODITIME = MODITIME;
    }

    public Date getMODITIME() {
        return MODITIME;
    }

    public void setIMGNM(String IMGNM) {
        this.IMGNM = IMGNM;
    }

    public String getIMGNM() {
        return IMGNM;
    }

    public void setIMGTP(String IMGTP) {
        this.IMGTP = IMGTP;
    }

    public String getIMGTP() {
        return IMGTP;
    }

    public void setIMGSZ(Long IMGSZ) {
        this.IMGSZ = IMGSZ;
    }

    public Long getIMGSZ() {
        return IMGSZ;
    }

    public void setIMGPH(String IMGPH) {
        this.IMGPH = IMGPH;
    }

    public String getIMGPH() {
        return IMGPH;
    }

    public void setIMGURL(String IMGURL) {
        this.IMGURL = IMGURL;
    }

    public String getIMGURL() {
        return IMGURL;
    }
}

