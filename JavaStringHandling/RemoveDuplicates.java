import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String args[]) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        //the user to enter a string
        System.out.println("Enter the string:");
        String s1 = sc.next(); // Read the user input string and store it in variable s1

        String result="";
		
		
		
		for(int i=0;i<s1.length();i++)
		{
		    boolean isDuplicate=false;
			char ch = s1.charAt(i);
		
			for(int j=0;j<result.length();j++)
			{
		
				if(ch==result.charAt(j))
				{
					isDuplicate=true;
					break;
				}
			}
		
			if(!isDuplicate)
			{
				result+=ch;
			}
		  
		}

        System.out.println("String after remove duplicates : " + result);

        // Close the Scanner object to free up resources
        sc.close();
    }
}


//  input =karan; resut=kar 