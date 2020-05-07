package com.zz.pojo;

import java.sql.Date;

/**
 * @文件名称：ST_RSVRFCCH_B.java
 * @创建时间：2020-04-10 15:59:01
 * @创 建  人：曾凡宇
 * @文件描述：ST_RSVRFCCH_B 实体类
 * @文件版本：V0.01
 */


public class ST_RSVRFCCH_B {
    private Integer id;
    private String ADDVCD;
    private String RSVRTP;
    private String STCD;
    private String RRNM;
    private Long LGTD;
    private Long STLC;
    private String ADDR;
    private String SRTP;
    private Date SRTM;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setADDVCD(String ADDVCD) {
        this.ADDVCD = ADDVCD;
    }

    public String getADDVCD() {
        return ADDVCD;
    }

    public void setRSVRTP(String RSVRTP) {
        this.RSVRTP = RSVRTP;
    }

    public String getRSVRTP() {
        return RSVRTP;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD;
    }

    public String getSTCD() {
        return STCD;
    }

    public void setRRNM(String RRNM) {
        this.RRNM = RRNM;
    }

    public String getRRNM() {
        return RRNM;
    }

    public void setLGTD(Long LGTD) {
        this.LGTD = LGTD;
    }

    public Long getLGTD() {
        return LGTD;
    }

    public void setSTLC(Long STLC) {
        this.STLC = STLC;
    }

    public Long getSTLC() {
        return STLC;
    }

    public void setADDR(String ADDR) {
        this.ADDR = ADDR;
    }

    public String getADDR() {
        return ADDR;
    }

    public void setSRTP(String SRTP) {
        this.SRTP = SRTP;
    }

    public String getSRTP() {
        return SRTP;
    }

    public void setSRTM(Date SRTM) {
        this.SRTM = SRTM;
    }

    public Date getSRTM() {
        return SRTM;
    }
}

