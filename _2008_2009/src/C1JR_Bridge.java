import java.util.*;
import java.io.*;

public class C1JR_Bridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(new File("0809c1jr.in"));
			
			for(int gLoop = 0; gLoop < 10; gLoop++) {
				int bid = in.nextInt();
				int tricks = in.nextInt();
				int under = 0;
				int over = 0;
				String suit = in.next();
				
				if(tricks > bid + 6) {
					if(suit.equals("N")) {
						under = bid * 30;
						over = (tricks - (bid + 6)) * 30;
						System.out.println((under + 10) + ", " + over);
					} else if(suit.equals("H") || suit.equals("S")) {
						under = bid * 30;
						over = (tricks - (bid + 6)) * 30;
						System.out.println(under + ", " + over);
					} else if(suit.equals("C") || suit.equals("D")) {
						under = bid * 20;
						over = (tricks - (bid + 6)) * 20;
						System.out.println(under + ", " + over);
					} else {
						System.out.println("0, 0");
					}
				} else {
					if(suit.equals("N")) {
						under = (bid * 30) + 10;
						System.out.println(under + ", " + 0);
					} else if(suit.equals("H") || suit.equals("S")) {
						under = bid * 30;
						System.out.println(under + ", " + 0);
					} else if(suit.equals("C") || suit.equals("D")) {
						under = bid * 20;
						System.out.println(under + ", " + 0);
					} else {
						System.out.println("0, 0");
					}
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
