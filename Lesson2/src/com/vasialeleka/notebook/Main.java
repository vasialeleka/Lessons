package com.vasialeleka.notebook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        NoteService noteService = new NoteService();
        Note[] notes = new Note[100];


        while (true) {
            System.out.println("1 - Create note");
            System.out.println("2 - See all notes");
            System.out.println("3 - Delete note");
            System.out.println("4 - Change note");
            System.out.println("0 - Exit from application");
            Scanner reader = new Scanner(System.in);
            int noteOption;
            try {
                noteOption = reader.nextInt();
            } catch (Exception a){
                System.out.println("Error occurred. Check please inner value. It must be integer");
                a.getStackTrace();
                continue;
            }
            if (noteOption == 1) {
                System.out.println("Write your notes :");
                Scanner noteReader = new Scanner(System.in);
                noteService.addNote(notes, noteReader.nextLine());
            } else if (noteOption == 2) {
                noteService.listOfNotes(notes);
            } else if (noteOption == 3) {
                noteService.listOfNotes(notes);
                System.out.println("Choose what note you want to delete :");
                Scanner deleteReader = new Scanner(System.in);
                int numberForDeletion;
                try {
                    numberForDeletion = deleteReader.nextInt();
                } catch (Exception e){
                    System.out.println("Error occurred. Check please inner value. It must be integer");
                    e.getStackTrace();
                    continue;
                }

                noteService.deleteNote(notes, numberForDeletion);
                noteService.listOfNotes(notes);
            } else if (noteOption == 4) {
                noteService.changeNote(notes);
                noteService.listOfNotes(notes);
            } else if(noteOption == 0){
                break;
            } else {
                System.out.println("Please enter correct number");
            }
        }
    }
}

