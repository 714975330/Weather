package com.fastweather.app.fastweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yuxiang on 2017/10/18.
 */

public class Province extends DataSupport {

    private String id;

    private String provinceName;

    private int provinceCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}