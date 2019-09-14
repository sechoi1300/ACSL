import java.util.*;

public class Map_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		
		m.put("Eric", 100);
		m.put("Jason", 90);
		m.put("Erin", 95);
		m.put("Solomon", 50);
		m.put("Solomon", 50);
		m.put("Hemosoo", 101);
				
		for(String key:m.keySet()) {
			System.out.println(key + ": " + m.get(key));
		}
		
		if(m.containsKey("Lee")) {
			System.out.println("Yes");
		} else System.out.println("No");
		
	}

}
