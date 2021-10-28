
public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		NYUStudent s1 = new NYUStudent("Able","123");
		NYUFaculty f1 = new NYUFaculty ("Baker","999");
		NYUFaculty f2 = new NYUFaculty ("Yi Xuan", "001");
		NYUMajor math = new NYUMajor ("Math",16);
		NYUMajor compSci = new NYUMajor ("Compsci",16);
		NYUPlan p1 = new NYUPlan(); p1.major = math; p1.gradyear = 2022;
		
		String[] courseload1 = {"Money & Banking", "Data Structures", "CSO", "Linear Algebra"};
		String[] courseload2 = {"Math for Economics 1", "Intro to DS", "Intro to CS", "Writing The Essay"};

		Transcript t1 = new Transcript(courseload1, 22);
		Transcript t2 = new Transcript(courseload2, 22);
		
		math.Chair = f2;
		s1.Advisor=f1;
		s1.Program = p1;
		s1.CourseList = t1;
		NYUStudent s2;
		
		s2 = s1.clone();
		s2.SID = "456";
		s2.name = "Charlie";
		s2.Advisor.name = "Johnny";
		s2.Program.gradyear = 2024; s2.Program.major=compSci;
		s2.CourseList = t2;
		
		System.out.println(s1.toString());
		System.out.println();
		for (String element: s1.CourseList.CoursesTaken) {
            System.out.println(element);
        }
		
		System.out.println();
		System.out.println(s2.toString());
		System.out.println();
		for (String element: s2.CourseList.CoursesTaken) {
            System.out.println(element);
        }
		
	}
}
