package com.learn.java_programming.part4.exercise23;

import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(Paths.get("src/com/learn/java_programming/part4/exercise23/data.txt"))) {

//          This is a while loop that will continue as long as the scanner has another line to read
//          from its input source (in your case, this is a file).
            while (scanner.hasNextLine()) {
//              Inside the loop, this line of code reads the next line from the file using the nextLine()
//              method of the Scanner class. This method retrieves the next line from the input source
//              and returns it as a String.
                String row = scanner.nextLine();
//              This line simply prints the contents of the row variable to the console.
//              In the context of this code, it means it's printing out the line that was just read from the file.
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

