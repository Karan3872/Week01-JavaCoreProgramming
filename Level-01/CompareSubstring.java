
import java.util.Scanner;
public class CompareSubstring {
	
	public static boolean CompareUsingcharAt(String s1,String s2){
		
		if(s1.length()!=s2.length()){
			return false;
		}
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				return false;
			}
		}
		return true;
		
	}
	
	public static String SubstringUsingcharAt(String s,int start,int end){
	
	char[] SubString = new char[end - start];
 	for(int i=start;i<end;i++){
	  SubString[i-start]=s.charAt(i);
	}
	  return new String(SubString);
	}

  public static void main(String args []){
    Scanner sc = new Scanner(System.in);
	System.out.println("enter string 1");
	String s1 = sc.next();
	System.out.println("enter start index");
	int StartIndex=sc.nextInt();
    System.out.println("enter end index");
	int EndIndex=sc.nextInt();
	
	String SubstringcharAt=  SubstringUsingcharAt(s1,StartIndex,EndIndex);
	String SubStringBuiltIn= s1.substring(StartIndex,EndIndex);
	boolean compare= CompareUsingcharAt(SubstringcharAt,SubStringBuiltIn);
	
	System.out.println(" substring using charAtmethod : "+SubstringcharAt);
	System.out.println("substring using builtinMethod "+SubStringBuiltIn);
	System.out.println("both method result is same : "+compare);
  } 

}