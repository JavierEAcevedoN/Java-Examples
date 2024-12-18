package Example19.Exercises.Exercise3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class IdiomaNoOficialPais {
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
                SELECT cl.`Language` AS idiomaNoOficial FROM
                    country co
                INNER JOIN countrylanguage cl ON co.`Code` = cl.`CountryCode`
                WHERE
                    co.`Name` = ?
                    AND cl.`IsOfficial` = "F"
                ORDER BY
                    idiomaNoOficial DESC;
                """;

        try (
                Connection c = DriverManager.getConnection(cadConex, user, password);
                PreparedStatement pstmt = c.prepareStatement(consultaSql);) {

            System.out.print("Ingresa un pais: ");
            String pais = (String) input.next();
            pstmt.setString(1, pais);

            ResultSet res = pstmt.executeQuery();
            System.out.println("Idiomas no oficiales del pais " + pais);
            while (res.next()) {
                System.out.println("Idiomas: " + res.getString(1));
            }
        } catch (SQLException e) {
            System.err.println("Error al conectarse con la base de datos " + e.getMessage());
        }

        input.close();
    }
}