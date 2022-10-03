package diamond_Problem;

public interface Cafeteria {
	public void table_count();
	default void employee_count()
    {
		int employee_count=50;
		System.out.println("Employee count :"+employee_count);
    }
}
