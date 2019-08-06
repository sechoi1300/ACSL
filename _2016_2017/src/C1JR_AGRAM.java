import java.util.*;
import java.io.*;

public class C1JR_AGRAM {
	
	static boolean dealerCard1 = false;
	static boolean dealerCard2 = false;
	static boolean dealerCard3 = false;
	static boolean dealerCard4 = false;
	static boolean dealerCard5 = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(new File("1617c1jr.in"));
			
			for(int gLoop = 0; gLoop < 10; gLoop++) {
				int opponentCardNum = in.nextInt();
				String opponentCardSuit = in.next();
				int dealerCard1Num = in.nextInt();
				String dealerCard1Suit = in.next();
				int dealerCard2Num = in.nextInt();
				String dealerCard2Suit = in.next();
				int dealerCard3Num = in.nextInt();
				String dealerCard3Suit = in.next();
				int dealerCard4Num = in.nextInt();
				String dealerCard4Suit = in.next();
				int dealerCard5Num = in.nextInt();
				String dealerCard5Suit = in.next();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
