package com.vasialeleka.notebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notebook {
    public static void main(String[] args) {
        boolean flag = true;
        //int i = 0;
       List<String> notes = new ArrayList<>();
        while (flag) {
            System.out.println("Push 1 for new note.\n 2 - see all notes.\n 3- close");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Write your notes :");
                    Scanner noteLine = new Scanner(System.in);
                    String note;
                    note = noteLine.nextLine();
                    notes.add(note);
                    //System.out.flush();
                    //System.out.println(note);
                    break;
                case 2:
                    for (int i= 0; i <notes.size(); i++){

                    System.out.println("Note "+(i+1)+":"+notes.get(i));
                        System.out.println("");}
                   // System.out.println(Notes.size());
                    break;
                case 3:
                    flag = false;
                    break;

                default:
                    System.out.println("I don't know");

                     break;

            }




        }
    }
}
