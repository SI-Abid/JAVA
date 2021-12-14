import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project", "root", null);
            Statement stmt = con.createStatement();
            
            // Scanner sc = new Scanner(System.in);
            
            // // create table students
            // String sql = "CREATE TABLE IF NOT EXISTS students (id INT NOT NULL AUTO_INCREMENT, name VARCHAR(255), age INT, PRIMARY KEY (id))";
            // stmt.executeUpdate(sql);

            // // insert data
            // System.out.println("Insert data");
            // System.out.print("Name: ");
            // String name = sc.nextLine();
            // System.out.print("Age: ");
            // int age = sc.nextInt();
            // sc.nextLine();
            // sql = "INSERT INTO students (name, age) VALUES ('" + name + "', " + age + ")";
            // stmt.executeUpdate(sql);

            // // print students table data
            // System.out.println("\nStudents table data");

            String sql = "SELECT * FROM instructor";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("\n\tInstructor table data");
            System.out.println("==============================================");
            /**
             * print the table header
             */
            System.out.println("ID\tName\t\tDepartment\tSalary");
            while (rs.next()) {
                String value = String.format("%d\t%-10s\t%-10s\t%d", rs.getInt("id"), rs.getString("name"), rs.getString("dept_name"), rs.getInt("salary"));
                System.out.println(value);
            }
            System.out.println("==============================================\n");

            // sc.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
