package com.vasialeleka.note;
import java.util.Scanner;

public class NoteOptions {

    public static void AddNewNote(Note[] notes){
        //NoteOptions.AddNewNote( notes);
        System.out.println("Enter the note:");


        Scanner scanForNote = new Scanner(System.in);

        String note = scanForNote.nextLine();
        notes[Note.countOfNotes] = new Note();
        notes[Note.countOfNotes].setContent(note);

        Note.increaseCount();

    }

    public static void ShowAllNotes (Note[] notes)
    {
        for (int i = 0; i < Note.countOfNotes; i++) {
            System.out.println(notes[i].getContent());
        }
    }
}
