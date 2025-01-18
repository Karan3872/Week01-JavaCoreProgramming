
import java.util.Scanner;

public class ReplaceMethod {
    public static void main(String[] args) {
      
        
        Scanner sc = new Scanner(System.in);
        String text=sc.nextLine();
        
        String replaceWord=sc.nextLine();
        String newWord=sc.nextLine();

        String updatedText=ReplaceWord(text,replaceWord,newWord);
        System.out.println("updated Text : "+updatedText);

        
    }
    public static String ReplaceWord(String text,String replaceWord,String newWord){
        if(text==null || replaceWord==null||newWord==null){
            return text;
        }
        StringBuilder sb = new StringBuilder();
        String[] words = text.split(" ");

        for(String word : words){
            if(word.equals(replaceWord)){
            sb.append(newWord).append(" ");
        }else{
            sb.append(word).append(" ");
        }
        }
        if(sb.length()>0){
                sb.setLength(sb.length()-1);
        }

        return sb.toString();     
     }
}
