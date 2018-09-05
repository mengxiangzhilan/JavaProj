package com.designw.model;

public class Datas {
    private Integer grad_id;
    private Integer duId;
    private String duName;
    private String duPath;
    private String duTime;


    public Integer getGrad_id() {
        return grad_id;
    }

    public void setGrad_id(Integer grad_id) {
        this.grad_id = grad_id;
    }

    public Integer getDuId() {
        return duId;
    }

    public void setDuId(Integer duId) {
        this.duId = duId;
    }

    public String getDuName() {
        return duName;
    }

    public void setDuName(String duName) {
        this.duName = duName;
    }

    public String getDuPath() {
        return duPath;
    }

    public void setDuPath(String duPath) {
        this.duPath = duPath;
    }

    public String getDuTime() {
        return duTime;
    }

    public void setDuTime(String duTime) {
        this.duTime = duTime;
    }

    @Override
    public String toString() {
        return "Datas{" +
                "grad_id=" + grad_id +
                ", duId=" + duId +
                ", duName='" + duName + '\'' +
                ", duPath='" + duPath + '\'' +
                ", duTime='" + duTime + '\'' +
                '}';
    }
}
