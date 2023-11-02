package com.learn.java_programming.part11.exercise13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class SaveableDictionary {
    private Map<String, String> words;

    private String file;

    public SaveableDictionary() {
        this.words = new HashMap<>();
    }
    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }
    public void add(String words, String translation) {
        if (!this.words.containsKey(words)) {
            this.words.put(words, translation);
            this.words.put(translation, words);
        }
    }
    public String translate(String word) {
        return this.words.get(word);
    }

    public void delete(String word) {
        String translation = translate(word);
        words.remove(word);
        words.remove(translation);
    }
    public boolean load() {
        try {
            Files.lines(Paths.get(this.file))
                    .map(l -> l.split(":"))
                    .forEach(l -> {
                        this.words.put(l[0], l[1]);
                        this.words.put(l[1], l[0]);
                    });
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
