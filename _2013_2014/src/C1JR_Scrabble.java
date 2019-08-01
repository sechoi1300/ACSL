import java.util.*;
import java.io.*;

public class C1JR_Scrabble {
	
	static boolean doubleWord = false;
	static boolean tripleWord = false;

	public static void main(String[] args) {
		
		try {
			Scanner in = new Scanner(new File("1314c1jr.in"));
			 
			for(int gLoop = 0; gLoop < 2; gLoop++) {
				
				String[] word = in.nextLine().split(" ");
				int[] templocation = new int[5];
				int[] point = new int[4];
				int totalPoint = 0;
				
				for(int loop = 0; loop < 5; loop++) {
					
				int location = Integer.parseInt(in.nextLine());
				
				for(int i = 0; i < 4; i++) {
					templocation[i] = location + i;
				}
					
				for(int i = 0; i < 4; i++) {
					if(word[i].equals("A") || word[i].equals("E")) {
						point[i] = 1;
					} else if(word[i].equals("D") || word[i].equals("R")) {
						point[i] = 2;
					} else if(word[i].equals("B") || word[i].equals("M")) {
						point[i] = 3;
					} else if(word[i].equals("V") || word[i].equals("Y")) {
						point[i] = 4;
					} else {
						point[i] = 8;
					}
				}
					
				for(int i = 0; i < 4; i++) {
					if(templocation[i] % 3 == 0 && templocation[i] % 6 != 0) {
						point[i] *= 2;
					} else if(templocation[i] % 5 == 0) {
						point[i] *= 3;
					} else if(templocation[i] % 7 == 0) {
						doubleWord = true;
					} else if(templocation[i] % 8 == 0) {
						tripleWord = true;
					}
				}
					
				for(int i = 0; i < 4; i++) {
					totalPoint += point[i];
				}
					
				if(doubleWord) {
					totalPoint *= 2;
				} else if(tripleWord) {
					totalPoint *= 3;
				}
					
				System.out.println(totalPoint);
				totalPoint = 0;
				doubleWord = false;
				tripleWord = false;
				
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
