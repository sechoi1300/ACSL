import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class C1JR_Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Scanner in = new Scanner(new File("1415c1jr.in"));
			
			for(int gLoop = 0; gLoop < 2; gLoop++) {
				
				double mpg = in.nextDouble();
				double ppg = in.nextDouble();
				double avgspeed = in.nextDouble();
				int A = 0;
				int B = 450;
				int C = 590;
				int D = 710;
				int E = 1030;
				int F = 1280;
				int G = 1360;
				
				for(int loop = 0; loop < 5; loop++) {
					String startstr = in.next();
					char charStart = startstr.charAt(0);
					int start = 0;
					String endstr = in.next();
					char charEnd = endstr.charAt(0);
					int end = 0;
					
					if(charStart == 'A') {
						start = A;
					} else if(charStart == 'B') {
						start = B;
					} else if(charStart == 'C') {
						start = C;
					} else if(charStart == 'D') {
						start = D;
					} else if(charStart == 'E') {
						start = E;
					} else if(charStart == 'F') {
						start = F;
					} else if(charStart == 'G') {
						start = G;
					}
					
					if(charEnd == 'A') {
						end = A;
					} else if(charEnd == 'B') {
						end = B;
					} else if(charEnd == 'C') {
						end = C;
					} else if(charEnd == 'D') {
						end = D;
					} else if(charEnd == 'E') {
						end = E;
					} else if(charEnd == 'F') {
						end = F;
					} else if(charEnd == 'G') {
						end = G;
					}
					
					//(int)time + ":" + (int)((time - (int)time) * 60)
					double distance = end - start;
					DecimalFormat num = new DecimalFormat("00.00");
					double x = (distance / avgspeed);
					String time = num.format(x);
					double y = Double.parseDouble(time.substring(3, 5));
					int min = (int)(((y * 60) / 100) * 100) / 100;
					System.out.print(Math.round(distance) + ", ");
					System.out.print(time.substring(0, 2) + ":" + min + ", ");
					System.out.println("$" + String.format("%.2f", (distance / mpg * ppg)));
				}
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
