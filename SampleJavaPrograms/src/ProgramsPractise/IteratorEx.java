package ProgramsPractise;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a=new ArrayList<>();
a.add("Saranya");
a.add(100);
a.add("Louisville");
Iterator it= a.iterator();

while(it.hasNext())
{
	System.out.println(it.next());
}
	

	int a1[]=new int[4];
	int b[]=new int[a1.length];
	a1[0]=100;
	a1[1]=120;
	a1[2]=130;
	a1[3]=140;
	for(int j=a1.length-1,i=0;j>=0;j--,i++) {
		
		b[i]=a1[j];
		//System.out.println(j+"  "+i);
		System.out.println(b[i]+"   "+a1[i]);
		
	}
	String name="saranya";
	System.out.println(name.substring(3));
	System.out.println(name.subSequence(1, 3));
	
	char c[]=name.toCharArray();
	int len=name.length();
	for(int i=len-1,j=0;i>=0;i--,j++) {
		c[i]=name.charAt(i);
		System.out.print(c[i]);
	}
	name=c.toString();
	//System.out.println(name);
	}
}
