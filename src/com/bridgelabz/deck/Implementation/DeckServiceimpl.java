package com.bridgelabz.deck.Implementation;

import com.bridgelabz.deck.Model.DeckService;
import com.bridgelabz.util.AlgorithmProgram;
import com.bridgelabz.util.QueueLinkedList;

public class DeckServiceimpl implements DeckService {

	String[] Suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] Ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	int n = Suits.length * Ranks.length;
	String[] deck = new String[n];
	QueueLinkedList<QueueLinkedList<String>> mainQueue = new QueueLinkedList<QueueLinkedList<String>>();
	QueueLinkedList<String> Queue = new QueueLinkedList<String>();

	@Override
	public void intializeCard() {
		// TODO Auto-generated method stub
		for (int i = 0; i < Ranks.length; i++) {
			for (int j = 0; j < Suits.length; j++) {
				deck[Suits.length * i + j] = Ranks[i] + " " + Suits[j];
			}
		}
	}

	@Override
	public void shuffleCard() {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
	}

	@Override
	public void deckQueueStore() {
		// TODO Auto-generated method stub
		System.out.println("Total number of deck of cards are " + deck.length);
		for (int i = 0; i < 4; i++) {
			String[] demo = new String[9];
			for (int j = 0; j < 9; j++) {
				demo[j] = deck[i + j * 4];
			}
			String[] str2 = AlgorithmProgram.BubbleSort(demo);
			for (int k = 0; k < str2.length; k++) {
				Queue.insert(str2[k]);
			}
			mainQueue.insert(Queue);
			Queue = new QueueLinkedList<String>();
			continue;
		}
	}

	@Override
	public void displayDeck() {
		// TODO Auto-generated method stub
		for (int i = 0; i < mainQueue.getSize(); i++) {
			QueueLinkedList<String> queue2 = mainQueue.remove();
			System.out.println("********************************* Person " + (i + 1)
					+ " ******************************************");
			for (int j = 0; j < queue2.getSize(); j++) {
				System.out.print(queue2.remove() + "  ");
			}
			System.out.println();
		}
	}
}
