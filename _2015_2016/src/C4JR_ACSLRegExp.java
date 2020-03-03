import java.util.*;
import java.util.regex.Pattern;
import java.io.*;

public class C4JR_ACSLRegExp {
	
	static Scanner in;
	static String[] a;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		in = new Scanner(new File("1516c4jr.in"));
		for(int i = 0; i < 2; i++) {
			try {
				a = in.nextLine().split(", ");
				for(int j = 0; j < 5; j++) {
					solve();
				}
			}
			catch(Exception e) {
				in.nextLine();
				System.out.println("Error");
				//e.printStackTrace();
			}
		}
		
		in.close();
		
	}
	
	public static void solve() {
		String p = in.nextLine();
		String ans = "";
		for(int i = 0; i < a.length; i++) {
			
			String temp = a[i];
			if(a[i].equals("#")) {
				temp = "";
			}
			
			boolean b = Pattern.matches(p,  temp);
			if(b) ans += a[i] + ", ";
		}
		if(ans.length() == 0) System.out.println("NONE");
		else System.out.println(ans.substring(0, ans.length() - 2));
	}

}
