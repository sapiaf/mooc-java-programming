package com.learn.java_programming.part11.exercise13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
    private Map<String, String> dictionary;
    private String file;
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }
    public void add(String words, String translation) {
        if (!dictionary.containsKey(words)) {
            dictionary.put(words, translation);
        }
    }
    public String translate(String word) {
        return dictionary.get(word);
    }
    public void delete(String word) {
        if (dictionary.containsKey(word)) {
            String translation = dictionary.get(word);
            dictionary.remove(word);
            dictionary.values().remove(translation);
        }
    }
    public boolean load() {
        try {
            Scanner fileReader = new Scanner(new File(file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    add(parts[0], parts[1]);
                }
            }
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }
    public boolean save() {
        try (PrintWriter writer = new PrintWriter(new File(file))) {
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                writer.println(entry.getKey() + ":" + entry.getValue());
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }


}
