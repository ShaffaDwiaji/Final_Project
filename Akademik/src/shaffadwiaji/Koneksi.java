package shaffadwiaji;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Shaffa
 */
public class Koneksi {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/akademik";
        String username = "root";
        String password = "";

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                System.out.println("Koneksi ke database Berhasil");
            } else {
                System.out.println("Gagal melakukakan koneksi ke database");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan saat koneksi ke database: " + e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Terjadi kesalahan saat menutup koneksi: " + e.getMessage());
            }
        }
        
        return connection;
    }
}