public class modl extends BMW {//typical example of multilevel inheritance
static String model="XX";
public static void main(String[] args) {
	BMW obj2=new BMW();
	System.out.println("model is"+model);
	System.out.println("brand is"+BMW.name);
	System.out.println("behaviour is");
	obj2.run();//we can access any methods with the help of objects
}
}
