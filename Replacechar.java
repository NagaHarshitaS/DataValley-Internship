import java.util.Scanner;
class Replacechar{
public static void main(String a[]){
Scanner j = new Scanner(System.in);
String str = j.nextLine();
int i= j.nextInt();
j.nextLine();
String key=j.nextLine();
str = str.substring(0, i) + key
              + str.substring(i + 1);
System.out.println(str);
}
}


