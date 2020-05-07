package com.zz.pojo;

/**
 * @文件名称：SENRAIN_PARAM.java
 * @创建时间：2020-04-10 15:56:11
 * @创 建  人：曾凡宇
 * @文件描述：SENRAIN_PARAM 实体类
 * @文件版本：V0.01
 */


public class SENRAIN_PARAM {
    private Integer id;
    private String STCD;
    private String SENRTC;
    private Long RNKD;
    private Long RNRI;
    private Long RNSI;
    private Long RNTH;
    private Long RDaybHour;

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

    public void setSENRTC(String SENRTC) {
        this.SENRTC = SENRTC;
    }

    public String getSENRTC() {
        return SENRTC;
    }

    public void setRNKD(Long RNKD) {
        this.RNKD = RNKD;
    }

    public Long getRNKD() {
        return RNKD;
    }

    public void setRNRI(Long RNRI) {
        this.RNRI = RNRI;
    }

    public Long getRNRI() {
        return RNRI;
    }

    public void setRNSI(Long RNSI) {
        this.RNSI = RNSI;
    }

    public Long getRNSI() {
        return RNSI;
    }

    public void setRNTH(Long RNTH) {
        this.RNTH = RNTH;
    }

    public Long getRNTH() {
        return RNTH;
    }

    public void setRDaybHour(Long RDaybHour) {
        this.RDaybHour = RDaybHour;
    }

    public Long getRDaybHour() {
        return RDaybHour;
    }
}

