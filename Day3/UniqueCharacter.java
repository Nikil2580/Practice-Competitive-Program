package Day3;

import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int[] hash = new int[256];
        for (int i = 0; i < str.length(); i++) {
            if (hash[str.charAt(i)]++ == 1)
                System.out.print(str.charAt(i));
        }
        scanner.close();
    }
}
