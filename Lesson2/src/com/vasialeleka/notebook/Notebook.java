package com.vasialeleka.notebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notebook {

    public static void main(String[] args) {

        String[] notes = new String[100];
        int countOfNotes = 0;
        while (true) {

            System.out.println("Push 1 for new note.\n 2 - see all notes.\n 3 - delete .\n4 - change note.");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            if (n == 1) {
                countOfNotes = writeOfNotes(notes, countOfNotes);
            } else if (n == 2) {
                showNotes(notes, countOfNotes);
            } else if (n == 3) {
                showNotes(notes, countOfNotes);
                countOfNotes = delete(notes, countOfNotes);
            } else if (n == 4) {
                System.out.println("4");
                for (int i = 0; i < notes.length; i++) {
                    if (notes[i] == null) {
                        break;
                    } else {
                        System.out.println("Note " + (i + 1) + ":" + notes[i]);
                        System.out.println();
                    }
                }
                System.out.println("Chose note what you want to change:");
                Scanner change = new Scanner(System.in);
                int ch = change.nextInt();
                for (int i = 0; i < countOfNotes; i++) {
                    if (ch == (i + 1)) {
                        //  System.out.println(notes[i]);

                        //System.out.println();
                        //System.out.println();



                    System.out.println("Push 1 if you want to add words to you note.\n 2 - if you want to create new from begin.\n 3-close");
                    Scanner changeNote = new Scanner(System.in);
                    int changedNote = changeNote.nextInt();
                    if (changedNote == 1) {
                       // char[] charNote = notes[i].toCharArray();

                        //for (int countOfSymbols = 0; countOfSymbols < charNote.length; countOfSymbols++) {
                          //  System.out.print(charNote[countOfSymbols]);

                        //}
                        System.out.print(notes[i]);
                        Scanner newNote = new Scanner(System.in);
                        String addToNote = newNote.nextLine();
                        notes[i] = notes[i] + addToNote;
                        System.out.println(notes[i]);

                    } else if (changedNote == 2) {
                        System.out.println();
                        System.out.println("Enter new note:");
                        Scanner newNote = new Scanner(System.in);
                        notes[i] = newNote.nextLine();
                    } else{break;}}
                }


            } else {
                break;
            }

        }
    }

    private static int delete(String[] notes, int countOfNotes) {
        System.out.println("Choose what note you want to delete :");
        Scanner delete = new Scanner(System.in);
        int del = delete.nextInt();
        for (int i = 0; i < countOfNotes; i++) {
            if (del == (i + 1)) {
                for (int j = del; j <= countOfNotes; j++) {
                    notes[j - 1] = notes[j];
                }
                countOfNotes--;
            }
        }
        return countOfNotes;
    }

    private static void showNotes(String[] notes, int countOfNotes) {
        for (int i = 0; i < countOfNotes; i++) {
            System.out.println("Note " + (i + 1) + ":" + notes[i]);
            System.out.println();
        }
    }

    private static int writeOfNotes(String[] notes, int countOfNotes) {
        System.out.println("Write your notes :");
        Scanner noteLine = new Scanner(System.in);
        String note;
        note = noteLine.nextLine();
        notes[countOfNotes] = note;
        countOfNotes++;
        return countOfNotes;
    }
}

