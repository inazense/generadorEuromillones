package claver.paules.euromillones.dao;

public class Raffle {

	private int bestNumbers[];
	private int bestStars[];
	private int worstNumbers[];
	private int worstStars[];
	
	public Raffle()
	{
		bestNumbers 	= new int[6];		
		bestStars 		= new int[2];
		worstNumbers 	= new int[6];		
		worstStars 		= new int[2];
	}
}
