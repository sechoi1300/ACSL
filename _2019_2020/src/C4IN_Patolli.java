/*
Sejin Eric Choi
Grade 10
STEMPIA
Intermediate
Contest 4
*/
import java.util.*;
import java.io.*;

public class C4IN_Patolli {

	static Scanner in;
	final static int gameBoardMax = 52;
	static int[] opponentPieces;
	static List<Integer> playerPieces;
	static int rolls;
	static int dice;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		in = new Scanner(new File("1920c4in.in"));
		
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
		opponentPieces = new int[3];
		for(int i = 0; i < 3; i++) {
			int temp = in.nextInt();
			opponentPieces[i] = temp;
		}
		playerPieces = new ArrayList<Integer>();
		for(int i = 0; i < 3; i++) {
			int temp = in.nextInt();
			playerPieces.add(temp);
		}
		Collections.sort(playerPieces);
		//System.out.println();
		rolls = in.nextInt();
	}
	
	static void solve() {
		for(int i = 0; i < rolls; i++) {
			dice = in.nextInt();
			int initialtemp = playerPieces.get(0);
			int finaltemp = playerPieces.get(0) + dice;
			if(isOccupied(finaltemp)) continue;
			if(finaltemp == gameBoardMax) {
				playerPieces.remove(0);
				continue;
			}
			if(finaltemp > gameBoardMax) continue;
			if(isPrime(finaltemp)) {
				change(finaltemp, 1);
				Collections.sort(playerPieces);
			} else if(isPerfectSquare(finaltemp)) {
				change(finaltemp, -1);
				Collections.sort(playerPieces);
			} else {
				if(weirdCondition(initialtemp, finaltemp)) {
					weirdChange(dice, initialtemp, finaltemp);
					Collections.sort(playerPieces);
				} else {
					playerPieces.remove(0);
					playerPieces.add(finaltemp);
					Collections.sort(playerPieces);
				}
			}
		}
		String result = "";
		if(playerPieces.size() > 0) {
			for(int i = 0; i < playerPieces.size(); i++) {
				result+=" " + playerPieces.get(i);
			}
			System.out.println(result.substring(1));
		} else System.out.println("GAME OVER");
	}
	
	static boolean isOccupied(int n) {
		for(int i = 0; i < playerPieces.size(); i++) {
			if(n == playerPieces.get(i)) return true;
		}
		for(int i = 0; i < opponentPieces.length; i++) {
			if(n == opponentPieces[i]) return true;
		}
		return false;
	}
	
	static boolean isPrime(int n) {
		double num = n;
		for(int i = 2; i < n; i++) {
			if(num / i == (int)(num / i)) return false;
		}
		return true;
	}
	
	static boolean isPerfectSquare(int n) {
		for(int i = 3; i < n; i++) {
			if(i * i == n) return true;
		}
		return false;
	}
	
	static void change(int n, int amt) {
		for(int i = 0; i < 6; i++) {
			n+=amt;
			if(isOccupied(n)) {
				n-=amt;
				playerPieces.remove(0);
				playerPieces.add(n);
				return;
			}
		}
		playerPieces.remove(0);
		playerPieces.add(n);
		return;
	}
	
	static boolean weirdCondition(int Initial, int Final) {
		if(Initial <= 6 && Final >= 8) return true;
		else if(Initial <= 11 && Final >= 13) return true;
		else if(Initial <= 16 && Final >= 18) return true;
		else if(Initial <= 21 && Final >= 23) return true;
		else if(Initial <= 26 && Final >= 28) return true;
		else if(Initial <= 34 && Final >= 36) return true;
		else if(Initial <= 39 && Final >= 41) return true;
		else if(Initial <= 44 && Final >= 46) return true;
		else if(Initial <= 49 && Final >= 51) return true;
		return false;
	}
	
	static void weirdChange(int dice, int Initial, int Final) {
		for(int i = 0; i < Final; i++) {
			if(dice * i >= Initial && dice * i <= Final) {
				if(isOccupied(dice * i)) continue;
				else {
					playerPieces.remove(0);
					playerPieces.add(dice * i);
					return;
				}
			}
		}
	}

}
