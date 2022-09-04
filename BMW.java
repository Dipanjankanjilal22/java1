
public class BMW extends Inheritance {
	static String name="bmw";
	public void getname(){//segment is required for the application of super keyword
		System.out.println(name);
		System.out.println(super.name);
	}
	public static void main(String[] args) {
		/*Inheritance car=new Inheritance();//normal inheritance
		System.out.print(name);
		car.run();}*/
		BMW s=new BMW();
				s.getname();
		s.run();
	}
		
	}
