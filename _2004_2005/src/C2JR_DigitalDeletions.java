import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class C2JR_DigitalDeletions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(new File("0405c2jr.in"));
			
			for(int gLoop = 0; gLoop < 7; gLoop++) {
				int num = in.nextInt();
				String[] numbers = in.nextLine().split(" ");
				
				ArrayList<Integer> list = new ArrayList<Integer>();
				int moves = 0;
				
				for(int i = 0; i < num; i++) {
					list.add(Integer.parseInt(numbers[i]));
				}
				
				System.out.println(num);
				System.out.println(Arrays.toString(numbers));
				for(int i = 0; i < num; i++) {
					System.out.println(list.get(i));
				}
				
				/*
				for(int i = list.size() - 1; i > 0; i--) {
					if(list.get(i) == 0) {
						list.subList(0, i).clear();
						moves++;
					}
				}
				
				while(list.size() > 0) {
					
					int max = 0;
					int x = 0;
					for(int i = list.size() - 1; i > 0; i--) {
						max = Math.max(max, list.get(i));
						x = list.indexOf(max);
					}
					if(max % 2 == 0) {
						max -= 2;
						list.set(x, max);
						moves++;
					} else {
						max -= 1;
						list.set(x, max);
						moves++;
					}
				}
				
				System.out.println(moves);
				*/
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
