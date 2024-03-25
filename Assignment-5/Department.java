import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
class DepartmentD {
    private int id;
    private String name;
    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
public class Department {
    private static final String DB_URL = "jdbc:mysql://localhost:9999/departments";
    private static final String DB_USER = "snagaharshita";
    private static final String DB_PASSWORD = "root";

    private static final String INSERT_QUERY = "INSERT INTO department (id, name) VALUES (?,?)";

    public void saveDepartment(DepartmentD department) {
        Connection conn = DriverManager.getConnection(jdbc:mysql://localhost:9999/departments, snagaharshita, root);
             PreparedStatement preparedStatement = conn.prepareStatement(INSERT_QUERY)) 

            preparedStatement.setInt(1, department.getId());
            preparedStatement.setString(2, department.getName());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Department inserted successfully.");
            } else {
                System.out.println("Failed to insert department.");
            }
            }
    public static void main(String[] args) {
        DepartmentD department = new DepartmentD(4,"ECE");
        Department departmentSt = new Department();
        departmentSt.saveDepartment(department);
    }
}
