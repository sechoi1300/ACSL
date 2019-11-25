import java.util.*;
import java.io.*;

public class C1IN_DigitReassembly {

	static Scanner in;
	static String num;
	static int n;
	
	public static void main(String[]args) throws IOException {
		
		in = new Scanner(new File("1819c1in.in"));
		
		for(int i = 0; i < 5; i ++) {
			
			try {
				init();
				solve();
			}
			catch(Exception e) {
				in.nextLine();
				System.out.println("Error");
				//e.printStackTrace();
			}
		}
		
		in.close();
	}
	
	static void init() {
		num = in.next();
		n = in.nextInt();
	}
	
	static void solve() {
		Long sum = 0l;
		for(int i = 0; i <= num.length() - n; i++) {
			sum += Long.parseLong(num.substring(i, i + n));
		}
		System.out.println(sum);
	}
}
