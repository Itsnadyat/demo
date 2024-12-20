package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class DatabaseConnection {
    private static Connection connection;

    
    public static Connection getConnection() {
        if (connection == null) {
            try {
                
                Properties properties = new Properties();
                FileInputStream fileInputStream = new FileInputStream("db.properties");
                properties.load(fileInputStream);

                String url = properties.getProperty("db.url");
                String username = properties.getProperty("db.username");
                String password = properties.getProperty("db.password");

                
                connection = DriverManager.getConnection(url, username, password);
                System.out.println("Connexion à la base de données réussie !");
            } catch (IOException | SQLException e) {
                e.printStackTrace();
                System.out.println("Erreur lors de la connexion à la base de données !");
            }
        }
        return connection;
    }

    
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connexion à la base de données fermée.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

