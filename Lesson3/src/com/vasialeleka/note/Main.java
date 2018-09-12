package com.vasialeleka.note;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Note[] notes = new Note[100];//массив обектов
        while (true) {

            System.out.println("1 - for add new note.");
            System.out.println("2 - for see all notes.");
            System.out.println("5 - close.");
            Scanner generalScan = new Scanner(System.in);
            int options;
            try {
                options = generalScan.nextInt();
            } catch (Exception a) {
                System.out.println("Error occurred. Check please inner value. It must be integer");
                continue;
            }

            if (options == 1) {

                System.out.println("Enter the note:");

                Scanner scanForNote = new Scanner(System.in);

                String note = scanForNote.nextLine();
                notes[Note.countOfNotes] = new Note();
                notes[Note.countOfNotes].setContent(note);

                Note.increaseCount();
                // System.out.println(notes[].getContent());


            } else if (options == 2) {
                for (int i = 0; i < Note.countOfNotes; i++) {
                    System.out.println(notes[i].getContent());
                }
            } else if (options==5){
                break;
            }

        }
    }
}