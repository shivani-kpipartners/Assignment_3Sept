package employee_Data;



public class Employees {
	
	
	public static void main(String args[]) {
	
	
	//Creating objects from Employee_Details class
       Employee_Details employee = new Employee_Details();  

       employee.setEmp_id(9196);  
       employee.setName("Shivani Shukla");  
       employee.setDepartment("Data Analytics");  
       employee.setSalary(12345);  
       employee.setAddress("Indore");  
       employee.setEmail("shivani.shukla@kpipartners.com");  
	
       
       System.out.println(employee);  

	}
	
}
