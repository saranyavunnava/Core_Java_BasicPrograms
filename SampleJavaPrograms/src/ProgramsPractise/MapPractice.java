package ProgramsPractise;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map m=new HashMap<>();
		m.put("id",10);
		m.put("name","Sample");
		m.put("marks",86);
		System.out.println("map "+m);
		System.out.println("key values  "+m.keySet());
		System.out.println("values "+m.values());
	}

}
