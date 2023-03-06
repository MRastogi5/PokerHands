package org.poker.game;

public class Hand {

    public Hand(String... values) {
        this.cardsValue[0] = values[0];
        this.cardsValue[1] = values[1];
        this.cardsValue[2] = values[2];
        this.cardsValue[3] = values[3];
        this.cardsValue[4] = values[4];
    }

    String[] cardsValue = new String[5];

}
