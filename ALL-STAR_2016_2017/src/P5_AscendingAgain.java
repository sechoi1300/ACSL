import java.util.*;
import java.io.*;

public class P5_AscendingAgain {

	static Scanner in;
	static String str, result;
	static int size;
	static ArrayList<Integer> analyze;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		in = new Scanner(new File("1617P5in.in"));
		
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
		str = in.nextLine();
		size = (int)(str.charAt(0)) - 48;
		char[] c = str.substring(1).toCharArray();
		analyze = new ArrayList<Integer>();;
		for(int i = 0; i < c.length; i++) {
			analyze.add(c[i] - 48);
		}
		result = "";
	}
	
	static void solve() {
		String temp = "";
		int count = 0;
		int previous = 0;
		while(true) {
			if(analyze.size() >= size) {
				for(int j = 0; j < size; j++) {
					int min = 1000000;
					int index = 0;
					for(int i = 0; i < analyze.size(); i++) {
						if(analyze.get(i) < min) {
							if(j == 0 && analyze.get(i) == 0) continue;
							min = Math.min(analyze.get(i), min);
							index = i;
						}
					}
					temp+=min;
					analyze.remove(index);
					if(temp.length() == size) {
						previous = Integer.parseInt(temp);
						if(Integer.parseInt(temp) > previous) {
							result+=" " + temp;
							temp = "";
						}
					}
				}
			} else break;
		}
		System.out.println(result.substring(1));
	}

}
