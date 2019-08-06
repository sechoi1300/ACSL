import java.util.*;
import java.io.*;

public class C2JR_CoinStrips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(new File("0304c2jr.in"));
			
			for(int gLoop = 0; gLoop < 9; gLoop++) {
				int squares = in.nextInt();
				int coinNum = in.nextInt();
				int _1 = 0;
				int _2 = 0;
				int _3 = 0;
				int _4 = 0;
				int _5 = 0;
				int before = in.nextInt();
				int current = in.nextInt();
				if(current - before == 2) {
					_1++;
				} else if(current - before == 3) {
					_2++;
				} else if(current - before == 4) {
					_3++;
				} else if(current - before == 5) {
					_4++;
				} else if(current - before == 6) {
					_5++;
				}
				
				for(int i = 1; i < coinNum; i++) {
					before = current;
					current = in.nextInt();
					if(current - before == 2) {
						_1++;
					} else if(current - before == 3) {
						_2++;
					} else if(current - before == 4) {
						_3++;
					} else if(current - before == 5) {
						_4++;
					} else if(current - before == 6) {
						_5++;
					}
				}
				
				System.out.print(_1 + " " + _2 + " " + _3 + " " + _4 + " " + _5);
				System.out.println();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
