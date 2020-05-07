package com.zz.pojo;

/**
 * @文件名称：VDRHOST_PARAM.java
 * @创建时间：2020-04-10 16:12:58
 * @创 建  人：曾凡宇
 * @文件描述：VDRHOST_PARAM 实体类
 * @文件版本：V0.01
 */


public class VDRHOST_PARAM {
    private Integer id;
    private String STCD;
    private String VDCD;
    private Long IMGRI;
    private String IMGSZ;
    private String IMGURL;
    private Long UPTI;
    private String VDSS;
    private String VDURL;
    private Long ATCTI;

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

    public void setVDCD(String VDCD) {
        this.VDCD = VDCD;
    }

    public String getVDCD() {
        return VDCD;
    }

    public void setIMGRI(Long IMGRI) {
        this.IMGRI = IMGRI;
    }

    public Long getIMGRI() {
        return IMGRI;
    }

    public void setIMGSZ(String IMGSZ) {
        this.IMGSZ = IMGSZ;
    }

    public String getIMGSZ() {
        return IMGSZ;
    }

    public void setIMGURL(String IMGURL) {
        this.IMGURL = IMGURL;
    }

    public String getIMGURL() {
        return IMGURL;
    }

    public void setUPTI(Long UPTI) {
        this.UPTI = UPTI;
    }

    public Long getUPTI() {
        return UPTI;
    }

    public void setVDSS(String VDSS) {
        this.VDSS = VDSS;
    }

    public String getVDSS() {
        return VDSS;
    }

    public void setVDURL(String VDURL) {
        this.VDURL = VDURL;
    }

    public String getVDURL() {
        return VDURL;
    }

    public void setATCTI(Long ATCTI) {
        this.ATCTI = ATCTI;
    }

    public Long getATCTI() {
        return ATCTI;
    }
}

