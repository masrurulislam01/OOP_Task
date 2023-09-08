import java.util.Scanner;
public class Area {
    //Calculate the area of a circle. Take radius as input.
    public static void main(String[] argo){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Radius :\t");
        double r = sc.nextDouble();
        double area = Math.PI * Math.pow(r,2);
        if ((r>0)){
            System.out.printf("\nArea is %.2f\n",area);
            }
            else{
                System.out.println ("Invalid Input!");
            }
        sc.close();
    }
}
