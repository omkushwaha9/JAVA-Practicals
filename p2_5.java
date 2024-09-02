// Write a Program to list Prime Numbers 
public class p2_5 {
    static void prime_N(int N) {
        int x, y, flg;
        System.out.println(
                "All the Prime numbers within 1 and " + N
                        + " are:");
        for (x = 2; x <= N; x++) {
            flg = 1;
            for (y = 2; y * y <= x; y++) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1)
                System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int N = 100;
        prime_N(N);
    }
}
