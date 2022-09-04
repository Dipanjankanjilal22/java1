import java.util.Scanner;
public class string15 {
	  static void string1(String str) {
	        StringBuffer s = new StringBuffer();
	 
	        // Declare a character of space
	        // To identify that the next character is the starting
	        // of a new word
	        char ch = ' ';
	        for(int i = 0; i < str.length(); i++) {
	        	if(Character.isLetter(str.charAt(i))==false) {
	        		System.out.println("Invalid input");
		          		return ;
		          		}
	          // If previous character is space and current
	            // character is not space then it shows that
	            // current letter is the starting of the word
	            if (ch == ' ' && str.charAt(i) != ' ')
	                s.append(Character.toUpperCase(str.charAt(i)));
	            else
	                s.append(str.charAt(i));
	            ch = str.charAt(i);
	            
	        }
	 
	        // Return the string with trimming
	        System.out.println(s.toString().trim());}
	
	 
	    // Driver Code
	    public static void main(String args[]) {
	    	System.out.println("Enter the project id");
	    	Scanner n=new Scanner(System.in);
	        String s1 = n.nextLine();
	 
	        // Convert that string into lowercase
	        s1 = s1.toLowerCase();
	 
	        // Call the method to capitalize each word
	       string1(s1);
	       
	        	
	        n.close();
	    }
	}

