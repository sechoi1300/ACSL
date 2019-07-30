import java.util.*;
import java.io.*;

public class C1JR_Poker {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//1. Input file
			Scanner in = new Scanner(new File("0405c1jr.in"));
			for(int gLoop = 0; gLoop < 9; gLoop++) {
				int[] values = new int[13];
				boolean pair = false, threeOfAKind = false, fourOfAKind = false, fullHouse = false;
				
				for(int i = 0; i < 5; i++) {
					int temp = in.nextInt();
					int card = temp % 13;
					values[card] += 1;
				}
				
				for(int i = 0; i < values.length; i++) {
					if(values[i] == 4)
						fourOfAKind = true;
					if(values[i] == 3)
						threeOfAKind = true;
					if(values[i] == 2)
						pair = true;
				}
				
				if(fourOfAKind) {
					System.out.println("FOUR OF A KIND");
				} else if(fullHouse) {
					System.out.println("FULL HOUSE");
				} else if(threeOfAKind) {
					System.out.println("THREE OF A KIND");
				} else if(pair) {
					System.out.println("PAIR");
				} else {
					System.out.println("NONE");
				}
				
			}
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean fourOfAKind(int[] list) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				for(int k = 0; k < 5; k++) {
					for(int l = 0; l < 5; l++) {
						if(i != j && list[i] == list[j] && i != k && list[i] == list[k] && j != k && list[j] == list[k]) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	public static boolean fullHouse(int[] list) {
		if(threeOfAKind(list) == true && pair(list) == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean threeOfAKind(int[] list) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				for(int k = 0; k < 5; k++) {
					if(i != j && list[i] == list[j] && i != k && list[i] == list[k] && j != k && list[j] == list[k]) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static boolean pair(int[] list) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i != j && list[i] == list[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
