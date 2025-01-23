package ProgramsPractise;

public class ArraysAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=40;
		int l=a.length;
		int sum=0;
		for(int i=0;i<=l-1;i++) {
			sum=sum+a[i];
			System.out.println(sum);
		}
		double d=sum/l;
		System.out.println("average of the array elements.."+d);
	}

}
