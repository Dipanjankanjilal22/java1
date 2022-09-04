
public  class circle extends shape{

	@Override
	public void displayshape() {
		System.out.println("shape is circle");
		}
	public static void main(String[] args) {
		shape n=new circle();//object of abstract class with the help of parent class
		n.displayshape();
		
		
	}

}
