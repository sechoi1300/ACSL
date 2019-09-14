import java.util.*;
import java.io.*;

public class C1IN_Triangles {
	
	static Scanner in;
	static String t1[];
	static HashMap<String, Character> t2;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		in = new Scanner(new File("0708c1in.in"));
		
		for(int gLoop = 0; gLoop < 10; gLoop++) {
				
			try {
				init();
				solve();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	static void init() {
		String[] t = in.nextLine().split(" ");
		t1 = new String[] {t[1], t[2], t[0]};
		t2 = new HashMap<String, Character>();
		
		t2.put(t[3], 'F');
		t2.put(t[4], 'D');
		t2.put(t[5], 'E');
	}
	
	static void solve() {
		String output = "";
		
		for(int i = 0; i < 3; i++) {
			if(t2.get(t1[i]) == null) {
				output = "NONE";
				break;
			} else {
				output += t2.get(t1[i]);
			}
		}
		System.out.println(output);
	}
	
}