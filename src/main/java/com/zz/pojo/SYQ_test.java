package com.zz.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;


/**
 * @文件名称：SYQ_test.java
 * @创建时间：2020-04-10 16:10:40
 * @创 建  人：曾凡宇
 * @文件描述：SYQ_test 实体类
 * @文件版本：V0.01
 */

@Data
@Accessors(chain = true)
public class SYQ_test {
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
    private Date DATAmessage;
    private String TAGstation;
    private Long Nstation;
    private String Tstation;
    private String TAGDATE;
    private Date DATEobservation;
    private String TAGwater;
    private Double Lwater;
    private String TAGrainfall;
    private Double Cumulative_rainfal;
    private String Curve_precipitation;
    private Double Eight_Now_precipitation;
    private String TAGvoltage;
    private Double Voltage_data;
    private String TAGelectricity;
    private Double Ectricity_data;
    private String TAGVE;
    private Double VE_data;
    private String TAGE_battery;
    private Double Battery_current_data;
    private String TAG_IOT;
    private String IOT_strength;
    private String TAG_signal;
    private String Signal_strength;
    private String TAG_temperature;
    private Double Temperature_data;
    private String TAG_humidity;
    private Double Humidity_data;
    private String fluid_character;
    private String CRC_HEX;
    private String RSNM;
    private String Type = "译文";

}

