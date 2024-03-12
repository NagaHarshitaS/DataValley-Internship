import java.util.Scanner;
public class Division {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter numerator:");
int numerator = sc.nextInt();
System.out.println("Enter denominator:");
int denominator = sc.nextInt();
try {
divideNumbers(numerator, denominator);
} catch (ArithmeticException e) {
System.out.println("Error: Division by zero is not allowed.");
}
}
public static void divideNumbers(int numerator, int denominator) {
if (denominator == 0) {
throw new ArithmeticException("Division by zero is not allowed.");
}
int result = numerator / denominator;
System.out.println("Result of division: " + result);
}
}
