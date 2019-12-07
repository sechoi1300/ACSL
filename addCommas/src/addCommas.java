import java.util.*;
import java.io.*;

public class addCommas {
	
	static Scanner in;
	static String num;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		in = new Scanner (new File("addCommas.in"));
		
		for(int i = 0; i < 1; i++) {
			
			try {
				init();
				solve();
			}
			catch(Exception e) {
				in.nextLine();
				System.out.println("Error");
			}
			
		}
		
	}
	
	static void init() {
		 num = in.next();
	}
	
	static void solve() {
		if(num.length() % 3 == 1) {
			String front = num.substring(0, 1);
			System.out.print(front);
			for(int i = 1; i < num.length(); i+=3) {
				System.out.print("," + num.substring(i, i + 3));
			}
		}
		else if(num.length() % 3 == 2) {
			String front = num.substring(0, 2);
			System.out.print(front);
			for(int i = 2; i < num.length(); i+=3) {
				System.out.print("," + num.substring(i, i + 3));
			}
		}
		else {
			String front = num.substring(0, 3);
			System.out.print(front);
			for(int i = 3; i < num.length(); i+=3) {
				System.out.print("," + num.substring(i, i + 3));
			}
		}
	}
	
}
