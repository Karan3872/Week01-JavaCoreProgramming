/*
Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
I/P => NONE
O/P => Harry's age in 2024 is ___ 
*/

//Creating Class CurrentAge for find the Harry's current age

class CurrentAge
{
	public static void main(String []args)
	{
		//Creating String variable name and assign value Harry
		String name = "Harry";
		
		//Creating int variable birthYear and currentYear and assign values 2000 and 2024 respectively
		int birthYear = 2000, currentYear = 2024;
		
		//Creating int variable harryAge to indicate Harry's current age
		int diharryAge = currentYear - birthYear;
		
		//Displaying the Harry's current age
		System.out.println(name+"'s age in "+currentYear+" is "+harryAge);
		
		
	}
}