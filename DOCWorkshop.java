package DOCWorkshop;

import java.util.ArrayList;

public class DOCWorkshop {

	
		public static  class DeckOfCard {
			
			ArrayList<Cards_Class> cards = new ArrayList<Cards_Class>(52);
			
			private static String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };

			private static String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

						private void setupDeck() {
				for (int i = 0; i < suit.length; i++) {
					for (int j = 0; j < rank.length; j++) {
						this.cards.add(new Cards_Class(suit[i], rank[j]));
					}
				}
			}

			public static void main(String[] args) {
				
				DeckOfCard deckOfCards = new DeckOfCard();

				deckOfCards.setupDeck();

			}

	}

}
