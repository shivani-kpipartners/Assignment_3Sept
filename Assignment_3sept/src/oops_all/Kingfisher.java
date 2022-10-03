package oops_all;

public class Kingfisher implements Animal_interface,Bird_interface {

	@Override
	public void life_span() {
		// TODO Auto-generated method stub
		System.out.println("Can live for 8 to 10 years");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eats reptiles and insects.");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Makes whisteling sound.");
	}

}
