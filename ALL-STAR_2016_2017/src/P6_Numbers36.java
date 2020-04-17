import java.util.*;
import java.io.*;

public class P6_Numbers36 {

	static Scanner in;
	static String analyze;
	static int k;
	static ArrayList<String> a;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		in = new Scanner(new File("1617P6in.in"));
		
		for(int i = 0; i < 10; i++) {
			try {
				init();
				solve();
			} catch (Exception e) {
				in.nextLine();
				System.out.println("Error");
			}
		}
		in.close();
	}
	
	static void init() {
		analyze = in.next();
		k = in.nextInt();
		a = new ArrayList<String>();
	}
	
	static void solve() {
		
	}
	
}
