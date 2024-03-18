class Java {
void name() {
System.out.println("Java");
}
}
class Language extends Java {
@Override
void name() {
System.out.println("JAVA");
}
void name(String software) {
System.out.println("Java" + software);
}
}
public class Output{
public static void main(String[] args) {
Java j = new Java();
j.name(); 
Language lang= new Language();
lang.name(); 
lang.name("vs code"); 
}
}
