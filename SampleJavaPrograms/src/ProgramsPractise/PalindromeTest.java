package ProgramsPractise;

public class PalindromeTest {
	int num;
	int r;
	int sum=0,temp;
	PalindromeTest(int num){
		temp=num;
		while(num>0) {
			r=(num%10);
		 sum=sum*10+r;
		num=num/10;
		}
		if(temp==sum)
		System.out.println(temp+" is a palindrome");
		else
			System.out.println(temp+" is not a palindrome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeTest p=new PalindromeTest(452);
		
	}

}
