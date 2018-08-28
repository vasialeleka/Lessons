package com.vasialeleka.notebook;

public class NoteCounter {
    private int noteCount = 0;

    public int getNoteCount() {
        return noteCount;
    }

    void increase(){
        noteCount++;
    }

    void decrease(){
        noteCount--;
    }
}
