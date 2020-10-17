import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'move' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING start_location
     *  2. STRING moves
     */

    public static String move(String start_location, String moves) {
    	char letter = start_location.charAt(0);
        int number = Integer.parseInt(start_location.substring(1));
        
        int[][] p1 = {{0, 1}, {1, 1}, {1, 0}, {0, -1}, {-1, 0}, {-1, 1}};
        int[][] p2 = {{0, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}};
        
        char[] move = moves.toCharArray();
        
        for(int i = 0; i < move.length; i++) {
            int newmove = move[i] - 1 - '0';
            int charmove = 0;
            int nummove = 0;
            
            if(letter % 2 == 0) {
                charmove = p2[newmove][0];
                nummove = p2[newmove][1];
            } else {
                charmove = p1[newmove][0];
                nummove = p1[newmove][1];
            }
            
            letter+=charmove;
            number+=nummove;
            
            if(letter < 'A' || letter > 'Z' || number <= 0) {
                letter-=charmove;
                number-=nummove;
            }
            //System.out.println(letter + "" + number);
        }
        String result = letter + "" + number;
        return result;
    }

}

public class ACSLHexGrid {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String start_location = firstMultipleInput[0];

        String moves = firstMultipleInput[1];

        String result = Result.move(start_location, moves);
        System.out.println(result);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}