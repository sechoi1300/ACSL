import java.util.*;
import java.io.*;

public class C2IN_ACSLSamenessFactor {
	
	static Scanner in;
	static String s1, s2, s1temp, s2temp;
	static char[] char1, char2;
	static int result;
	static boolean repeat;
	
	public static void main(String[]args) throws IOException {
		
		//in = new Scanner(new File("1920c2in.in"));
		in = new Scanner(new File("bleh"));
		
		//for(int i = 0; i < 5; i++) {
			
			try {
				init();
				solve();
			}
			catch(Exception e) {
				in.nextLine();
				System.out.println("Error");
				//e.printStackTrace();
			}
		//}
		
		in.close();
	}
	
	static void init() {
		s1 = in.next();
		s2 = in.next();
		char1 = s1.toCharArray();
		char2 = s2.toCharArray();
		result = 0;
		repeat = true;
	}
	
	static void solve() {
		while(repeat) {
			for(int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
				if(s1.charAt(i) == s2.charAt(i)) {
					char1[i] = '-';
					char2[i] = '-';
				}
			}
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
			for(int i = 1; i < Math.min(s1.length(), s2.length()) - 1; i++) {
				if(char1[i] == char2[i - 1]) {
					char1[i - 1] = '-';
				}
				if(char2[i] == char1[i - 1]) {
					char2[i - 1] = '-';
				}
				if(char2[i] == char1[i + 1]) {
					char1[i] = '-';
				}
				if(char1[i] == char2[i + 1]) {
					char2[i] = '-';
				}
			}
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
			
			for(int i = 0; i < char1.length; i++) {
				if(s2.indexOf(char1[i]) == -1 && i == char1.length - 1) {
					repeat = false;
				}
			}
			if(!repeat) break;
		}
		
		System.out.println(Arrays.toString(char1));
		System.out.println(Arrays.toString(char2));
		
		for(int i = 0; i < Math.min(char1.length, char2.length); i++) {
			result += (char1[i] - char2[i]);
		}
		result += Math.abs(char1.length - char2.length);
		System.out.println(result);
		
	}
	
}