package application;

import db.DB;
import db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // #1 FAZENDO CONEXAO
//        try (Connection conn = DB.getConnection();
//             Statement st = conn.createStatement();
//             ResultSet rs = st.executeQuery("SELECT * FROM department")){
//            while (rs.next()){
//                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
//            }
//        }
//        catch (SQLException e) {
//            e.printStackTrace();
//        }

        // #2 INSERINDO DADOS
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try (Connection conn = DB.getConnection();
             PreparedStatement ps = conn.prepareStatement(
                     "INSERT INTO seller"
                             + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                             + "VALUES"
                             + "(?, ?, ?, ?, ?)")) {
            System.out.print("Name: ");
            ps.setString(1, sc.nextLine());
            System.out.print("Email: ");
            ps.setString(2, sc.nextLine());
            System.out.print("BirthDate: (dd/MM/yyyy) ");
            ps.setDate(3, new java.sql.Date(sdf.parse(sc.nextLine()).getTime()));
            System.out.print("BaseSalary: ");
            ps.setDouble(4, sc.nextDouble());
            System.out.print("DepartmentId: ");
            ps.setInt(5, sc.nextInt());
            int rowsAffected = ps.executeUpdate();

            System.out.print("DONE! ROWS AFFECTED: " + rowsAffected);
        } catch (SQLException | ParseException e) {
            e.printStackTrace();
        }
    }
}
