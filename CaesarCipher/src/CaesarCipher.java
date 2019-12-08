import java.util.*;
import java.io.*;

public class CaesarCipher {
	
	static Scanner in;
	static String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	static String[] phrase, str;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		in = new Scanner(new File("CaesarCipher.in"));
		
		for(int i = 0; i < 2; i ++) {
			try {
				init();
				solve();
			}
			catch(Exception e) {
				in.nextLine();
				System.out.println("Error");
				//e.printStackTrace();
			}
		}
		
		in.close();
	}
	
	static void init() {
		phrase = in.nextLine().split(" ");
		for(int i = 0; i < phrase.length; i ++) {
			System.out.println(phrase[i]);
			//str[i] = phrase[i].toUpperCase();
		}
		System.out.println(Arrays.toString(str));
	}
	
	static void solve() {
		//for(int i = 0; i < )
	}

}
