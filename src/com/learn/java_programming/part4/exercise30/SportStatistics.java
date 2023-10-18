package com.learn.java_programming.part4.exercise30;

import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = scanner.nextLine();

        System.out.println("Team: ");
        String teamName = scanner.nextLine();

        int gamesCounter = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner sc = new Scanner(Paths.get("src/com/learn/java_programming/part4/exercise30/" + fileName))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] strings = line.split(",");
                if (strings[0].equalsIgnoreCase(teamName)) {
                    gamesCounter++;
                    if (Integer.parseInt(strings[2]) > Integer.parseInt(strings[3])) wins++;
                    else losses++;
                }
                if (strings[1].equalsIgnoreCase(teamName)) {
                    gamesCounter++;
                    if (Integer.parseInt(strings[3]) > Integer.parseInt(strings[2])) wins++;
                    else losses++;
                }

            }

            System.out.println("Games: " + gamesCounter);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);



        } catch (NoSuchFileException noSuchFileException) {
            System.out.println("file " + fileName + " not found");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
