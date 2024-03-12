import java.util.Scanner;

class CustomNeg extends Exception {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
int input = scanner.nextInt();
if (input < 0) {
throw new CustomValidationException("Number cannot be negative");
}
System.out.println("Number is valid");
} 
catch (CustomValidationException e) {
System.out.println("Custom Validation Exception: " + e.getMessage());
} 
}
}

