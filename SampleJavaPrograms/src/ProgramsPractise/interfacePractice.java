package ProgramsPractise;
interface  Abc{
	abstract void show();
	int a=10;
	
}

public class interfacePractice implements Abc {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("interface method implementation");
	}
		public static void main(String[] args) {
		Abc a	=new interfacePractice();
	 System.out.println("variable value:  "+a.a);	
	 a.show();}
		
	

}
