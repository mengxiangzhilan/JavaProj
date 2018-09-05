package com.designw.model;

public class Details {
    private Integer detailsId;
    private String datailsData;
    private String datailsScore;
    private Integer gradscore_id;
    public Integer getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(Integer detailsId) {
        this.detailsId = detailsId;
    }

    public String getDatailsData() {
        return datailsData;
    }

    public void setDatailsData(String datailsData) {
        this.datailsData = datailsData;
    }

    public String getDatailsScore() {
        return datailsScore;
    }

    public void setDatailsScore(String datailsScore) {
        this.datailsScore = datailsScore;
    }

    public Integer getGradscore_id() {
        return gradscore_id;
    }

    public void setGradscore_id(Integer gradscore_id) {
        this.gradscore_id = gradscore_id;
    }

    @Override
    public String toString() {
        return "Details{" +
                "detailsId=" + detailsId +
                ", datailsData='" + datailsData + '\'' +
                ", datailsScore='" + datailsScore + '\'' +
                ", gradscore_id=" + gradscore_id +
                '}';
    }
}
