package ProgramsPractise;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Reading data from keyboard");
Scanner sc=new Scanner(System.in);
System.out.println("enter data");
String s=sc.next();

System.out.println(s);
char c[]=s.toCharArray();
int l=c.length-1;
for(int i=0;i<=l;i++) {
	//c=s.charAt(l);
	
	System.out.println(c[i]);
}s=c.toString();
System.out.println(c);
	}

}
