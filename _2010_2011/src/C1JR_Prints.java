import java.util.*;
import java.io.*;

public class C1JR_Prints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(new File("1011c1jr.in"));
			
			for(int gLoop = 0; gLoop < 7; gLoop++) {
				
				String[] temp = in.nextLine().split(" ");
				int[] num = new int[temp.length - 1];
				int[] even = new int[5];
				int[] odd = new int[5];
				int evenSum = 0;
				int oddSum = 0;
				
				for(int i = 0; i < num.length; i++) {
				 	num[i] = Integer.parseInt(temp[i]);
				}
				
				for(int i = 0; i < num.length; i++) {
					if(num[i] % 2 == 0) {
						even[i] = num[i];
					} else {
						odd[i] = num[i];
					}
				}
				
				for(int i = 0; i < num.length; i++) {
					if(even[i] == 10) {
						even[i] = 1;
					} else if(even[i] == 8) {
						even[i] = 2;
					} else if(even[i] == 6) {
						even[i] = 4;
					} else if(even[i] == 4) {
						even[i] = 8;
					} else if(even[i] == 2){
						even[i] = 16;
					} else {
						even[i] = 0;
					}
				}
				
				for(int i = 0; i < num.length; i++) {
					if(odd[i] == 9) {
						odd[i] = 1;
					} else if(odd[i] == 7) {
						odd[i] = 2;
					} else if(odd[i] == 5) {
						odd[i] = 4;
					} else if(odd[i] == 3) {
						odd[i] = 8;
					} else if(odd[i] == 1){
						odd[i] = 16;
					} else {
						odd[i] = 0;
					}
				}
				
				for(int i = 0; i < num.length; i++) {
					evenSum += even[i];
					oddSum += odd[i];
				}
				
				System.out.println((1 + evenSum) + "/" + (1 + oddSum));
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
