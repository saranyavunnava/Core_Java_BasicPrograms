package ProgramsPractise;

class A{
	A(){
		System.out.println("in A");
	}
	A(int a){
		System.out.println("in A with parameter");
	}
}
public class ConstPractice extends A {
	ConstPractice(){
		super(5);
		System.out.println("in constPractice");
	}
	ConstPractice(int a){
		System.out.println("ConstPractice with parameter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstPractice c=new ConstPractice();

	}

}
