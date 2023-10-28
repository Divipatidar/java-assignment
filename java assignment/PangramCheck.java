import java.util.Scanner;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        boolean isPangram = checkPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        scanner.close();
    }

    public static boolean checkPangram(String s) {
        int[] alphabet = new int[26];
        int count = 0;
        
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                alphabet[c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a']++;
            }
        }
        
        for (int i : alphabet) {
            if (i > 0) {
                count++;
            }
        }
        
        return count == 26;
    }
}
