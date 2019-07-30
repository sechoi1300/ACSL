import java.util.*;
import java.io.*;

public class C1JR_PostOffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(new File("0506c1jr.in"));
			for(int gLoop = 0; gLoop < 10; gLoop++) {
				double[] values = new double[3];
				
				double length = in.nextDouble();;
				double height = in.nextDouble();
				double thick = in.nextDouble();
				double thing = length + 2 * (thick + height);
				
				if(length >= 3.5 && length <= 4.25 && height >= 3.5 && height <= 6 && thick >= 0.007 && thick <= 0.016) {
					System.out.println("regular post card");
				} else if(length >= 4.25 && length <= 6 && height >= 6 && height <= 11.5 && thick >= 0.007 && thick <= 0.016) {
					System.out.println("large post card");
				} else if(length >= 3.5 && length <= 6.125 && height >= 5 && height <= 11.5 && thick >= 0.016 && thick <= 0.25) {
					System.out.println("envelope");
				} else if(length >= 6.125 && length <= 24 && height >= 11 && height <= 18 && thick >= 0.25 && thick <= 0.5) {
					System.out.println("large envelope");
				} else if(thick >= 0.5 && thing <= 84) {
					System.out.println("package");
				} else if(thick >= 0.5 && thing >= 84 && thing <= 130) {
					System.out.println("large package");
				} else {
					System.out.println("unmailable");
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
