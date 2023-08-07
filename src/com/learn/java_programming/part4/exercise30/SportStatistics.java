package com.learn.java_programming.part4.exercise30;

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

        try (Scanner fileSearch = new Scanner(Paths.get("src/com/learn/java_programming/part4/exercise30/" + fileName))) {
            while (fileSearch.hasNextLine()) {
                String line = fileSearch.nextLine();
                String[] splittedLine = line.split(",");


                String homeTeam = splittedLine[0];
                String awayTeam = splittedLine[1];
                int homePoints = Integer.parseInt(splittedLine[2]);
                int awayPoints = Integer.parseInt(splittedLine[3]);


                if (teamName.equalsIgnoreCase(homeTeam)) {
                    gamesCounter++;
                    if (homePoints > awayPoints) wins++;
                    else losses++;
                }

                if (teamName.equalsIgnoreCase(awayTeam)) {
                    gamesCounter++;
                    if (awayPoints > homePoints) wins++;
                    else losses++;
                }


            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (gamesCounter > 0) {
            System.out.println("Games: " + gamesCounter);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        }

    }
}
