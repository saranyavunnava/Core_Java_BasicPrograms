package ProgramsPractise;

public class Mobile {
	int price;
	String brand;
	static String model;
	static{
		  model="smartPhone";
			System.out.println("in static block");
		}
		Mobile(){
			brand="Samsung";
			price=1500;
			System.out.println("in constructor");
		}
		void show() {
			System.out.println(Mobile.model+" : "+price+"  :"+brand);
			
		}

}


