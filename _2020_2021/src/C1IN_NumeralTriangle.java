import java.util.*;
import java.io.*;

public class C1IN_NumeralTriangle {
	
	static Scanner in;
	static int r;
	static String s, d;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		in = new Scanner(new File("2021c1in.in"));
		s = in.next();
		d = in.next();
		r = in.nextInt();
		
		int sum = 0;
		int increase = Integer.parseInt(d, 8);
		int tempnum = 0;
		String tempstr = s;
		for(int i = 2; i <= r; i++) {
			for(int j = 1; j <= i; j++) {
				tempnum = Integer.parseInt(tempstr, 8);
				tempnum += increase;
				tempstr = Integer.toOctalString(tempnum);
				//System.out.println(tempstr);
				if(i == r) {
					for(int k = 0; k < tempstr.length(); k++) {
						sum+=Integer.parseInt(tempstr.substring(k, k + 1));
					}
				}
			}
			//System.out.println(i);
			//System.out.println();
		}
		System.out.println(sum);
	}

}
