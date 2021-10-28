
public class Transcript implements Cloneable{
	
	public String[] CoursesTaken;
	public Integer EarnedCredits;
	
	public Transcript(String[] inCoursesTaken, Integer inEarnedCredits) {
		CoursesTaken = inCoursesTaken;
		EarnedCredits = inEarnedCredits;
	}
	public Transcript clone( ) throws CloneNotSupportedException {
		return (Transcript) super.clone();
	}
}