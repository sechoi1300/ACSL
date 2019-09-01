import java.util.*;
import java.io.*;

public class C1IN_Triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(new File("0708c1in.in"));
			
			for(int gLoop = 0; gLoop < 10; gLoop++) {
				
				double[] first = new double[3];
				double[] second = new double[3];
				String[] output = new String[3];
				
				for(int i = 0; i < 3; i++) {
					first[i] = in.nextDouble();
				}
				
				for(int i = 0; i < 3; i++) {
					second[i] = in.nextDouble();
				}
				
				if(first[0] == second[0] && first[1] == second[1] && first[2] == second[2]) {
					System.out.println("DEF");
				}
				else if(first[0] == second[2] && first[1] == second[1] && first[2] == second[0]) {
					System.out.println("DFE");
				}
				else if(first[0] == second[1] && first[1] == second[0] && first[2] == second[2]) {
					System.out.println("FED");
				}
				else if(first[0] == second[2] && first[1] == second[0] && first[2] == second[1]) {
					System.out.println("FDE");
				}
				else if(first[0] == second[0] && first[1] == second[2] && first[2] == second[1]) {
					System.out.println("EDF");
				}
				else if(first[0] == second[1] && first[1] == second[2] && first[2] == second[0]) {
					System.out.println("EFD");
				}
				else {
					System.out.println("NONE");
				}
								
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
