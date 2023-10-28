import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.next().toUpperCase(); // Convert to uppercase for case insensitivity
        int result = romanToInteger(romanNumeral);
        System.out.println(romanNumeral + " = " + result);
        scanner.close(); // Close the Scanner
    }

     public static int romanToInteger(String str) {
        // code here
         HashMap<Character,Integer> m=new HashMap<Character,Integer> ();
            m.put('I',1);
            m.put('V',5);
            m.put('X',10);
            m.put('L',50);
            m.put('C',100);
            m.put('D',500);
            m.put('M',1000);
        int res=0;    
        for(int i=0;i<str.length();i++){
            int val=m.get(str.charAt(i));
            if(i+1<str.length()){
                int nextval=m.get(str.charAt(i+1));
                if(val<nextval) res-=val;
                else res+=val;
            }
            else res+=val;
        }    
        return res;
    }
} 