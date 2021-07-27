package Day1;

public class Student {
	int studId;
	String studName;
	String studDOB;
	static String studCollegeName;
	int ph[] = new int[] {1,2,3,4,5,6,7,8,9} ;
	
	public Student()
	{
		super();
	}

	public Student(int studId, String studName, String studDOB, int[] ph) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studDOB = studDOB;
		this.ph = ph;
	}
	

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudDOB() {
		return studDOB;
	}

	public void setStudDOB(String studDOB) {
		this.studDOB = studDOB;
	}

	public static String getStudCollegeName() {
		return studCollegeName;
	}

	public static void setStudCollegeName(String studCollegeName) {
		Student.studCollegeName = studCollegeName;
	}

	public int[] getPh() {
		return ph;
	}

	public void setPh(int[] ph) {
		this.ph = ph;
	}
	
}