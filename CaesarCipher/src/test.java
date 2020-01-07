import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
        System.out.print("Your message? ");
        String input = in.nextLine();
        Scanner innum = new Scanner (System.in);
        System.out.print("Encoding key? ");
        int key = innum.nextInt();
        System.out.println(input);
        System.out.println(key);
	}

}
