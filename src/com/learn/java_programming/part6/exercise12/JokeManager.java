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
        if (!(joke.isEmpty())) {
            jokes.add(joke);
        }
    }

    public String drawJokes() {
        Random random = new Random();
        if (!(jokes.isEmpty())) {
            return jokes.get(random.nextInt(jokes.size()));
        } else {
            return "Jokes are in short supply.";
        }
    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
