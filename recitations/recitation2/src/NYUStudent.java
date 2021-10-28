
public class NYUStudent extends NYUPerson implements Cloneable {
	
	public String SID;
	public NYUFaculty Advisor;
	public NYUPlan Program;
	public Transcript CourseList;
	public NYUStudent(String inname  , String inid   ) {
		name = inname;
		SID=inid;
	}
	
	public NYUStudent clone() throws CloneNotSupportedException {
		NYUStudent clonestudent;
		String [] empty = {};
		clonestudent = (NYUStudent) super.clone();
		clonestudent.CourseList = new Transcript(empty,0);
		//clonestudent.Program = this.Program.clone();
		//clonestudent.Advisor= new NYUFaculty("??","??");
		return clonestudent;
		
	}
	
	
	
	public String toString() {
		return "Student Name: " + name + " \nID: " + SID + " \nFaculty advisor: " + 
	             Advisor.name + " \nPlan info " + Program.major.MajorName + "-" + Program.gradyear;
	}
	public void sendemail(String message, int priority) {
		// send an email with above message with given priority
		System.out.println("NYUStudent class " + message + " " + Integer.toString(priority) );
	}
}
