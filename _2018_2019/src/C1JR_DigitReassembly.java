import java.util.*;
import java.io.*;

public class C1JR_DigitReassembly {
	
	static Scanner in;
	static String num;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		in = new Scanner(new File("1819c1jr.in"));
		
		for(int i = 0; i < 5; i++) {
		
			try {
				init();
				solve(i);
			}
			catch(Exception e) {
				System.out.println("Error");
				//e.printStackTrace();
			}
		
		}
		
		in.close();
		
	}
	
	static void init() {
		num = in.nextLine();
	}
	
	static void solve(int i) {
		if(i == 0) {
			System.out.println(num.length());
		} else if(i == 1) {
			double num2Sum = 0;
			for(int j = 0; j < num.length(); j++) {
				num2Sum += Double.parseDouble(num.substring(j, j + 1));
			}
			System.out.println((int) num2Sum);
		} else if(i == 2) {
			double num3Sum = 0;
			for(int j = 0; j < num.length(); j++) {
				num3Sum += Double.parseDouble(num.substring(j, j + 1));
				j++;
			}
			System.out.println((int) num3Sum);
		} else if(i == 3) {
			double num4times = 0;
			for(int j = 0; j < num.length(); j++) {
				if(Double.parseDouble(num.substring(j, j + 1)) == 4) {
					num4times++;
				}
			}
			System.out.println((int) num4times);
		} else {
			int pos = num.length() / 2;
			if(num.length() % 2 == 0) {
				System.out.println(num.substring(pos - 1, pos));
			} else {
				System.out.println(num.substring(pos, pos + 1));
			}
		}
	}
	
}
