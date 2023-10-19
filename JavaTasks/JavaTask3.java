package JavaTasks;
import java.util.*;
public class JavaTask3 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the sentence");
        String word = sc.nextLine();
        Set<Character> s=new HashSet<>(0);
        for(int i=0;i<word.length();i++){
            if((word.charAt(i)>='a' && word.charAt(i)<='z') || (word.charAt(i)>='A' && word.charAt(i)<='Z')){
                s.add(word.charAt(i));
            }
        }
        if (s.size()==26){
            System.out.println("It is Pangram");
        }
        else{
            System.out.println("Not a Pangram");
        }
    }
}
