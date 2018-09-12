package com.vasialeleka.note;


public class Note {
    String content;
    static int  countOfNotes=0;

    public static void increaseCount(){countOfNotes++;}

    public static void decreaseCount() {countOfNotes--;}



    public  String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Note(String content) {
        this.content = content;
    }

    public Note() {
    }
}