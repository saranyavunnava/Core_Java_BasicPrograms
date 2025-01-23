package ProgramsPractise;

public class ExceptionPractice {
	public static void main(String[] args) {
	int i=0;
	int j=0;
	int a[]=new int[5];
	try {
		System.out.println(a[5]);
		j=18/i;
		
	}
	catch(ArithmeticException e) {
		System.out.println("Cant divide by zero");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Index 5 out of bounds for length 5");
	}
	catch(Exception e) {
		System.out.println(e);
	}

	}

}
