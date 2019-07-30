import java.util.*;
import java.io.*;

public class C1JR_TimeSheets {
	
	static double sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(new File("1213c1jr.in"));
			
			for(int gLoop = 0; gLoop < 8; gLoop++) {
				int location = in.nextInt();
				int startTime = in.nextInt();
				String str = in.next();
				char end = str.charAt(0);
				int endTime = Character.getNumericValue(end);
				double workTime = Double.valueOf(endTime - startTime) / 2;
				
				if( 1 <= location && location <= 9) {
					locationA(workTime);
				} else if(location >= 10 && location <= 19) {
					locationB(workTime);
				} else {
					locationC(workTime);
				}
			
				if(gLoop == 3) {
					System.out.println("$" + sum + "0");
					sum = 0;
				} else if(gLoop == 7) {
					System.out.println("$" + sum + "0");
				}
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void locationA(double workTime) {
		System.out.println("$" + (10 * workTime) + "0");
		sum += 10 * workTime;
	}
	
	public static void locationB(double workTime) {
		if(workTime > 4) {
			double initial = 8 * 4;
			double overTime = 12 * (workTime - 4);
			System.out.println("$" + (initial + overTime) + "0");
			sum += initial + overTime;
		} else {
			System.out.println("$" + (workTime * 8) + "0");
			sum += workTime * 8;
		}
	}
	
	public static void locationC(double workTime) {
		if(workTime > 4) {
			double initial = 12 * 4;
			double overTime = 24 * (workTime - 4);
			System.out.println("$" + (initial + overTime) + "0");
			sum += initial + overTime;
		} else {
			System.out.println("$" + (workTime * 12) + "0");
			sum += workTime * 12;
		}
	}
	
}
