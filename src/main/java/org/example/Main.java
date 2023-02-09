package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("layan is dumb");

        Scanner s = new Scanner(System.in);

        String Verdict = s.nextLine();

        if (Verdict == "Layan")
            System.out.println("dumb");
        else
            System.out.println("cute");

    }
}