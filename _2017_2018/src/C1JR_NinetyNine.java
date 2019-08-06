import java.util.*;
import java.io.*;

public class C1JR_NinetyNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(new File("1718c1jr.in"));
			
			for(int gLoop = 0; gLoop < 10; gLoop++) {
				int score = in.nextInt();
				ArrayList<Integer> player = new ArrayList<Integer>();
				ArrayList<Integer> dealer = new ArrayList<Integer>();
				
				for(int i = 0; i < 4; i++) {
					player.add(in.nextInt());
				}
				
				for(int i = 0; i < 3; i++) {
					dealer.add(in.nextInt());
					player.add(in.nextInt());
				}
				
				while(true) {
					int temp = player.remove(0);
					score += convert(temp, score);
					
					if(score > 99) {
						System.out.println(score + ", dealer");
						break;
					}
					
					temp = dealer.remove(0);
					score += convert(temp, score);
					
					if(score > 99) {
						System.out.println(score + ", player");
						break;
					}
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int convert(int temp, int score) {
		if(temp == 9) {
			temp = 0;
			return temp;
		} else if(temp == 4) {
			temp = -10;
			return temp;
		} else if(temp == 0) {
			if(score + 11 > 99) {
				temp = 1;
				return temp;
			} else {
				temp = 11;
				return temp;
			}
		} else {
			return temp;
		}
	}

}
