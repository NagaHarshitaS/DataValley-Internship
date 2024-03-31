import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        System.out.print("Enter the year of joining: ");
        int yearOfJoining = scanner.nextInt();
        int yearsOfService = currentYear - yearOfJoining;
        if (yearsOfService > 5) {
            System.out.println("Congratulations! You have served for more than 5 years. You get a bonus of Rs. 5000/-");
        } else if (yearsOfService >= 3) {
            System.out.println("Congratulations! You have served for 3 to 5 years. You get a bonus of Rs. 3000/-");
        } else {
            System.out.println("Sorry, no bonus is awarded as you have served for less than 3 years.");
        }
    }
}
