/*
Sejin Eric CHoi
Grade 10
STEMPIA
Intermediate
Contest 3
*/
import java.util.*;
import java.io.*;

public class C3IN_Veitch {

	static Scanner in;
	static ArrayList<String> a;
	static int[][] grid, masterGrid;
	static int[][][] grids;
	static String temp, result;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		in = new Scanner(new File("1920c3in.in"));
		
		for(int i = 0; i < 10; i++) {
			try {
				init();
				solve();
			}
			catch (Exception e) {
				in.nextLine();
				System.out.println("Error");
				e.printStackTrace();
			}
		}
		in.close();
	}
	
	static void init() {
		grid = new int[4][4];
		String line = in.nextLine();
		a = new ArrayList<String>();
		String condition = "";
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) != '+') condition+=line.charAt(i);
			else {
				a.add(condition);
				condition = "";
			}
			if(i == line.length() - 1) a.add(condition);
		}
		grids = new int[a.size()][4][4];
		masterGrid = new int[4][4];
		result = "";
	}
	
	static void solve() {
		for(int i = 0; i < a.size(); i++) {
			temp = a.get(i);
			if(temp.charAt(0) == '~') {
				grid(temp.substring(0, 2), 1);
				temp = temp.substring(2);
				while(true) {
					if(temp.length() >= 1) {
						if(temp.charAt(0) == '~') {
							grid(temp.substring(1, 2), 0);
							temp = temp.substring(2);
						}
						else {
							grid("~" + temp.substring(0, 1), 0);
							temp = temp.substring(1);
						}
					} else break;
				}
			} else {
				grid(temp.substring(0, 1), 1);
				temp = temp.substring(1);
				while(true) {
					if(temp.length() >= 1) {
						if(temp.charAt(0) == '~') {
							grid(temp.substring(1, 2), 0);
							temp = temp.substring(2);
						}
						else {
							grid("~" + temp.substring(0, 1), 0);
							temp = temp.substring(1);
						}
					} else break;
				}
			}
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					grids[i][j][k] = grid[j][k];
				}
			}
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					if(grid[j][k] == 1) masterGrid[j][k] = 1;
					grid[j][k] = 0;
				}
			}
			/*
			for(int j = 0; j < 4; j++) {
				System.out.println(Arrays.toString(grids[i][j]));
			}
			*/
		}
		convert();
		System.out.println(result);
	}
	
	static void grid(String temp, int n) {
		if(temp.charAt(0) == '~') {
			if(temp.charAt(1) == 'A') {
				for(int i = 0; i < 4; i++) {
					for(int j = 0; j < 4; j++) {
						if(j == 2 || j == 3) grid[i][j] = n;
					}
				}
			} else if(temp.charAt(1) == 'B') {
				for(int i = 0; i < 4; i++) {
					for(int j = 0; j < 4; j++) {
						if(i == 2 || i == 3) grid[i][j] = n;
					}
				}
			} else if(temp.charAt(1) == 'C') {
				for(int i = 0; i < 4; i++) {
					for(int j = 0; j < 4; j++) {
						if(j == 0 || j == 3) grid[i][j] = n;
					}
				}
			} else {
				for(int i = 0; i < 4; i++) {
					for(int j = 0; j < 4; j++) {
						if(i == 0 || i == 3) grid[i][j] = n;
					}
				}
			}
		} else {
			if(temp.charAt(0) == 'A') {
				for(int i = 0; i < 4; i++) {
					for(int j = 0; j < 4; j++) {
						if(j == 0 || j == 1) grid[i][j] = n;
					}
				}
			} else if(temp.charAt(0) == 'B') {
				for(int i = 0; i < 4; i++) {
					for(int j = 0; j < 4; j++) {
						if(i == 0 || i == 1) grid[i][j] = n;
					}
				}
			} else if(temp.charAt(0) == 'C') {
				for(int i = 0; i < 4; i++) {
					for(int j = 0; j < 4; j++) {
						if(j == 1 || j == 2) grid[i][j] = n;
					}
				}
			} else {
				for(int i = 0; i < 4; i++) {
					for(int j = 0; j < 4; j++) {
						if(i == 1 || i == 2) grid[i][j] = n;
					}
				}
			}
		}
	}
	
	static void convert() {
		String temp = "";
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				temp+=masterGrid[i][j];
			}
			if(temp.equals("0000")) result += "0";
			else if(temp.equals("0001")) result+="1";
			else if(temp.equals("0010")) result+="2";
			else if(temp.equals("0011")) result+="3";
			else if(temp.equals("0100")) result+="4";
			else if(temp.equals("0101")) result+="5";
			else if(temp.equals("0110")) result+="6";
			else if(temp.equals("0111")) result+="7";
			else if(temp.equals("1000")) result+="8";
			else if(temp.equals("1001")) result+="9";
			else if(temp.equals("1010")) result+="A";
			else if(temp.equals("1011")) result+="B";
			else if(temp.equals("1100")) result+="C";
			else if(temp.equals("1101")) result+="D";
			else if(temp.equals("1110")) result+="E";
			else result+="F";
			temp = "";
		}
	}
}