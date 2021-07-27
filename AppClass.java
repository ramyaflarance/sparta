package Day1;

public class AppClass {
	
	public void scenario1()
	{
	
		int ph[] = new int[] {1,2,3,4};
		Student s1 = new Student(1,"xx","1/2/2000",ph); 
		Info inf = new Info();
		Student.studCollegeName="SVCE";
		inf.display(s1);
		Student s2 = new Student(1,"yy","2/2/2000",ph);
		Student.studCollegeName="RIT";
		inf.display(s2);		
	}
	
	public void scenario2()
	{
		int ph[]=new int[] {1,2,3,4};
		Info inf = new Info();
		Student student[] = new Student[10];
		student[0] = new Student(3,"zz","3/2/2000",ph);
		student[1] = new Student(4,"aa","4/2/2000",ph);
		for(Student stu : student)
		{
			inf.display(stu);
		}
	}
	
	
	public static void main(String[] args) {
	AppClass ap = new AppClass();
	ap.scenario1();
	ap.scenario2();
	
	}

}
