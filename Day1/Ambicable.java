package Day1;

import java.util.Scanner;

public class ambicable {
    public static int func(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num == func(func(num)) ? 1 : 0);
        sc.close();
    }
}
