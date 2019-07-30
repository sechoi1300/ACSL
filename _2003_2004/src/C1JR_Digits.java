import java.util.*;
import java.io.*;

public class C1JR_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//1. Set up input file
			Scanner in = new Scanner(new File("0304c1jr.in"));
			
				//2. Giant for loop
				for(int gLoop = 0; gLoop < 10; gLoop++) {
				
				//2a. Find largest digit
				String temp = in.nextLine();
				int indexL = 0;
				
				for(int i = 0; i < temp.length(); i++) {
					char og = temp.charAt(indexL);
					if(og < temp.charAt(i))
						indexL = i;
				}
				
				temp = temp.substring(0, indexL) + changeNum(temp.charAt(indexL)) + temp.substring(indexL + 1);
				
				System.out.println(Integer.parseInt(temp));
				
			}
			
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static char changeNum(char n) {
		int num = Character.getNumericValue(n);
		if(num % 2 == 1)
			return '0';
		return (char)('0' + (num + 4) % 10);
	}

}
