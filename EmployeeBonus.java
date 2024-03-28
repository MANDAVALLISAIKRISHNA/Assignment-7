import java.util.Scanner;

public class EmployeeBonus{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter the year of joining: ");
        int joiningYear = scanner.nextInt();

        int yearsOfworking = currentYear - joiningYear;

        if (yearsOfworking > 5) {
            System.out.println("Congratulations! You get a bonus of Rs. 5000/-");
        } else if (yearsOfworking >= 3 && yearsOfworking <= 5) {
            System.out.println("Congratulations! You get a bonus of Rs. 3000/-");
        } else {
            System.out.println("Sorry, no bonus is awarded.");
        }
        
        scanner.close();
    }
}