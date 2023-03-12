package org.poker.game;

import org.poker.game.model.Hand;

import java.util.Arrays;

public class PokerHand {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public String checkPokerHands(Hand black, Hand white){
//TODO check input is empty?

        if(black.isSameHands(white)){
            return "Invalid";
        }
        else if(black.isSimilarHands(white)){
            return "Tie";
        }
        return getWinningHand(black, white)+" wins";

    }

    private String getWinningHand(Hand black, Hand white) {
        checkCombination(black);

        return "";
    }

    private void checkCombination(Hand handValue) {
        //straightFlush
        isStraightflush(handValue);
        isFourOfAKind(handValue);
        isFullHouse(handValue);
        isFlush(handValue);
        isStraight(handValue);
        isThreeOfAKind(handValue);
        hasTwoPairs(handValue);
        hasPair(handValue);

    }

}