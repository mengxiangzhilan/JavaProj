package com.designw.model;

import java.util.List;

public class GraduationNew  {
    private Integer SUM;
    private Graduation graduation;
    private List<GraduationScore> graduationScoreList;
    public Integer getSUM() {
        return SUM;
    }

    public void setSUM(Integer SUM) {
        this.SUM = SUM;
    }

    public Graduation getGraduation() {
        return graduation;
    }

    public void setGraduation(Graduation graduation) {
        this.graduation = graduation;
    }

    public List<GraduationScore> getGraduationScoreList() {
        return graduationScoreList;
    }

    public void setGraduationScoreList(List<GraduationScore> graduationScoreList) {
        this.graduationScoreList = graduationScoreList;
    }

    @Override
    public String toString() {
        return "GraduationNew{" +
                "SUM=" + SUM +
                ", graduation=" + graduation +
                ", graduationScoreList=" + graduationScoreList +
                '}';
    }
}
