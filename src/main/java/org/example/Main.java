package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("choose a person");
        System.out.println("quickly");


        Scanner s = new Scanner(System.in);

        String Verdict = s.nextLine();

        if (Verdict.equals("Layan")|| Verdict.equals("Amira"))
            System.out.println("dumb");
        else
            System.out.println("cute");

    }
}