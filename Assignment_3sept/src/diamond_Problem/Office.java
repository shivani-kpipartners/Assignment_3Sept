package diamond_Problem;

public interface Office {
	default void officeInfo()
    {
        System.out.println("Office Name : ABC");
        System.out.println("Number of departments : 15");
    }
}
