import java.lang.*;
import java.util.Scanner;
public class CompareString {
	
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

  public static void main(String args []){
    Scanner sc = new Scanner(System.in);
	System.out.println("enter string 1");
	String s1 = sc.next();
	System.out.println("enter string 2");
	String s2= sc.next();
	
	boolean charAtMethod=  CompareUsingcharAt(s1,s2);
	boolean equalsmMethod= s1.equals(s2);
	
	System.out.println(" comparison using charAtmethod : "+charAtMethod);
	System.out.println("comparison using equalsmMethod "+equalsmMethod);
	System.out.println("both method result is same : "+(charAtMethod==equalsmMethod));
  } 

}