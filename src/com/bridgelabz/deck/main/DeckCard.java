package com.bridgelabz.deck.main;

import com.bridgelabz.deck.Implementation.DeckServiceimpl;
import com.bridgelabz.deck.Model.DeckService;

public class DeckCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckService deckQueueImpl = new DeckServiceimpl();
		deckQueueImpl.intializeCard();
		deckQueueImpl.shuffleCard();
		deckQueueImpl.deckQueueStore();
		deckQueueImpl.displayDeck();
	}

}
