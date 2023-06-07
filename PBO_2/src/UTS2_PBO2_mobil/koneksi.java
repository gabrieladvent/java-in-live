/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS2_PBO2_mobil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Tak Bertuan
 */
public class koneksi {
    String jdbcURL = "jdbc:mysql://localhost:3306/uts2mall";
    String user = "pbo2";
    String password = "pbo2"; //ganti
    Connection conn = null;
    Statement stmt;
    ResultSet rs;
    String output = "";

    void Connect(){
        boolean stat = Boolean.FALSE;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(jdbcURL, user, password);
            if (conn != null) {
                stat = Boolean.TRUE;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    Connection getkonek () {
        return conn;
    }
    
    void show(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(jdbcURL, user, password);
            stmt = conn.createStatement(); 
            rs = stmt.executeQuery("SELECT Kode, Tipe, Merk, Harga, TgProduksi, Fitur FROM mobil");
            if (rs != null){ //ganti dari !rs.wasNull()
                while (rs.next()){
                    output += rs.getString("Kode")+ "\n"; 
                   // output += rs.getString("last_name") + "\n";
                }
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.print(output);
    }
    
    
}
