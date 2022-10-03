package employee_Data;

public class Employee_Details {
	int emp_id, salary;  
	String name, address, department,job_profile, email;
	
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJob_profile() {
		return job_profile;
	}
	public void setJob_profile(String job_profile) {
		this.job_profile = job_profile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 
	
	public String toString() {  
	    return "Employee details [Emp_id = " + emp_id +
	    		", Salary = " + salary + 
	    		", Name = " + name + 
	    		", Address = " + address  +
	    		", Department = " + department + 
	    		", Job Profile = " + job_profile+
	            ", email = " + email + "]";  
	    }  
}
