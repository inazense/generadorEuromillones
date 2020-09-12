package claver.paules.euromillones.dao;

public class Ticket {

	private int numbers[] = new int[5];
	private int stars[] = new int[2];
	
	public Ticket() {}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public int[] getStars() {
		return stars;
	}

	public void setStars(int[] stars) {
		this.stars = stars;
	}
}
