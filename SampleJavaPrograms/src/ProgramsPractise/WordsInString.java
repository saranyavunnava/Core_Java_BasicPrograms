package ProgramsPractise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordsInString {
	public void countWords() {
		String name = "Hello I am Saranya and I love coding";
		String[] a = name.split(" ");
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + 1;
			char c[] = a[i].toCharArray();
			Arrays.sort(c);
			System.out.println(c);
		}
		System.out.println(sum);
	}

	public void countReptWords() {
		String name="hello hello mike testing mike working";
		String ss[]=name.split(" ");
		int len=ss.length;
		int count=1;
		System.out.println(name+"  :"+len);
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<len;i++) {
			if(map.containsKey(ss[i])) {
				map.put(ss[i],map.get(ss[i])+1);
			}
			else {
				map.put(ss[i], count);
			}
		}
		map.forEach((k,v)->System.out.println(k+"  :"+v));
	}
	public void charOccurance() {
		String name="hello how are you";
		name=name.replace(" ", "");
		char n[]=name.toCharArray();
		System.out.println(name);
		int len=name.length();
		int sum=0;
		System.out.println(len);
		for(int i=0,j=1;i<=len;i++,j++) {
			//for(int j=1;j<len;j++)
			
				System.out.println(n[i]+"  "+n[j]);
			if(n[i]==n[j]) {
				sum++;
			}
			else {
				sum++;
			}
			}
			for(char c:n) {
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordsInString wc=new WordsInString();
		wc.charOccurance();
	}

}
