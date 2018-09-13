package com.vasialeleka.note;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Note[] notes = new Note[100];//массив обектов
        while (true) {

            System.out.println("1 - for add new note.");
            System.out.println("2 - for see all notes.");
//            System.out.println("3 - for delete note");
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

                NoteOptions.AddNewNote( notes);



            } else if (options == 2) {

                NoteOptions.ShowAllNotes(notes);
            } else if (options==5){
                break;
            }

        }
    }



}