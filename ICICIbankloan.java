
public class ICICIbankloan extends bankloan {
	public static void main(String[] args) {
		bankloan obj=new bankloan();
		obj.setage(200);
		obj.setname("Dipanjan");
		obj.setamount(100000);
		System.out.println("name is:"+obj.getname());
		System.out.println("age is:"+obj.getage());
		System.out.println("amount is:"+obj.getamount());
		
	}

}
