import java.util.Scanner;
public class CountVowelAndConsonent{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
	 System.out.println("enter the string");
	 String s1=sc.next();
	 int vowel=0;
	 int consonent=0;
	 s1.toLowerCase();
	 for(int i=0;i<s1.length();i++){
	 char ch = s1.charAt(i);
	 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
	    vowel++;
	 }
	 else{
	 consonent++;
	 }
	 }
	 
	 System.out.println("vowel count : "+vowel);
	 System.out.println("consonent count : "+consonent);
	 
	 
  }
}