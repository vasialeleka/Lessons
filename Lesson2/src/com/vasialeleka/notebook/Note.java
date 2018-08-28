package com.vasialeleka.notebook;

public class Note {
    private int numberInList;
    private String content;

    public int getNumberInList() {
        return numberInList;
    }

    public void setNumberInList(int numberInList) { this.numberInList = numberInList; }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Note "+numberInList + ": " + content;
    }
}
