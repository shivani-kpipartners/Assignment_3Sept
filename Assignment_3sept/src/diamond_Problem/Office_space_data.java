package diamond_Problem;

public class Office_space_data implements Space,Cafeteria{

		@Override
		public void table_count() {
			// TODO Auto-generated method stub
			System.out.println("Total table count in cafetria : 55");
		}

		@Override
		public void squarefeet_area() {
			// TODO Auto-generated method stub
			System.out.println("Area in square feet: 680 sq ft");
		}


	public static void main (String[] args) 
	{ 
		Office_space_data obj = new Office_space_data();
	   obj.officeInfo();
	   obj.squarefeet_area();
	   obj.table_count();
	   obj.employee_count();
	}
	}

