package Example19.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConecionDB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // protocol//[hosts][/database][?properties]
        // Ejemplo jdbc:mysql://host1:33060/sakila

        String host = "jdbc:mysql://localhost:3306/";
        String user = "root";
        System.out.print("Ingresa la contraseña: ");
        String password = (String) input.next();
        String db = "world";
        String cadConex = host + db;

        String consultaSql = "SELECT * FROM country";

        try (
                Connection c = DriverManager.getConnection(cadConex, user, password);
                Statement stmt = c.createStatement();
                ResultSet res = stmt.executeQuery(consultaSql);) {
            while (res.next()) {
                System.out.println(res.getString(1));
            }
        } catch (SQLException e) {
            System.err.println("Error al conectarse con la base de datos " + e.getMessage());
        }

        input.close();
    }
}