package com.designw.model;

public class GraduationScore {
    private Integer gradscoreId;
    private Integer gradId;
    private String gradscoreAssess;

    public Integer getGradscoreId() {
        return gradscoreId;
    }

    public void setGradscoreId(Integer gradscoreId) {
        this.gradscoreId = gradscoreId;
    }

    public Integer getGradId() {
        return gradId;
    }

    public void setGradId(Integer gradId) {
        this.gradId = gradId;
    }

    public String getGradscoreAssess() {
        return gradscoreAssess;
    }

    public void setGradscoreAssess(String gradscoreAssess) {
        this.gradscoreAssess = gradscoreAssess;
    }

    @Override
    public String toString() {
        return "GraduationScore{" +
                "gradscoreId=" + gradscoreId +
                ", gradId=" + gradId +
                ", gradscoreAssess='" + gradscoreAssess + '\'' +
                '}';
    }
}
