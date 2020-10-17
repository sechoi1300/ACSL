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
     * Complete the 'syllables' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING word as parameter.
     */
	static String word;

    public static int syllables(String word) {
    	int result = 0;
    	if(hasPrefix()) result++;
    	if(hasSufix()) result++;
    	return result;
    }
    
    static boolean hasPrefix() {
    	if(word.substring(0, 2).equals("co") || word.substring(0, 2).equals("de") || word.substring(0, 2).equals("dis") || word.substring(0, 2).equals("re") || word.substring(0, 2).equals("un")) {
    		word = word.substring(2);
    		return true;
    	} else if(word.substring(0, 3).equals("pre")) {
    		word = word.substring(3);
    		return true;
    	}
    	return false;
    }
    
    static boolean hasSufix() {
    	if(word.substring(word.length() - 3, word.length()).equals("age") || word.substring(word.length() - 3, word.length()).equals("ful")) {
    		word = word.substring(0, word.length() - 3);
    		return true;
    	} else if(word.substring(word.length() - 4, word.length()).equals("less") || word.substring(word.length() - 4, word.length()).equals("ment")) {
    		word = word.substring(0, word.length() - 3);
    		return true;
    	}
    	return false;
    }

}

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String word = bufferedReader.readLine();

        int result = Result.syllables(word);
        System.out.println(result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
