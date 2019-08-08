import java.util.*;
import java.io.*;

public class C1JR_AGRAM {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(new File("1617c1jr.in"));
			
			for(int gLoop = 0; gLoop < 10; gLoop++) {
				int opponentCardNum = in.nextInt();
				String opponentCardSuit = in.next();
				
				int[] dealerCardNum = new int[5];
				String[] dealerCardSuit = new String[5];
				int[] dealerCard = new int[5];
				
				for(int i = 0; i < 5; i++) {
					dealerCardNum[i] = in.nextInt();
					dealerCardSuit[i] = in.next();
				}
				
				if ( !higher2(opponentCardNum, opponentCardSuit, dealerCardNum, dealerCardSuit) ) {
					lowest(opponentCardNum, opponentCardSuit, dealerCardNum, dealerCardSuit, dealerCard);
				}
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean higher(int opponentCardNum, String opponentCardSuit, int[] dealerCardNum, String[] dealerCardSuit, int[] dealerCard) {
		for(int i = 0; i < 5; i++) {
			if(opponentCardSuit.equals(dealerCardSuit[i])) {
				dealerCard[i] = dealerCardNum[i];
				dealerCardSuit[0] = dealerCardSuit[i];
			}
		}
		
		for(int l = 0; l < dealerCard.length; l++) {
			if(dealerCard[l] > opponentCardNum) {
				dealerCard[0] = dealerCard[l];
				return true;
			} else {
				continue;
			}
		}
		
		System.out.println(dealerCard[0] + " " + dealerCardSuit[0]);
		return false;
	}

	public static boolean higher2(int opponentCardNum, String opponentCardSuit, int[] dealerCardNum, String[] dealerCardSuit) {
		int dealerCard = 0;
		for(int i = 0; i < dealerCardNum.length; i++) {
			if(opponentCardSuit.equals(dealerCardSuit[i]) && opponentCardNum < dealerCardNum[i]) {
				if ( dealerCard == 0 || dealerCardNum[i] < dealerCard ) {
					dealerCard = dealerCardNum[i];
				}
			}
		}

		if ( opponentCardNum < dealerCard ) {
			System.out.println(dealerCard + " " + opponentCardSuit);
			return true;
		}

		return false;
	}
	
	public static boolean lowest(int opponentCardNum, String opponentCardSuit, int[] dealerCardNum, String[] dealerCardSuit, int[] dealerCard) {
		int min = 0;
		for(int i = 0; i < 5; i++) {
			if(opponentCardSuit.equals(dealerCardSuit[i])) {
				dealerCard[i] = dealerCardNum[i];
				dealerCardSuit[0] = dealerCardSuit[i];
			}
		}
		
		for(int l = 0; l < dealerCard.length; l++) {
			min = Math.min(min, dealerCard[l]);
		}
		System.out.println(min + " " + dealerCardSuit[0]);
		return true;
	}
	
}
