//interface methodology
public class engineeringstudents implements student {

	@Override
	public void displayname() {
    System.out.println("we are engineering students");
    }
	public void getstandard() {
		System.out.println("we are 12 grade");
}

public static void main(String[] args) {
	engineeringstudents obj=new engineeringstudents();
	obj.displayname();
	obj.getstandard();
}
}

