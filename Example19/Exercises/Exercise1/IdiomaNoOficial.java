package Example19.Exercises.Exercise1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class IdiomaNoOficial {
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
                    co.`Name` AS Nombre,
                    COUNT(cl.`Language`) AS idiomaNoOficial
                FROM
                    country co
                INNER JOIN countrylanguage cl ON co.`Code` = cl.`CountryCode`
                WHERE
                    co.`Continent` = "South America"
                    OR co.`Continent` = "North America"
                    AND cl.`Language` = "Spanish"
                    AND cl.`IsOfficial` = "V"
                GROUP BY
                    co.`Name`
                ORDER BY
                    idiomaNoOficial DESC;
                """;

        try (
                Connection c = DriverManager.getConnection(cadConex, user, password);
                Statement stmt = c.createStatement();
                ResultSet res = stmt.executeQuery(consultaSql);) {
            int cantidad = 0;
            while (res.next()) {
                cantidad += Integer.parseInt(res.getString(2));
                System.out.println("Pais: "+res.getString(1)+", Cantidad de idiomas no oficiales: "+res.getString(2));
            }
            System.out.println();
            System.out.println("La cantidadd de idiomas no oficiales de esta region es de: "+cantidad);
        } catch (SQLException e) {
            System.err.println("Error al conectarse con la base de datos " + e.getMessage());
        }

        input.close();
    }
}