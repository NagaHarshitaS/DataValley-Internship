import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
    private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USERNAME = "snagaharshita";
    private static final String PASSWORD = "root";
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void main(String[] args) {
  	connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            String query = "SELECT student_id, name, branch, rollno FROM students";
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int studentId = resultSet.getInt("student_id");
                String name = resultSet.getString("name");
                String branch = resultSet.getString("branch");
                int rollno = resultSet.getInt("rollno");
                System.out.println("Student ID: " + studentId);
                System.out.println("Name: " + name);
                System.out.println("Branch: " + branch);
                System.out.println("RollNo: " + rollno);
}
               try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}
