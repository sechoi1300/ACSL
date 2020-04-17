import java.util.*;
import java.io.*;

public class P4_Components {

	static Scanner in;
	static int N;
	static double connections;
	static String binary;
	static char[] c;
	static ArrayList<String> groups;
	static HashMap<Integer, String> adjacencyList;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		in = new Scanner(new File("1617P4in.in"));
		
		for(int i = 0; i < 1; i++) {
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
		N = in.nextInt();
		String hex = in.next();
		c = hex.toCharArray();
		binary = "9";
		hexToBinary();
		groups = new ArrayList<String>();
		adjacencyList = new HashMap<Integer, String>();
		System.out.println(binary);
	}
	
	static void solve() {
		for(int i = 0; i < N; i++) {
			adjacencyList.put(i, "");
		}
		for(int i = N; i > 0; i--) {
			String temp = binary.substring(1, i);
			for(int j = 0; j < temp.length(); j++) {
				if(temp.charAt(j) == '1') {
					adjacencyList.put(Math.abs(i - N), adjacencyList.get(Math.abs(i - N)) + (char)(j + (Math.abs(i - N)) + 66));
				}
			}
			binary = binary.charAt(0) + binary.substring(i);
		}
		for(int i : adjacencyList.keySet()) {
			String temp = (char)(i + 65) + adjacencyList.get(i);
			groups.add(temp);
		}
		for(int i = 0; i < groups.size() - 1; i++) {
			for(int j = i + 1; j < groups.size(); j++) {
				String temp = groups.get(i);
				String temp2 = groups.get(j);
				//compare(temp, temp2);
			}
		}
		System.out.println(adjacencyList);
		System.out.println(groups);
	}
	
	static void hexToBinary() {
		for(int i = 0; i < c.length; i++) {
			if(c[i] == '0') binary += "0000";
			else if(c[i] == '1') binary+="0001";
			else if(c[i] == '2') binary+="0010";
			else if(c[i] == '3') binary+="0011";
			else if(c[i] == '4') binary+="0100";
			else if(c[i] == '5') binary+="0101";
			else if(c[i] == '6') binary+="0110";
			else if(c[i] == '7') binary+="0111";
			else if(c[i] == '8') binary+="1000";
			else if(c[i] == '9') binary+="1001";
			else if(c[i] == 'A') binary+="1010";
			else if(c[i] == 'B') binary+="1011";
			else if(c[i] == 'C') binary+="1100";
			else if(c[i] == 'D') binary+="1101";
			else if(c[i] == 'E') binary+="1110";
			else binary+="F";
		}
	}
	
	static String compare(String str1, String str2) {
		boolean replace = false;
		int index1 = str1.length() + 1;
		int index2 = str2.length() + 1;
		for(int i = 0; i < str1.length(); i++) {
			for(int j = 0; j < str2.length(); j++) {
				if(str1.charAt(i) == str2.charAt(j)) {
					replace = true;
					index1 = i;
					index2 = j;
				}
			}
		}
		return "";
		/*
		String result = "";
		if(replace) {
			for(int)
		}
		*/
	}

}
