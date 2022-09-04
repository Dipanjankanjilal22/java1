
public class add {//operator overloading methodology
	public  void addn(int a,int b) {
		int c=a+b;
		System.out.println("addition"+c);
	}
	public void addn(int a,int b,int c) {
		int d=a+b+c;
		System.out.println("addition "+d);
	}
	public class child extends add{
		public static void main(String[] args) {
			add obj=new add();
			obj.addn(11, 11);
			obj.addn(22,22,22);
		}
		}
}
