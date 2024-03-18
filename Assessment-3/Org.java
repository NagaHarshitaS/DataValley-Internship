class Organization implements Cloneable {
private String organizationCode;
private String organizationName;
private String organizationAddress;
public Organization(String organizationCode, String organizationName, String organizationAddress) {
this.organizationCode = organizationCode;
this.organizationName = organizationName;
this.organizationAddress = organizationAddress;
}
public void printDetails() {
System.out.println("Organization Code: " + organizationCode);
System.out.println("Organization Name: " + organizationName);
System.out.println("Organization Address: " + organizationAddress);
}
@Override
protected Object clone() throws CloneNotSupportedException {
return super.clone();
}
}
public class Org {
public static void main(String[] args) {
Organization o1 = new Organization("202403", "Java corp", "AP");
Organization o2 = null;
try {
o2 = (Organization) o1.clone();
} catch (CloneNotSupportedException e) {
e.printStackTrace();
}
o1.printDetails();
if (o2 != null) {
o2.printDetails();
}
}
}
