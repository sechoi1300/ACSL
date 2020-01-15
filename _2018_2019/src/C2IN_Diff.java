import java.util.*;
import java.io.*;

public class C2IN_Diff {
	
	static Scanner in;
	static String a, b, s1, s2, s3, s4, result;
	static char[] aletters, bletters, s1letters, s2letters, s3letters, s4letters;
	static int n;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		in = new Scanner (new File("1819c2in.in"));
		
		for(int i = 0; i < 5; i++) {
			
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
		a = in.next();
		b = in.next();
		aletters = a.toCharArray();
		bletters = b.toCharArray();
		s1 = diff(a, b);
		s2 = diff(b, a);
		s3 = diff(r(a), r(b));
		s4 = diff(r(b), r(a));
	}
	
	static void solve() {
		TreeSet<Character> set = new TreeSet<Character>();
		for(int i = 'a'; i <= 'z'; i++) {
			if(s1.indexOf(i) != -1 && s2.indexOf(i) != -1 && s3.indexOf(i) != -1 && s4.indexOf(i) != -1) {
				set.add((char)i);
			}
		}
		for(char c : set) {
			result += c;
		}
		if(result.equals("")) System.out.println("NONE");
		else System.out.println(result);
	}
	
	static String diff(String a, String b) {
		String s = "";
		for(int i = 0; i < a.length(); i++) {
			n = b.indexOf(aletters[i]);
			if(n != -1) {
				s+=aletters[i];
				b = b.substring(n + 1);
			}
			if(b.length() == 0) break;
		}
		return s;
	}
	
	static String r(String s) {
		String str = "";
		for(int i = s.length() - 1; i > 0; i--) {
	        str += s.charAt(i);
	    }
	    return str;
	}

}
