/*
Write a program to display Sam with Roll Number 1, Percent Marks 
99.99,and the result ‘P’ indicates Pass(‘P’) or Fail (‘F’). 
*/

//Creating Class eith name DisplayResult To display Result
class DisplayResult
{
	public static void main(String []args)
	{
		//Creating a string varible name and assign value sam
		String name = "Sam";
		
		//Creating a int varible rollNumber and assign value 1
		int rollNumber=1;
		
		//Creating a double varible percentMarks and assign value 99.99
		double percentMarks=99.99;
		
		// Create a char variable result and assign value 'P' for pass
		char result= 'P';
		
		 // Display the result
        System.out.println("Displaying Result:\n" +name+ " with Roll Number " +rollNumber+ " has Scored " +percentMarks+" % Marks and Result is "+result); 

	}
}