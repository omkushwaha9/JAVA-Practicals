// Write a program for Star Pattern 
public class p2 {
    public static void StarPattern(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 100;
        StarPattern(n);
    }
}
