/*
Sejin Eric Choi
Grade 10
STEMPIA
Intermediate
Contest 2
*/
import java.util.*;
import java.io.*;

public class C2IN_ACSLSamenessFactor {
	
	static Scanner in;
	static String s1, s2, s1temp, s2temp;
	static char[] char1, char2;
	static int result;
	
	public static void main(String[]args) throws IOException {
		
		in = new Scanner(new File("1920c2in.in"));
		//in = new Scanner(new File("bleh"));
		
		for(int i = 0; i < 10; i++) {
			
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
		s1 = in.next();
		s2 = in.next();
		char1 = s1.toCharArray();
		char2 = s2.toCharArray();
		result = 0;
	}
	
	static void solve() {
		while(true) {
			for(int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
				if(s1.charAt(i) == s2.charAt(i)) {
					char1[i] = '-';
					char2[i] = '-';
				}
			}
			
			convert();
			
			boolean a = false;
			
			for(int i = 0; i < Math.min(s1.length(), s2.length()) - 1; i++) {
				if(char1[i] == char2[i + 1]) {
					char2[i] = '-';
					a = true;
					break;
				}
				if(char2[i] == char1[i + 1]) {
					char1[i] = '-';
					a = true;
					break;
				}
			}
			
			convert();
			
			if(s1.length() - s2.length() == 1) {
				if(char1[s1.length() - 1] == char2[s2.length() - 1]) {
					char1[s1.length() - 2] = '-';
				}
			}
			
			convert();
			
			if(s2.length() - s1.length() == 1) {
				if(char2[s2.length() - 1] == char1[s1.length() - 1]) {
					char2[s2.length() - 2] = '-';
				}
			}
			
			convert();
			
			if(!a) break;
		}
		for(int i = 0; i < Math.min(char1.length, char2.length); i++) {
			result += (char1[i] - char2[i]);
		}
		result += Math.abs(char1.length - char2.length);
		System.out.println(result);
		
	}
	
	static void convert() {
		s1 = "";
		s2 = "";
		for(int i = 0; i < char1.length; i++) {
			if(char1[i] == '-') {
				continue;
			} else {
				s1 += char1[i];
			}
		}
		for(int i = 0; i < char2.length; i++) {
			if(char2[i] == '-') {
				continue;
			} else {
				s2 += char2[i];
			}
		}
		char1 = s1.toCharArray();
		char2 = s2.toCharArray();
	}
	
	
}