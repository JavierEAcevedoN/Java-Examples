package Example19.Exercises.Exercise2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CiudadesPorPais {
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

        String consultaSql = """
                SELECT
                    ci.`Name`
                FROM
                    country co
                INNER JOIN city ci ON co.`Code` = ci.`CountryCode`
                WHERE
                    co.`Name` = 
                """;

        System.out.print("Ingresa un pais: ");
        String pais = input.next();
        consultaSql += "'"+pais+"'";

        try (
                Connection c = DriverManager.getConnection(cadConex, user, password);
                Statement stmt = c.createStatement();
                ResultSet res = stmt.executeQuery(consultaSql);) {
            System.out.println("Las ciudades del pais "+pais+" son: ");
            while (res.next()) {
                System.out.println("Ciudad: "+res.getString(1));
            }
        } catch (SQLException e) {
            System.err.println("Error al conectarse con la base de datos " + e.getMessage());
        }

        input.close();
    }
}