package com.zz.pojo;

import java.sql.Date;

/**
 * @文件名称：ST_PPTN_R.java
 * @创建时间：2020-04-10 15:57:48
 * @创 建  人：曾凡宇
 * @文件描述：ST_PPTN_R 实体类
 * @文件版本：V0.01
 */


public class ST_PPTN_R {
    private Integer id;
    private String STCD;
    private Long DRP;
    private Long INTV;
    private Long PDR;
    private Long DYP;
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

    public void setDRP(Long DRP) {
        this.DRP = DRP;
    }

    public Long getDRP() {
        return DRP;
    }

    public void setINTV(Long INTV) {
        this.INTV = INTV;
    }

    public Long getINTV() {
        return INTV;
    }

    public void setPDR(Long PDR) {
        this.PDR = PDR;
    }

    public Long getPDR() {
        return PDR;
    }

    public void setDYP(Long DYP) {
        this.DYP = DYP;
    }

    public Long getDYP() {
        return DYP;
    }

    public void setMODITIME(Date MODITIME) {
        this.MODITIME = MODITIME;
    }

    public Date getMODITIME() {
        return MODITIME;
    }
}

