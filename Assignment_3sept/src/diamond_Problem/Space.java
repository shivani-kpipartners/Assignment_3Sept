package diamond_Problem;

public interface Space extends Office{
	public void  squarefeet_area();
	default void employee_count()
    {
		int employee_count=50;
		System.out.println("Employee count :"+employee_count);
    }
}
