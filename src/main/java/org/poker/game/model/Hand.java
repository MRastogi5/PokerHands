package org.poker.game.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hand {

    private String[] cards = new String[5]; // {2C,8H,9D,JS,KC}
    public Hand(String[] values) {
        this.cards[0] = values[0];
        this.cards[1] = values[1];
        this.cards[2] = values[2];
        this.cards[3] = values[3];
        this.cards[4] = values[4];
    }

    public String[] getCards() {
        return cards;
    }
    public boolean isSameHands(Hand handValue){  // Invalid Case
        String[] cardValue1 = this.getCards();
        String[] cardValue2 = handValue.getCards();

        Arrays.sort(cardValue1);
        Arrays.sort(cardValue2);
        return Arrays.equals(cardValue1,cardValue2);
    }

    public boolean isSimilarHands(Hand handValue){ // Tie Case

        String[] rankValue1 = this.getRankValues();
        String[] rankValue2 = handValue.getRankValues();

        Arrays.sort(rankValue1);
        Arrays.sort(rankValue2);
        return Arrays.equals(rankValue1,rankValue2);
    }
    public String[] getRankValues(){
        this.getCards();
        List<String> s = new ArrayList<>();
        Arrays.stream(this.getCards()).forEach((k) -> { System.out.print(k + "-");});//6D8H5D5C3S
        Arrays.stream(this.getCards()).forEach((k) -> { s.add(String.valueOf(k.charAt(0)));
        });

        Arrays.stream(this.getCards()).forEach((k) -> { System.out.print(k + ":");});
        System.out.println("Rank : " + s);
        return s.stream().toArray(String[]::new);
    }

    public String[] getSuitValues(){
        this.getCards();
        List<String> s = new ArrayList<>();
        Arrays.stream(this.getCards()).forEach((k) -> { System.out.print(k + "-");});//6D8H5D5C3S
        Arrays.stream(this.getCards()).forEach((k) -> { s.add(String.valueOf(k.charAt(1)));
        });

        Arrays.stream(this.getCards()).forEach((k) -> { System.out.print(k + ":");});
        System.out.println("Suit : " + s);
       return s.stream().toArray(String[]::new);
    }




    public static void main(String[] args) {

        System.out.println("Hello Hands class!!");
        String[] value1 = {"","","","",""};
        String[] value2 = {"","","","",""};
        String[] value3 = {"8H","3S","5D","5C","6D"};
        String[] value4 = {"6D","8H","5D","5C","3S"};
        //Arrays.stream(value1).forEach(System.out::print);
        //Arrays.sort(value1);
        //System.out.println();
        //Arrays.stream(value1).forEach(System.out::print);
        System.out.println(" rank");
        Hand hand1 = new Hand( value3);
        Hand hand2 = new Hand( value4);

        hand2.getRankValues();
        //System.out.println("Compare "+hand1.isSameHands(hand2));
        //System.out.println(value1);
        //Arrays.stream(value1).forEach(System.out::println);
        Hand hand3 = new Hand(new String[]{"2H","3D","5S","9C","KD"});
        Hand hand4 = new Hand(new String[]{"2D","3H","5C","9S","KH"});
        System.out.println("Compare Similar "+hand3.isSimilarHands(hand4));
        System.out.println("Compare Same "+hand3.isSameHands(hand4));

    }

}
