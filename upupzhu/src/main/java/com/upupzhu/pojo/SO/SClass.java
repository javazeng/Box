package com.upupzhu.pojo.SO;

import java.util.List;

public class SClass {
    private long classId;
    private String className;
    private List<Subentry> subentrys;

    public long getClassId() {
        return classId;
    }

    public void setClassId(long classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Subentry> getSubentrys() {
        return subentrys;
    }

    public void setSubentrys(List<Subentry> subentrys) {
        this.subentrys = subentrys;
    }
}
