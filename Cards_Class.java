package DOCWorkshop;

public class Cards_Class {
	private String suit;
	private String rank;

	public Cards_Class(String suits, String rank) {
		this.suit = suits;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Card [suits=" + suit + ", rank=" + rank + "]";
	}

	public String getSuits() {
		return getSuits();
	}

	public void setSuits(String suits) {
		this.suit = suits;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}


}
