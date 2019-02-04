
public class CardGame {

	int club = 1; 
	int diamond = 2;
	int heart = 3;
	int spades = 4;
	
int ace = 14;
int king = 13;
int queen = 12;
int jack = 11;

	
	public static void main(String[] args) {
		String playingSuit;
		String playingRank;
		int suit=(int)(Math.random()*4) + 1;
		int rank = (int)(Math.random()*13) + 2;
		
		if (suit==1)
		{
			playingSuit="Club";
		}
		else if(suit==2) {
			playingSuit="Diamond";
		}
		else if(suit==3) {
			playingSuit="Heart";
		}
		else {
			playingSuit="Spade";
		}
		
		if (rank==14) {
			playingRank="Ace";
		}
		else if (rank==13) {
			playingRank="King";
					}
		else if (rank==12) {
			playingRank="Queen";
		}
		else if (rank==11){
			playingRank="Jack";
		}
		else {
			playingRank=String.valueOf(rank);
		}
		
		System.out.println(playingRank+" of "+playingSuit);
	
		
		
	}

}
