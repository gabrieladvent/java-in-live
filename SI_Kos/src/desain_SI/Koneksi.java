/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desain_SI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ribka Restu
 */
public class Koneksi {
    public Connection getConnection() {
        String host = "localhost";
        String port = "1521";
        String db = "xe";
        String usr = "hr";
        String pwd = "205314096";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Maaf, driver class tidak ditemukan");
            System.out.println(ex.getMessage());
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@"
                    + host + ":" + port + ":" + db, usr, pwd);
        } catch (SQLException ex) {
            System.out.println("Maaf koneksi tidak berhasil. ");
            System.out.println(ex.getMessage());
        }
       
        return conn;
    }
}
