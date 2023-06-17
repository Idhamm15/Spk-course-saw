/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author idham
 */
public class Koneksi {

    public static Connection konekKeDB() {
        try {
            MysqlDataSource mds = new MysqlDataSource();
            mds.setUser("root");
            mds.setPassword("123");
            mds.setDatabaseName("saw_course_java_dekstop");
            mds.setServerName("localhost");
            mds.setPortNumber(3306);
            mds.setServerTimezone("Asia/Jakarta");
            Connection koneksi = mds.getConnection();
//            System.out.println("OK");
            return koneksi;
        } catch (SQLException e) {
//            System.err.println("Can't connect: "+e.getMessage());
//            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
   
    
}
