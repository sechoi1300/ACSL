import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class Bucket_List {
	
	static Scanner in;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		in = new Scanner(new File("bucket_list"));
		
		int N = in.nextInt();
		int[] a = new int[1001];
		
		for(int i = 0; i < N; i++) {
			int si = in.nextInt();
			int ti = in.nextInt();
			int bi = in.nextInt();
			
			for(int j = si; j <= ti; j++) {
				a[j] += bi;
			}
		}
		Arrays.sort(a);
		System.out.println(a[1000]);
	}

}
