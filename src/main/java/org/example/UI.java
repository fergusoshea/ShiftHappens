package org.example;

import java.util.Scanner;

public class UI {
    Translator translator = new Translator();

    public void present(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose your operation, 1 for Encode and 2 for Decode");
        int inputOption = scanner.nextInt();

        System.out.println("Please enter your string");
        String inputString = scanner.next();

        System.out.println("Please enter your shift as a number");
        int inputShift = scanner.nextInt();

        if (inputOption == 1) {
            System.out.println(translator.translateString(inputString, -inputShift));
        } else if (inputOption == 2) {
            System.out.println(translator.translateString(inputString, inputShift));
        } else {
            System.out.println("Invalid option");
        }
    }
}
