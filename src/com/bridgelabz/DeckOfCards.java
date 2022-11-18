package com.bridgelabz;

import java.util.ArrayList;

public class DeckOfCards {
    public ArrayList<String> deck = new ArrayList<String>();
    String[] suit = { "clubs", "Diamonds", "Heart", "Spades" };
    String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queue", "King", "Ace" };

    public void uniqueCards() {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                deck.add(suit[i] + rank[j]);
            }
        }
        System.out.println(deck);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Deck Of Cards Program..");
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.uniqueCards();
    }
}