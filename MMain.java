import java.util.*;
public class MMain {
	public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Your Name");
		 String s=sc.nextLine();double sal=0;double disc=0;
		 
		  for(int i=0;i<s.length();++i)
		  {
		   if(!Character.isLetter(s.charAt(i)))
		   {
		    System.out.println("Invalid Name");
		    return;
		   }
		  }
		 System.out.println("Enter the time duration");
		 int n=sc.nextInt();int n1;
		  if(n<=0 || n>24)
		  {
		   System.out.println("Invalid time duration");
		   return;
		  }
		 System.out.println("List of payment options");
		 System.out.println("1)Visa card");
		 System.out.println("2)Rupay card");
		 System.out.println("3)Master card");
		 System.out.println("Chosse an option");
		  while(true)
		  {
		  n1=sc.nextInt();
		   if(n1<0||n1>3)
		   {
		    System.out.println("Try again");
		   }
		   else
		   {
		    break;
		   }
		  }
		  if( n1==1)
		  {
		   if(n>=5)
		   {
		    sal=20*n;
		    disc=(sal*0.20);
		    sal=sal-disc;
		   }
		   else
		   {
		    sal=n*20;
		   }
		  }
		  if(n1==2)
		  {
		   if(n>=5)
		   {
		    sal=20*n;
		    disc=(sal*0.15);
		    sal=(20*n)-disc;
		   }
		   else
		   {
		    sal=n*20;
		   }
		  }
		  if(n1==3)
		  {
		   sal=n*20;
		  }
		 System.out.print("Dear "+s+" your bill amount is ");
		 System.out.printf("%.2f", sal);
		 
		 
		 }
		}



