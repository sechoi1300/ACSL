import java.util.*;
import java.io.*;

public class Time_Sheets {

	static Scanner in;
	static PrintWriter out;
	static int location, total, pay;
	static String st, et;
	static double time, start, end;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		in = new Scanner(new File("timesheets.in"));
		out = new PrintWriter(new File("timesheets.out"));
		
		total = 0;
		
		for(int gLoop = 1; gLoop < 9; gLoop++) {
			init();
			solve();
			if(gLoop % 4 == 0) {
				out.println("$" + total + ".00");
				total = 0;
			}
		}
		
		in.close();
		out.close();
	}
	
	public static void init() {
		location = in.nextInt();
		st = in.next();
		et = in.next();
		if(st.equals("A")) {
			start = 10;
		}
		if(st.equals("B")) {
			start = 11;
		}
		if(st.equals("C")) {
			start = 12;
		}
		if(st.equals("D")) {
			start = 13;
		}
		if(st.equals("E")) {
			start = 14;
		}
		if(st.equals("F")) {
			start = 15;
		}
		if(st.equals("G")) {
			start = 16;
		}
		if(st.equals("H")) {
			start = 17;
		}
		if(et.equals("A")) {
			end = 10;
		}
		if(et.equals("B")) {
			end = 11;
		}
		if(et.equals("C")) {
			end = 12;
		}
		if(et.equals("D")) {
			end = 13;
		}
		if(et.equals("E")) {
			end = 14;
		}
		if(et.equals("F")) {
			end = 15;
		}
		if(et.equals("G")) {
			end = 16;
		}
		if(et.equals("H")) {
			end = 17;
		}
		if(st.equals("1") || st.equals("2") || st.equals("3") || st.equals("4") || st.equals("5") || st.equals("6") || st.equals("7") || st.equals("8") || st.equals("9")) {
			start = Integer.parseInt(st);
		}
		if(et.equals("1") || et.equals("2") || et.equals("3") || et.equals("4") || et.equals("5") || et.equals("6") || et.equals("7") || et.equals("8") || et.equals("9")) {
			end = Integer.parseInt(et);
		}
		time = (end - start) / 2;
	}
	
	public static void solve() {
		if(location >= 1 && location <= 9) {
			pay = 10 *  (int)time;
			total += pay;
			out.println("$" + pay + ".00");
		}
		if(location >= 10 && location <= 19) {
			if(time > 4) {
				pay = (int) (12 * (time - 4) + 32);
				total += pay;
				out.println("$" + pay + ".00");
			} else {
				pay = 8 * (int)time;
				total += pay;
				out.println("$" + pay + ".00");
			}
		}
		if(location >= 20 && location <= 29) {
			if(time > 4) {
				pay = (int) (24 * (time - 4) + 48);
				total += pay;
				out.println("$" + pay + ".00");
			} else {
				pay = 12 * (int)time;
				total += pay;
				out.println("$" + pay + ".00");
			}
		}
	}
	
}
