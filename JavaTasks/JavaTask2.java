package JavaTasks;
import java.util.*;

public class JavaTask2 {
    public static int RomanToInt(String s) {
        int sum = 0;
        int n = s.length();
        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        for (int i = 0; i < n; i++) {

            if (i != n - 1 && hm.get(s.charAt(i)) < hm.get(s.charAt(i + 1))) {
                sum += hm.get(s.charAt(i + 1)) - hm.get(s.charAt(i));
                i++;
            } else {
                sum += hm.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman Number: ");
        String input = sc.nextLine(); 
        System.out.println("Integer is: " + RomanToInt(input));
    }
}
