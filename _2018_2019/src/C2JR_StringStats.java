import java.util.*;
import java.io.*;

public class C2JR_StringStats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(new File("1819c2jr.in"));
			String s = in.nextLine();
			
			String temp = s.toLowerCase().replaceAll("[^a-z]", "");
			Set<Character> c = new HashSet<Character>();
			for(int i = 0; i < temp.length(); i++) {
				c.add(temp.charAt(i));
			}
			System.out.println(c.size());
			
			String _2 = temp.replaceAll("[^aeiou]", "");
			System.out.println(_2.length());
			
			String _3 = s.replaceAll("[^A-Z]", "");
			System.out.println(_3.length());
			
			Map<Character, Integer> m = new HashMap<Character, Integer>();
			for(int i = 0; i < temp.length(); i++) {
				 char key = temp.charAt(i);
				 if(m.containsKey(key)) {
					 m.put(key,  m.get(key) + 1);
				 } else {
					 m.put(key, 1);
				 }
			}
			
			int max = 0;
			for(char key:m.keySet()) {
				max = Math.max(max, m.get(key));
			}
			System.out.println(max);
			
			String[] _5 = s.replaceAll("[^a-zA-Z0-9\\s]", "").split(" ");
			for(int i = 0; i < _5.length; i++) {
				max = Math.max(max, _5[i].length());
			}
			for(int i = 0; i < _5.length; i++) {
				if(_5[i].length() == max) { 
					System.out.println(_5[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
