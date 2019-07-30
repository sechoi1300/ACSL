import java.util.*;
import java.io.*;

public class C1JR_Asterisks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(new File("0203c1jr.in"));
			
			//Giant for loop
			for(int x = 0; x < 9; x++) {
				String[] temp = in.nextLine().split(" ");
				char fig = temp[0].charAt(0);
				int[] nums = new int[2];
				nums[0] = Integer.parseInt(temp[1]);
				nums[1] = fig == 'B' ? Integer.parseInt(temp[2]) : nums[0]; 
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void figureS(int height) {
		for(int x = 1; x <= height; x++) {
			for(int y = 1; y <= height; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void figureH(int height) {
		for(int x = height; x > 0; x--) {
			for(int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void figureL(int height) {
		for(int x = 1; x <= height; x++) {
			for(int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void figureB(int length, int width) {
		for(int x = 1; x <= length; x++) {
			for(int y = 1; y <= width; y++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
}