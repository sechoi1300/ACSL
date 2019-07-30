import java.util.*;
import java.io.*;

public class C1JR_Probability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(new File("0607c1jr.in"));
			for(int gLoop = 0; gLoop < 8; gLoop++) {
				
				int num = in.nextInt();
				int numR = in.nextInt();
				int numB = in.nextInt();
				String replace = "K";
				
				if(num >= 2) {
					replace = in.next();
				}
				
				int numerator = 1;
				int denominator = 1;
				
				for(int i = 0; i < num; i++) {
					String color = in.next();
					if(color.equals("R")) {
						numerator *= numR;
						denominator *= (numR + numB);
						if(replace.equals("N")) {
							numR -= 1;
						}
 					} else {
						numerator *= numB;
						denominator *= (numR + numB);
						if(replace.equals("N")) {
							numB -= 1;
						}
					}
				}
				
				System.out.println(numerator + "/" + denominator);
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
