package com.learn.java_programming.part5.exercise12;

public class Song {
    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Song comparedSong)) return false;
        return comparedSong.artist.equals(this.artist) && comparedSong.name.equals(this.name) && comparedSong.durationInSeconds == this.durationInSeconds;
    }
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public static void main(String[] args) {
        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }

        if (jackSparrow.equals("Another object")) {
            System.out.println("Strange things are afoot.");
        }
    }
}
