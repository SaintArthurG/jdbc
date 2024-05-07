package application;

import db.DB;
import db.DbException;

import java.sql.*;

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

//         #2 INSERINDO DADOS
//        Scanner sc = new Scanner(System.in);
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        try (Connection conn = DB.getConnection();
//             PreparedStatement ps = conn.prepareStatement(
//                     "INSERT INTO seller"
//                             + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
//                             + "VALUES"
//                             + "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS)) {
//            System.out.print("Name: ");
//            ps.setString(1, sc.nextLine());
//            System.out.print("Email: ");
//            ps.setString(2, sc.nextLine());
//            System.out.print("BirthDate: (dd/MM/yyyy) ");
//            ps.setDate(3, new java.sql.Date(sdf.parse(sc.nextLine()).getTime()));
//            System.out.print("BaseSalary: ");
//            ps.setDouble(4, sc.nextDouble());
//            System.out.print("DepartmentId: ");
//            ps.setInt(5, sc.nextInt());
//            int rowsAffected = ps.executeUpdate();
//            if (rowsAffected > 0 ){
//                ResultSet rs = ps.getGeneratedKeys();
//                while (rs.next()) {
//                    int id = rs.getInt(1);
//                    System.out.println("DONE! Id = " + id);
//                }
//            }
//            else {
//                System.out.println("NO ROWS AFFECTED!");
//            }
//
//        } catch (SQLException | ParseException e) {
//            e.printStackTrace();
//        }

        // #3 ATUALIZANDO DADOS
//        Scanner sc = new Scanner(System.in);
//        try (Connection conn = DB.getConnection(); PreparedStatement st = conn.prepareStatement(
//                "UPDATE seller "
//                        + " SET BaseSalary = BaseSalary + ? "
//                        + "WHERE "
//                        + "(DepartmentId = ?)");) {
//            System.out.print("Incrase Salary: ");
//            st.setDouble(1, sc.nextDouble());
//            System.out.print("Which Department? ");
//            st.setInt(2, sc.nextInt());
//            int rowsAffected = st.executeUpdate();
//
//            System.out.println("DONE! Rows Affected: " + rowsAffected);
//        }
//        catch (SQLException e){
//            e.printStackTrace();
//        }

        // #4 DELETANDO DADOS
//        Scanner sc = new Scanner(System.in);
//        try (Connection conn = DB.getConnection(); PreparedStatement st = conn.prepareStatement(
//                "DELETE FROM department " +
//                        "WHERE " +
//                        "Id = ?")) {
//            st.setInt(1, 3);
//            int rowsAffected = st.executeUpdate();
//            System.out.println("DONE! Rows Affected: " + rowsAffected);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//          #5 TRANSACOES
//        Connection conn = null;
//        Statement st = null;
//        try{
//            conn = DB.getConnection();
//
//            conn.setAutoCommit(false);
//
//            st = conn.createStatement();
//
//            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentID = 1");
//
////            int x = 1;
////            if (x < 2){
////                throw new SQLException("Fake error");
////            }
//
//            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentID = 2");
//
//            conn.commit();
//
//            System.out.println("Rows1 " + rows1);
//            System.out.println("Rows2 " + rows2);
//        }
//        catch (SQLException e){
//            try {
//                conn.rollback();
//                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
//            } catch (SQLException e1) {
//                throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
//            }
//        }


    }
}
