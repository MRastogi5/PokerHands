package org.poker.game;

import org.junit.jupiter.api.Test;
import org.poker.game.model.Hand;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokerHandTest {
    private PokerHand pokerHand = new PokerHand();

    @Test
    void testEmptyPokerHands(){

        Hand firstPlayer = new Hand(new String[]{"","","","",""});
        Hand SecondPlayer = new Hand(new String[]{"","","","",""});

        assertEquals("Invalid",
                pokerHand.checkPokerHands(firstPlayer, SecondPlayer));
    }
    @Test
    void testSimilarPokerHands(){
        Hand firstPlayer = new Hand(new String[]{"2H","3D","5S","9C","KD"});
        Hand SecondPlayer = new Hand(new String[]{"2D","3H","5C","9S","KH"});

        assertEquals("Tie",
                pokerHand.checkPokerHands(firstPlayer, SecondPlayer));
    }

    @Test
    void testSamePokerHands(){
        Hand firstPlayer = new Hand(new String[]{"2H","3D","5S","9C","KD"});
        Hand SecondPlayer = new Hand(new String[]{"2H","3D","5S","9C","KD"});

        assertEquals("Invalid",
                pokerHand.checkPokerHands(firstPlayer, SecondPlayer));
    }

    /*@Test
    void testSameUnOrderedPokerHands(){
        Hand firstPlayer = new Hand( "2H","3D","5S","9C","KD");
        Hand SecondPlayer = new Hand("5C","2D","KH","3H","9S");

        assertEquals("Tie",
                pokerHand.checkPokerHands(firstPlayer, SecondPlayer));
    }*/

}