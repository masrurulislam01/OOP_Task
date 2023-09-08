import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        int A = sc.nextInt();

        System.out.print("B = ");
        int B = sc.nextInt();

        System.out.print("C = ");
        int C = sc.nextInt();

        int max = A; // Assume A is the maximum initially

        // Check if B is greater than the current max
        if (B > max) {
            max = B;
        }

        // Check if C is greater than the current max
        if (C > max) {
            max = C;
        }

        System.out.println("Maximum value = " + max);

        sc.close();
    }
}
