package com.vasialeleka.notebook;

import java.util.Scanner;

public class NoteService {
    private NoteCounter noteCounter = new NoteCounter();

    public void deleteNote(Note[] notes, int noteNumber) {
        final int noteCount = noteCounter.getNoteCount();
        if (noteNumber > noteCount) {
            System.out.println("This number of note does not exit");
            return;
        }
        for (int i = noteNumber; i <= noteCount; i++) {
            notes[i-1] = notes[i];
            notes[i-2].setNumberInList(i-1);
        }
        noteCounter.decrease();
    }

    public void listOfNotes(Note[] notes) {
        for (int i = 0; i < noteCounter.getNoteCount(); i++) {
            System.out.println(notes[i]);
        }
    }

    public void addNote(Note[] notes, String content) {
        Note note = new Note();
        note.setNumberInList(noteCounter.getNoteCount() + 1);
        note.setContent(content);
        notes[noteCounter.getNoteCount()] = note;
        noteCounter.increase();
    }


    public void changeNote(Note[] notes) {
        for (int i = 0; i < noteCounter.getNoteCount(); i++) {

                System.out.println( notes[i]);
                System.out.println();

        }
        System.out.println("Chose note what you want to change:");
        Scanner change = new Scanner(System.in);
        int ch = change.nextInt();
        for (int i = 0; i < noteCounter.getNoteCount(); i++) {
            if (ch == (i + 1)) {
                System.out.println("Push 1 if you want to add words to you note.\n 2 - if you want to create new from begin.\n 3-close");
                Scanner changeNote = new Scanner(System.in);
                int changedNote = changeNote.nextInt();
                if (changedNote == 1) {
                    System.out.print(notes[i]);
                    Scanner newNote = new Scanner(System.in);
                    String addToNote = newNote.nextLine();
                    notes[i].setContent(addToNote);
                    System.out.println(notes[i]);

                } else if (changedNote == 2) {
                    System.out.println();
                    System.out.println("Enter new note:");
                    Scanner newNote = new Scanner(System.in);
                    notes[i].setContent(newNote.nextLine());
                } else {
                    break;
                }
            }
        }


    }
}
