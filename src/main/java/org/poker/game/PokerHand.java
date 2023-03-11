package org.poker.game;

import org.poker.game.model.Hand;

import java.util.Arrays;

public class PokerHand {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public String checkPokerHands(Hand... hands){

        if(hands[0].isSameHands(hands[1])){
            return "Invalid";
        }

        if(hands[0].isSimilarHands(hands[1])){
            return "Tie";
        }
        return "";
    }
}