package com.learn.java_programming.part12.exercise10;

public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        if (size < 1 || size % 2 == 0) {
            return null;
        }

        MagicSquare square = new MagicSquare(size);

        int row = 0;
        int col = size / 2;
        int currentValue = 1;

        while (currentValue <= size * size) {
            square.placeValue(col, row, currentValue);
            currentValue++;

            int nextRow = (row - 1 + size) % size;
            int nextCol = (col + 1) % size;

            if (square.readValue(nextCol, nextRow) != 0) {
                row = (row + 1) % size;
            } else {
                row = nextRow;
                col = nextCol;
            }
        }

        return square;
    }
}