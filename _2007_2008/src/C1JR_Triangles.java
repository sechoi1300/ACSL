import java.util.*;
import java.io.*;

public class C1JR_Triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(new File("0708c1jr.in"));
			
			for(int gLoop = 0; gLoop < 10; gLoop++) {
				
				double[] first = new double[3];
				double[] second = new double[3];
				int pairs = 0;
				
				for(int i = 0; i < 3; i++) {
					first[i] = in.nextDouble();
				}
				
				for(int i = 0; i < 3; i++) {
					second[i] = in.nextDouble();
				}
				
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						if(first[i] == second[j] && first[i] != 0) {
							pairs++;
							first[i] = 0;
							second[j] = 0;
						}
					}
				}
				
				System.out.println(pairs);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
