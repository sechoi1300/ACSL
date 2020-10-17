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

class Result1 {

    /*
     * Complete the 'passort' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING line as parameter.
     */
	static char[] original, check;

    public static int passort(String line) {
        int result = 0;
        line = line.replaceAll("[^a-z^A-Z^0-9]", "");
        original = line.toCharArray();
        check = line.toCharArray();       
        Arrays.sort(check);
        //System.out.println(Arrays.toString(original));
        //System.out.println(Arrays.toString(check));
        while(true) {
        	if(isSort()) break;
        	smallestSwap();
        	result++;
        	if(isSort()) break;
        	largestSwap();
        	result++;
        	if(isSort()) break;
        }
        return result;
    }
    
    static int findMin(int index, char c) {
    	for(int i = index; i < original.length; i++) {
    		if(original[i] == c) return i;
    	}
    	return original.length - 1;
    }
    
    static int findMax(int index, char c) {
    	for(int i = index; i >= 0; i--) {
    		if(original[i] == c) return i;
    	}
    	return 0;
    }
    
    static void smallestSwap() {
    	for(int i = 0; i < original.length; i++) {
    		if(original[i] != check[i]) {
    			original[findMin(i, check[i])] = original[i];
    			original[i] = check[i];
    			return;
    		}
    	}
    }
    
    static void largestSwap() {
    	for(int i = original.length - 1; i >= 0; i--) {
    		if(original[i] != check[i]) {
    			original[findMax(i, check[i])] = original[i];
    			original[i] = check[i];
    			return;
    		}
    	}
    }
    
    static boolean isSort() {
    	for(int i = 0; i < original.length; i++) {
    		if(original[i] != check[i]) return false;
    	}
    	return true;
    }

}

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String line = bufferedReader.readLine();

        int result = Result1.passort(line);
        System.out.println(result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}