import java.util.*;
import java.io.*;

public class P3_ACSLKrypto {
	
	static Scanner in;
	static int[] nums;
	static int target;
	static boolean[] performedop;
	static char[] operations;
	static int temp;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		in = new Scanner(new File("0910P3in.in"));
		
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
		String[] temps = in.nextLine().split(", ");
		int[] nums = new int[5];
		for(int i = 0; i < 5; i++) {
			nums[i] = Integer.parseInt(temps[i]);
		}
		target = in.nextInt();
		int[] ans = solve(nums, target);
	}
	
	static int[] solve(int[] nums, int target) {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					for(int l = 0; l < 4; l++) {
						if(isUnique(i, j, k, l)) {
							int sol = compute(i, j, k, l, nums);
						}
					}
				}
			}
		}
	}
	
	static int compute_small(int op, int ans, int operand) {
		if(op == 0) return ans + operand;
		else if(op == 1) return ans - operand;
		else if(op == 2) return ans * operand;
		else return ans / operand;
	}
	
	static boolean isUnique(int i, int j, int k, int l) {
		return i != j && i != k && i != l && j != k && j != l && k != l;
	}
	
	static int compute(int i, int j, int k, int l, int[] nums) {
		int ans = nums[0];
		ans = compute_small(i, ans, nums[1]);
		ans = compute_small(j, ans, nums[1]);
		ans = compute_small(k, ans, nums[1]);
		ans = compute_small(l, ans, nums[1]);
		return ans;
	}
 	
}
