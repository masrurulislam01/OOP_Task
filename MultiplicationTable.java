import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input a number : ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i<=10 ;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        sc.close();
    }
    
}
