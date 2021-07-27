package Day1;

import java.util.Arrays;

public class Info {
	
	public void display(Student student)
	{
		System.out.println("Student Id: "+student.getStudId());
		System.out.println("Student Name: "+student.getStudName());
		System.out.println("Student DOB: "+student.getStudDOB());
		System.out.println("Student College Name: "+Student.getStudCollegeName());
		int ph[] = student.getPh();
		System.out.println("Student phone number");
		System.out.println(Arrays.toString(ph));
		
		
	}
	
	

}
