import java.util.*;
import java.io.*;

public class C1JR_CHMOD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(new File("1516c1jr.in"));
			
			for(int gLoop = 0; gLoop < 10; gLoop++) {
				String[] permission = new String[10];
				
				int x = in.nextInt();
				String binaryX = String.format("%3s", Integer.toBinaryString(x)).replace(' ', '0');
				int y = in.nextInt();
				String binaryY = String.format("%3s", Integer.toBinaryString(y)).replace(' ', '0');
				int z = in.nextInt();
				String binaryZ = String.format("%3s", Integer.toBinaryString(z)).replace(' ', '0');
				
				System.out.print(binaryX + " " + binaryY + " " + binaryZ + " and ");
				
				if(binaryX.substring(0, 1).equals("1")) {
					permission[0] = "r";
				} else {
					permission[0] = "-";
				}
				if(binaryX.substring(1, 2).equals("1")) {
					permission[1] = "w";
				} else {
					permission[1] = "-";
				}
				if(binaryX.substring(2, 3).equals("1")) {
					permission[2] = "x";
				} else {
					permission[2] = "-";
				}
				
				if(binaryY.substring(0, 1).equals("1")) {
					permission[3] = "r";
				} else {
					permission[3] = "-";
				}
				if(binaryY.substring(1, 2).equals("1")) {
					permission[4] = "w";
				} else {
					permission[4] = "-";
				}
				if(binaryY.substring(2, 3).equals("1")) {
					permission[5] = "x";
				} else {
					permission[5] = "-";
				}
				
				if(binaryZ.substring(0, 1).equals("1")) {
					permission[6] = "r";
				} else {
					permission[6] = "-";
				}
				if(binaryZ.substring(1, 2).equals("1")) {
					permission[7] = "w";
				} else {
					permission[7] = "-";
				}
				if(binaryZ.substring(2, 3).equals("1")) {
					permission[8] = "x";
				} else {
					permission[8] = "-";
				}
				
				for(int i = 0; i < 9; i++) {
					if(i == 2 || i == 5) {
						System.out.print(permission[i] + " ");
					} else {
						System.out.print(permission[i]);
					}
				}
				System.out.println();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
