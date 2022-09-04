
import java.util.*;
public class nMain {
	@SuppressWarnings("resource")
	public static  void main(String[] args){
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter card Number");
			int cardNumber=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter holder Name");
			String holderName=sc.nextLine();
			System.out.println("Enter Amount");
			double amount=sc.nextDouble();
			System.out.println("Enter Minutes Want to Play");
			int minutes=sc.nextInt();
			PlayCard pc=new PlayCard(cardNumber,holderName,amount);{
				pc.calculateTotalpoint();
				int balancePoints=pc.calculateBalance(minutes);
				if (balancePoints==-1)
				{
					System.out.println("you need more amount to play");
				}
				else
				{
					System.out.println("balance is:"+ balancePoints);
				}
			}
		}
	}



