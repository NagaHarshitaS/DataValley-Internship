import java.util.Scanner;

public class VowConCount {
public static void main(String a[]) {
Scanner sc = new Scanner(System.in);
String Str = sc.nextLine().toLowerCase();
int vc = 0;
int cc = 0;
for (int i = 0; i < Str.length(); i++) {
char ch = Str.charAt(i);
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
vc++;
}
else {
cc++;
}
}
System.out.println("Number of vowels: " + vc);
System.out.println("Number of consonants: " + cc);

    }
}
