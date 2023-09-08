import java.util.Scanner;

public class FourInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        // Calculate and print the results of the equations
        int result1 = A * B - C * D;
        int result2 = 2 * A - B + 3 * D;
        int result3 = A * A + B * B - C * C + D * D;
        int result4 = A * A * A + B - C * C;

        System.out.println("Solution of Equation - 1 = " + result1);
        System.out.println("Solution of Equation - 2 = " + result2);
        System.out.println("Solution of Equation - 3 = " + result3);
        System.out.println("Solution of Equation - 4 = " + result4);

        sc.close();
    }
}
