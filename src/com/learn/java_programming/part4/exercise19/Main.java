package com.learn.java_programming.part4.exercise19;

import com.learn.java_programming.part4.exercise18.PersonalInformation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> nomi = new ArrayList<>();
        while (true) {
            System.out.println("name");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) break;
            System.out.println("duration");
            int duration = Integer.parseInt(scanner.nextLine());
            nomi.add(new TelevisionProgram(firstName, duration));
        }
        System.out.println("Max duration: ");
        int maxDuration = Integer.parseInt(scanner.nextLine());
        for (TelevisionProgram tvShow : nomi) {
            if (tvShow.getDuration() < maxDuration) System.out.println(tvShow);
        }
    }
}
