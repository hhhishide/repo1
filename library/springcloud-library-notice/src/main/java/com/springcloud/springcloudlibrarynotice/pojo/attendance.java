package com.springcloud.springcloudlibrarynotice.pojo;

import java.sql.Time;
import java.util.Date;

/**
 * 出勤类
 */
public class attendance {
    private int id;
    private int userid;
    private String morning_time;
    private String evening_time;
    private int morning_state;
    private int evening_state;
    private String Ondate;

    public String getOndate() {
        return Ondate;
    }

    public void setOndate(String ondate) {
        Ondate = ondate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getMorning_time() {
        return morning_time;
    }

    public void setMorning_time(String morning_time) {
        this.morning_time = morning_time;
    }

    public String getEvening_time() {
        return evening_time;
    }

    public void setEvening_time(String evening_time) {
        this.evening_time = evening_time;
    }

    public int getMorning_state() {
        return morning_state;
    }

    public void setMorning_state(int morning_state) {
        this.morning_state = morning_state;
    }

    public int getEvening_state() {
        return evening_state;
    }

    public void setEvening_state(int evening_state) {
        this.evening_state = evening_state;
    }
}
