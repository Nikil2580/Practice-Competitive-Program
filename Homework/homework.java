import java.util.Arrays;

public class homework {

    static int fun(int x) {
        int result = x;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                while (x % i == 0) {
                    x /= i;
                }
                result -= result / i;
            }
        }
        if (x > 1) {
            result -= result / x;
        }
        return result;
    }

    static int homeworks(int[] P, int H, int N) {
        int count = 0, time = 0;
        Arrays.sort(P);
        for (int i : P) {
            if (time + i <= H) {
                time += i;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] P = new int[] { 1, 2, 4 };
        int N = 3;
        int H = 3;
        System.out.println(homeworks(P, H, N));
    }
}
