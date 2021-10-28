
public class NYUPlan implements Cloneable{
public NYUMajor major;
public int gradyear;
public NYUPlan clone( ) throws CloneNotSupportedException {
	return (NYUPlan) super.clone();
}

}
