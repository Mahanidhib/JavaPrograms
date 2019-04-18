package com.bridgelabz.DeckofCards.main;

import com.bridgelabz.DeckofCards.Implementation.DeckofCardsImplementation;

public class DeckofCardsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			DeckofCardsImplementation deck = new DeckofCardsImplementation();
			//Initialize the deck of cards
			deck.initDeck();
			//Shuffle the deck of cards
			deck.shuffleDeck();
			//Print the shuffled deck of cards
			//deck.printDeck();
			//Print the deck of 9 cards distributed to 4 people
		    deck.totalDeck();
		}
	}

}
