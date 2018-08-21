package com.vasialeleka.notebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notebook {
    public static void main(String[] args) {
        List<String> notes = new ArrayList<>();
        while (true) {
            System.out.println("Push 1 for new note.\n 2 - see all notes.\n 3- close");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            if (n == 1) {
                System.out.println("Write your notes :");
                Scanner noteLine = new Scanner(System.in);
                String note;
                note = noteLine.nextLine();
                notes.add(note);
            } else if (n == 2) {
                for (int i = 0; i < notes.size(); i++) {
                    System.out.println("Note " + (i + 1) + ":" + notes.get(i));
                    System.out.println();
                }
            } else {
                break;
            }
        }
    }
}

