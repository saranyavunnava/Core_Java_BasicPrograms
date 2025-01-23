package ProgramsPractise;

public class RevString {
	
	
	public void rev() {
		String name="HELLO";
		int l=name.length()-1;
		for(int i=l;i>=0;i--) {
			char c=name.charAt(i);
			System.out.print(c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("class path..."+System.getProperty("java.classpath"));
		RevString res=new RevString();
		res.rev();
	}

}
