package com.amaoamao.cninfo.constant;

public enum Plate {
    sz(
            "sz;", "深市公司"
    ), szmb(
            "szmb;", "深市主板"
    ), szzx(
            "szzx;", "中小板"
    ), szcy(
            "szcy;", "创业板"
    ), shmb(
            "shmb;", "沪市主板"
    );

    /**
     * Copyright (c) 2017 Peter Mao). All rights reserved.
     * Created by mao on 17-2-22.
     */
    private String plateName;
    private String des;

    Plate(String catName, String des) {
        this.plateName = catName;
        this.des = des;

    }

    public String getPlateName() {
        return plateName;
    }

    @Override
    public String toString() {
        return plateName;
    }

    public String getDes() {
        return des;
    }
}
