package com.designw.model;

public class Wordss {
    private Integer workssId;
    private Integer wordsId;
    private String workssData;
    private String workssTime;

    public Integer getWorkssId() {
        return workssId;
    }

    public void setWorkssId(Integer workssId) {
        this.workssId = workssId;
    }

    public String getWorkssData() {
        return workssData;
    }

    public void setWorkssData(String workssData) {
        this.workssData = workssData;
    }

    public String getWorkssTime() {
        return workssTime;
    }

    public void setWorkssTime(String workssTime) {
        this.workssTime = workssTime;
    }

    public Integer getWordsId() {
        return wordsId;
    }

    public void setWordsId(Integer wordsId) {
        this.wordsId = wordsId;
    }

    @Override
    public String toString() {
        return "Wordss{" +
                "workssId=" + workssId +
                ", wordsId=" + wordsId +
                ", workssData='" + workssData + '\'' +
                ", workssTime='" + workssTime + '\'' +
                '}';
    }
}
