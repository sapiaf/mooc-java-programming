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
                if (line.isEmpty()) continue;

                String[] splitted = line.split(",");
                String homeTeam = splitted[0];
                String awayTeam = splitted[1];
                int homePoints = Integer.parseInt(splitted[2]);
                int awayPoints = Integer.parseInt(splitted[3]);

                if (homeTeam.equalsIgnoreCase(teamName)) {
                    if (homePoints > awayPoints) wins++;
                    else losses++;
                    gamesCounter++;
                }

                if (awayTeam.equalsIgnoreCase(teamName)) {
                    if (homePoints < awayPoints) wins++;
                    else losses++;
                    gamesCounter++;
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
