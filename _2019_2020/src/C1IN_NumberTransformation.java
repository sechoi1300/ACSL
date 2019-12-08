import java.util.*;
import java.io.*;

public class C1IN_NumberTransformation {
	
	static Scanner in;
	static String N;
	static int P, num;
	static int[] Nnum;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		in = new Scanner(new File("1920c1in.in"));
		
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
		N = in.next();
		P = in.nextInt();
		Nnum = new int[N.length()];
		for(int i = 0; i < N.length(); i++) {
			Nnum[i] = Integer.parseInt(N.substring(i, i + 1));
		}
		num = Nnum[N.length() - P];
	}
	
	static void solve() {
		for(int i = 0; i < N.length() - P; i++) {
			if(Nnum[i] + num > 9) {
				Nnum[i] = Nnum[i] + num - 10;
			}
			else {
				Nnum[i] += num;
			}
		}
		for(int i = N.length() - P + 1; i < N.length(); i++) {
			Nnum[i] = Math.abs(Nnum[i] - num);
		}
		
		for(int i = 0; i < Nnum.length; i++) {
			System.out.print(Nnum[i]);
		}
		System.out.println();
		//System.out.println(Arrays.toString(Nnum));
	}
	
}
