package com.lenagasparikova;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        GamePlayer2 gamePlayer2 = new GamePlayer2("Lena Gasparikova", "hammer", 12, 1);
//        writeValues(gamePlayer2);
//        System.out.println(gamePlayer2.write());

        IReadAll wereworlf = new Monster("Werewolf", 12, 55);
        System.out.println(wereworlf);
        saveValues(wereworlf);

        ((Monster)wereworlf).getStrength();

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        boolean quit = false;
        while (!quit) {
            System.out.println("Choose your action...\n" +
                    "0 - to quit\n" +
                    "1 - to save\n");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter your values...");
                    String yourValues = scanner.nextLine();
                    values.add(index, yourValues);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveValues(IReadAll objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to the device");
        }
    }

    public static void writeValues(IReadAll objectToSave) {
        ArrayList<String> values = readValues();
        objectToSave.read(values);
    }

    public static void savingObjects(IReadAll objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to the device");
        }
    }

    public static void readingObjects(IReadAll objectToRead) {
        ArrayList<String> values = readValues();
        objectToRead.read(values);
    }

}
