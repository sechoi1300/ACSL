/*
Sejin Eric Choi
Grade 10
STEMPIA
Intermediate
Contest 3
*/
import java.util.*;
import java.io.*;

public class A3_ACSLEgyptianMultiplication {
	
	static Scanner in;
	static int a, b;
	static String ans;
	static int decomp, secondmultiplicand;
	static int exp;
	static String result;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		in = new Scanner(new File("1516a3.in"));
		
		for(int i = 0; i < 20; i++) {
			try {
				init();
				solve();
			}
			catch (Exception e) {
				in.nextLine();
				System.out.println("Error");
			}
		}
		in.close();
	}
	
	static void init() {
		decomp = in.nextInt();
		secondmultiplicand = in.nextInt();
		
		int temp = decomp;
		decomp = Math.max(decomp, secondmultiplicand);
		secondmultiplicand = Math.min(temp, secondmultiplicand);
		
		exp = 0;
		result = "";
	}
	
	static void solve() {
		int difference = 10;
		while(true) {
			secondpower(decomp);
			difference = decomp - (int)Math.pow(2, exp);
			decomp = difference;
			result += " " + (secondmultiplicand * (int)Math.pow(2, exp));
			if(difference == 0) break;
		}
		System.out.println(result.substring(1));
	}
	
	static void secondpower(int num) {
		int n = 32;
		while(true) {
			if(Math.pow(2, n) <= num) {
				exp = n;
				break;
			}
			n--;
		}
	}
	
	/*
	static void init() {
		a = in.nextInt();
		b = in.nextInt();
		
		int temp = a;
		a = Math.max(a, b);
		b = Math.min(temp, b);
		
		ans = "";
	}
	
	static void solve() {
		int i = 32;
		while(true) {
			if(Math.pow(2, i) <= a) {
				int n = (int)Math.pow(2, i);
				ans += n * b + " ";
				a -= n;
			}
			if(a == 0) break;
			i--;
		}
		System.out.println(ans);
	}
	*/

}
