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
				int[] location = new int[4];
				int[] point = new int[4];
				int totalPoint = 0;
				
				for(int loop = 0; loop < 5; loop++) {
					
					location[0] = in.nextInt();
				
					for(int i = 1; i < 4; i++) {
						location[i] = location[0] + i;
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
						if(location[i] % 6 != 0 && location[i] % 3 == 0) {
							point[i] *= 2;
						} else if(location[i] % 5 == 0) {
							point[i] *= 5;
						} else if(location[i] % 7 == 0) {
							doubleWord = true;
						} else if(location[i] % 8 == 0) {
							tripleWord = true;
						} else {
							doubleWord = false;
							tripleWord = false;
						}
					}
					
					for(int i = 0; i < 4; i++) {
						totalPoint += point[i];
					}
					
					if(doubleWord = true) {
						totalPoint *= 2;
					} else if(tripleWord = true) {
						totalPoint *= 3;
					} else {
						continue;
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
