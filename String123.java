import java.util.*;
public class String123 {
	public static void main(String[] args) {
		System.out.println("Enter the project title");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] words=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for(String word:words) {
			for(int i=0;i<word.length();i++) {
				if(Character.isLetter(word.charAt(i))==false)
				{
					System.out.println("invalid input");
					return;
				}
				if(i==0) {
					sb.append(Character.toUpperCase(word.charAt(i)));
				}else {
					sb.append(Character.toLowerCase(word.charAt(i)));
					
				}
			}
			sb.append("");	
		}
		System.out.println(sb.toString().trim());
	}

}
