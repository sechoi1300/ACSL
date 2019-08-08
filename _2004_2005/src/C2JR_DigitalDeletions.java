import java.util.*;
import java.io.*;

public class C2JR_DigitalDeletions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(new File("0405c2jr.in"));
			
			for(int gLoop = 0; gLoop < 7; gLoop++) {
				String[] num = in.nextLine().split(" ");
				ArrayList<Integer> list = new ArrayList<Integer>();
				int moves = 0;
				
				for(int i = 0; i < num.length; i++) {
					list.add(Integer.parseInt(num[i]));
				}
				
				while(list.size() > 0) {
					for(int i = list.size(); i > 0; i--) {
						if((Integer)list.get(i) == 0) {
							for(int l = 0; l < i; l++) {
								list.remove(l);
							}
							moves++;
						} else {
							continue;
						}
					}
					int max = 0;
					for(int i = list.size(); i > 0; i--) {
						max = Math.max(max, list.get(i));
					}
					if(max % 2 == 0) {
						max -= 2;
						moves++;
					} else {
						max -= 1;
						moves++;
					}
				}
				
				System.out.println(moves);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
