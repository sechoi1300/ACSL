import java.util.*;
import java.io.*;

public class P3_InverseMatrix {
	
	static Scanner in;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		in = new Scanner(new File("1011P3in.in"));
		
		for(int i = 0; i < 2; i++) {
			try {
				init();
				solve();
			} catch (Exception e) {
				in.nextLine();
				System.out.println("Error");
				e.printStackTrace();
			}
		}
		in.close();
	}
	
	static void init() {
		String[] temp = in.nextLine().split(",");
		int[] data = new int[9];
		for(int i = 0; i < 9; i++) {
			data[i] = Integer.parseInt(temp[i]);
		}
	}
	
	static void solve() {
		
	}
	
	public static class matrix {
		int a, b, c;
		int d, e, f;
		int g, h, i;
	}
	
	public static matrix initMatrix(int[] nums) {
		matrix ret = new matrix();
		ret.a = nums[0];
		ret.b = nums[1];
		ret.c = nums[2];
		ret.d = nums[3];
		ret.e = nums[4];
		ret.f = nums[5];
		ret.g = nums[6];
		ret.h = nums[7];
		ret.i = nums[8];
		return ret;
	}
	
	static void printMatrix(matrix m) {
		System.out.printf("%4d %4d %4d\n", m.a, m.b, m.c);
	}

}
