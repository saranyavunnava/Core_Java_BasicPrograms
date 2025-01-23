package ProgramsPractise;

import java.util.Arrays;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s="Lalitha";
 //s=s.compareToIgnoreCase();
 char name[]=s.toCharArray();
 System.out.println(name);
 Arrays.sort(name);
  System.out.print(new String(name));
	}

}
