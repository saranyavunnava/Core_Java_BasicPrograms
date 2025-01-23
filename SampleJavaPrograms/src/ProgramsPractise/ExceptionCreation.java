package ProgramsPractise;

class CustomException extends Exception{
	CustomException(String str){
		super(str);
		
	}
}
public class ExceptionCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=18;
		int j=9;
		System.out.println("hello");
		try{
		int s=i/j;
		if(s==0) {
			throw new CustomException("Hello Im a custom exception");}
		}
		catch(CustomException e) {
			System.out.println(e);
			System.out.println("divides without remainder");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
