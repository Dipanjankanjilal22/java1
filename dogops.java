
public class dogops {
	String name= "Jacky";
	String Breed= "Bulldog";
	int height=4;

	public void barking()  {
		System.out.println(name+ "barking");
	}
	public static void main(String[] args) {
		dogops dog=new dogops();
		dog.barking();
		
	}
}