
public class smthn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 0;
		for(int j = 1; j <= 5; j++) {
			for(int k = 1; k <= 5; k++) {
				for(int m = 1; m <= 5; m++) {
					if(j * j + k * k == m * m) t++;
				}
			}
		}
		t = t / 2;
		System.out.println(t);
	}

}
