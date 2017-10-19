package com.fastweather.app.fastweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yuxiang on 2017/10/18.
 */

public class Conunty extends DataSupport{

    private int id;

    private String conuntyName;

    private int weatherId;

    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConuntyName() {
        return conuntyName;
    }

    public void setConuntyName(String conuntyName) {
        this.conuntyName = conuntyName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
