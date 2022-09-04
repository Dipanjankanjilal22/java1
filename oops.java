
public class oops  {
	int roll ;
	String Name;
	String standard;
	;
	public oops (int roll,String Name,String Standard) {
		this.roll=roll;
		this.Name=Name;
		this.standard=Standard;
	}
	public void display() {
		System.out.print("Student roll :"+roll+  "name is:"+Name+ "and in class:"+   standard);
	}
	
	public static void main(String[] args) {
		oops obj=new oops(10, "frank" ,"5th Standard");
		oops obj1=new oops(20, "rank" ,"4th Standard");
		obj.display();
		obj1.display();
	}

}
