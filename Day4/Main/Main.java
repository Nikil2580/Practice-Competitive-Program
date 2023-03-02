package Day4.Main;
import Day4.CheckAnagram.IsAnagram;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1 = scanner.next();
        System.out.println("Enter the second String");
        String str2 = scanner.next();
        IsAnagram anagram = new IsAnagram();
        System.out.println(anagram.check(str1, str2));
    }
}
