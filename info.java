import java.util.Scanner;

public class info {
    public static void main(String[] args) {
        Details d1 = new Details();
        d1.Input();
        d1.Display();
    }
}
class Details {
    String name;
    int age;
    double cgpa;
    String department;
    String section;

    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your details:");
        
        System.out.print("Name: ");
        this.name = sc.nextLine();
        
        System.out.print("Age: ");
        while (true) {
            try {
                this.age = Integer.parseInt(sc.nextLine());
                if (this.age >= 0 && this.age <= 150) {
                    break; 
                } else {
                    System.out.println("Invalid age. Please enter a valid age:");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for age. Please enter a valid age:");
            }
        }
        
        System.out.print("CGPA: ");
        while (true) {
            try {
                this.cgpa = Double.parseDouble(sc.nextLine());
                if (this.cgpa >= 0 && this.cgpa <= 4.0) {
                    break; 
                } else {
                    System.out.println("Invalid CGPA. Please enter a valid CGPA:");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for CGPA. Please enter a valid CGPA:");
            }
        }

        System.out.print("Department: ");
        this.department = sc.nextLine();
        
        System.out.print("Section: ");
        this.section = sc.nextLine();

        sc.close(); // Close the scanner when done.
    }

    void Display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("CGPA: " + this.cgpa);
        System.out.println("Department: " + this.department);
        System.out.println("Section: " + this.section);
    }
}


