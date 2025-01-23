package ProgramsPractise;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class EnumerationEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String>  v=new Vector<>();
		//v.add(-1, "ayaan");

		v.add(0, "ayaan");

		v.add(1,"Saranya");
				v.add(2,"hello");
		Enumeration<String> e=v.elements();
 while(e.hasMoreElements()) {
	 System.out.println(e.nextElement());
	 
 }
 ArrayList<String> a=new ArrayList<>();
 a.add("hello");
 a.add("sundari");
 a.add("pune");
 a.add("tenali");
 ListIterator<String > li=a.listIterator();
 while(li.hasNext()) {
	 System.out.println(li.next());
 }
 System.out.println("verifying previous values");
 while(li.hasPrevious()) {
	 System.out.println(li.previous());
 }
 

 
}
}
