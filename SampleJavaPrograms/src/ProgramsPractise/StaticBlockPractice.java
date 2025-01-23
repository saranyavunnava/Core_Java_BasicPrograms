package ProgramsPractise;
class Mobile2 {
	int price;
	String brand;
	static String model;
	static{
		  model="smartPhone";
			System.out.println("in static block");
		}
		Mobile2(){
			brand="Samsung";
			price=1500;
			System.out.println("in constructor");
		}
		void show() {
			System.out.println(Mobile2.model+" : "+price+"  :"+brand);
			
		}
public static void show1(Mobile2 mob1) {
	System.out.println(Mobile2.model+" : "+mob1.price+"  :"+mob1.brand);
}
}



public class StaticBlockPractice {

	
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class c=Class.forName("ProgramsPractise.Mobile2");
		Mobile2 mob=new Mobile2();
		mob.brand="Samsung";
		mob.price=1300;
		mob.model="smartphone";
		ProgramsPractise.Mobile2.show1(mob);
		

	}

}
