package com.learn.java_programming.part5.exercise11;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }

    public int getPricePerSquare() {
        return pricePerSquare;
    }

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared) {
        return this.squares > compared.getSquares();
    }

    public int priceDifference(Apartment compared) {
        int apartmentOnePrice = this.pricePerSquare * this.squares;
        int apartmentTwoPrice = compared.getPricePerSquare() * compared.getSquares();
        int difference = apartmentOnePrice - apartmentTwoPrice;
        return Math.abs(difference);
    }
    public boolean moreExpensiveThan(Apartment compared) {
        int apartmentOnePrice = this.pricePerSquare * this.squares;
        int apartmentTwoPrice = compared.getPricePerSquare() * compared.getSquares();
        return apartmentOnePrice > apartmentTwoPrice;
    }
}
