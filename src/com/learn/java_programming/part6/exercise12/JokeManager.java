package com.learn.java_programming.part6.exercise12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeManager {
    private List<String> jokes;
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    public void addJoke(String joke) {
        jokes.add(joke);
    }
    public String drawJokes() {
        Random random = new Random();
        return jokes.get(random.nextInt(jokes.size()));
    }
    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        };
    }

}
