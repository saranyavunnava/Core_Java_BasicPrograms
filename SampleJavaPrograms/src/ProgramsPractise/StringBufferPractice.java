package ProgramsPractise;

public class StringBufferPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Helloworld");
		System.out.println(sb);
		System.out.println(sb.charAt(5));
		System.out.println(sb.indexOf("H"));
		System.out.println(sb.insert(3,9.99));
	}

}
