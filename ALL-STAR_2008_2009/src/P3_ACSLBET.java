import java.util.*;
import java.io.*;

public class P3_ACSLBET {
	
	static Scanner in;
	static String input;
	static String result;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		in = new Scanner(new File("0809P3in.in"));
		
		for(int i = 0; i < 2; i++) {
			try {
				init();
				solve();
			} catch (Exception e) {
				in.nextLine();
				System.out.println("Error");
				e.printStackTrace();
			}
		}
		in.close();
	}
	
	static void init() {
		String temp = in.next();
		input = "";
		for(int i = 0; i < temp.length(); i++) {
			char c = temp.charAt(i);
			if(c == '*') input += Integer.toBinaryString(27);
			else if(c == '/') input += Integer.toBinaryString(28);
			else if(c == '$') input += Integer.toBinaryString(29);
			else if(c == '%') input += Integer.toBinaryString(30);
			else if(c == '#') input += Integer.toBinaryString(31);
			else input += Integer.toBinaryString(c - 64);
		}
		result = "";
	}
	
	static void solve() {
		String temp = "";
		//1. LCIRC–2
		
		temp = circle(input, false, 2);
		result += convert(temp) + "\n";
		
		//2. RSHIFT–4
		
		temp = shift(input, true, 4);
		result += convert(temp) + "\n";

		//3. RCIRC–10
		
		temp = circle(input, true, 10);
		result += convert(temp) + "\n";
		
		//4. LSHIFT–8
		
		temp = shift(input, false, 8);
		result += convert(temp) + "\n";
		
		//5. LCIRC–5(RSHIFT–3)
		
		temp = circle(shift(input, true, 3), false, 5);
		result += convert(temp) + "\n";
		
		//6. LSHIFT –5(RCIRC-8)
		
		temp = shift(circle(input, true, 8), false, 5);
		result += convert(temp) + "\n";
		
		//7. RSHIFT-2 AND LCIRC-4
		
		temp = and(shift(input, true, 2), circle(input, false, 4));
		result += convert(temp) + "\n";
		
		//8. RCIRC-6 OR LCIRC-3
		
		temp = or(circle(input, true, 6), circle(input, false, 3));
		result += convert(temp) + "\n";
		
		//9. LSHIFT–9 XOR LCIRC–7
		
		temp = xor(shift(input, false, 9), circle(input, false, 7));
		result += convert(temp) + "\n";
		
		//10. RCIRC-4 OR LCIRC-2 AND RSHIFT-1
		temp = or(and(circle(input, false, 2), shift(input, true, 1)), circle(input, true, 4));
		result += convert(temp) + "\n";
		
		System.out.println(result);
	}
	
	static String convert(String a) {
		String check = a;
		String temp = "";
		for(int i = a.length() - 1; i > 0; i--) {
			if(check.length() >= 5) {
				String t1 = check.substring(check.length() - 5);
				int n1 = Integer.parseInt(t1, 2);
				char c = 0;
				if(n1 == 27) c = '*';
				else if(n1 == 28) c = '/';
				else if(n1 == 29) c = '$';
				else if(n1 == 30) c = '%';
				else if(n1 == 31) c = '#';
				else if(1 <= n1 && n1 <= 26) c = (char)(n1 + 64);
				temp = c + temp;
				check = check.substring(0, check.length() - 5);
				i-=4;
			}
			if(check.length() == 0) break;
			if(check.length() < 5) {
				String t1 = check;
				int n1 = Integer.parseInt(t1, 2);
				char c = 0;
				if(n1 == 27) c = '*';
				else if(n1 == 28) c = '/';
				else if(n1 == 29) c = '$';
				else if(n1 == 30) c = '%';
				else if(n1 == 31) c = '#';
				else if(1 <= n1 && n1 <= 26) c = (char)(n1 + 64);
				temp = c + temp;
				break;
			}
		}
		return temp;
	}
	
	static String circle(String a, boolean b, int n) {
		String s = "";
		if(b) {
			String temp = a.substring(a.length() - n, a.length());
			s = a.substring(0, a.length() - n);
			s = temp + s;
		} else {
			String temp = a.substring(0, n);
			s = a.substring(n);
			s = s + temp;
		}
		return s;
	}
	
	static String shift(String a, boolean b, int n) {
		String s = "";
		if(b) {
			for(int i = 0; i < n; i++) {
				s += "0";
			}
			for(int i = 0; i < a.length() - n; i++) {
				s += a.charAt(i);
			}
		} else {
			for(int i = n; i < a.length(); i++) {
				s += a.charAt(i);
			}
			for(int i = 0; i < n; i++) {
				s += "0";
			}
		}
		return s;
	}
	
	static String or(String a, String b) {
		String result = "";
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == '1' || b.charAt(i) == '1') result+="1";
			else result+="0";
		}
		return result;
	}
	
	static String xor(String a, String b) {
		String result = "";
		for(int i = 0; i < a.length(); i++) {
			if((a.charAt(i) == '1' && b.charAt(i) == '0') || (a.charAt(i) == '0' && b.charAt(i) == '1')) result+="1";
			else result+="0";
		}
		return result;
	}
	
	static String and(String a, String b) {
		String result = "";
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == '1' && b.charAt(i) == '1') result+="1";
			else result+="0";
		}
		return result;
	}

}
