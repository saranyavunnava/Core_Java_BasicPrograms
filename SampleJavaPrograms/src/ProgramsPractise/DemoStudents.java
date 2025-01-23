package ProgramsPractise;

class Students{
	int rollNo;
	String Name;
	int marks;
}
public class DemoStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1=new Students();
		s1.rollNo=14;
		s1.Name="Chitra";
		s1.marks=78;
		
		Students s2=new Students();
		s2.rollNo=9;
		s2.Name="Bindra";
		s2.marks=89;
		
		Students s3=new Students();
		s3.rollNo=12;
		s3.Name="Kaira";
		s3.marks=45;
		
		Students stud[]=new Students[3];
		stud[0]=s1;
		stud[1]=s2;
		stud[2]=s3;
		
		
			for(int i=0;i<+stud.length;i++) {
				System.out.println(stud[i].rollNo+":  "+stud[i].marks+":  "+stud[i].Name);
			}
			
		
	}

}
