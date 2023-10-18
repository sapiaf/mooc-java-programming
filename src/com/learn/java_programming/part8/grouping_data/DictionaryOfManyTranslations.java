package com.learn.java_programming.part8.grouping_data;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    public static void main(String[] args) {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));
    }

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
            dictionary.putIfAbsent(word, new ArrayList<>());
            dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        return dictionary.get(word) != null ? dictionary.get(word) : new ArrayList<>();
    }

    public void remove(String word) {
        dictionary.remove(word);
    }

}
