package com.zz.pojo;

import java.sql.Date;

/**
 * @文件名称：ST_RSVR_R.java
 * @创建时间：2020-04-10 15:58:44
 * @创 建  人：曾凡宇
 * @文件描述：ST_RSVR_R 实体类
 * @文件版本：V0.01
 */


public class ST_RSVR_R {
    private Integer id;
    private String STCD;
    private Date MODITIME;
    private Long RZ;
    private Long INQ;
    private Long W;
    private Long BLRZ;
    private Long OTQ;
    private String RWCHRCD;
    private String RWPTN;

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

    public void setRZ(Long RZ) {
        this.RZ = RZ;
    }

    public Long getRZ() {
        return RZ;
    }

    public void setINQ(Long INQ) {
        this.INQ = INQ;
    }

    public Long getINQ() {
        return INQ;
    }

    public void setW(Long W) {
        this.W = W;
    }

    public Long getW() {
        return W;
    }

    public void setBLRZ(Long BLRZ) {
        this.BLRZ = BLRZ;
    }

    public Long getBLRZ() {
        return BLRZ;
    }

    public void setOTQ(Long OTQ) {
        this.OTQ = OTQ;
    }

    public Long getOTQ() {
        return OTQ;
    }

    public void setRWCHRCD(String RWCHRCD) {
        this.RWCHRCD = RWCHRCD;
    }

    public String getRWCHRCD() {
        return RWCHRCD;
    }

    public void setRWPTN(String RWPTN) {
        this.RWPTN = RWPTN;
    }

    public String getRWPTN() {
        return RWPTN;
    }
}

