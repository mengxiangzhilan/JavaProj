package com.designw.model;

public class Words {
    private Integer worderId;
    private Integer wordsId;

    public Integer getWorderId() {
        return worderId;
    }

    public void setWorderId(Integer worderId) {
        this.worderId = worderId;
    }

    public Integer getWordsId() {
        return wordsId;
    }

    public void setWordsId(Integer wordsId) {
        this.wordsId = wordsId;
    }



    @Override
    public String toString() {
        return "Words{" +
                "worderId=" + worderId +
                ", wordsId=" + wordsId +
                '}';
    }
}
