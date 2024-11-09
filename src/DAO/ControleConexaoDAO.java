package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControleConexaoDAO {

    private static final String HOST = "localhost";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String DATA = "db_banco_versatil";
   

    public Connection conectarDadosDAO() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://"+HOST+":3306/"+DATA+"?";
            conn = DriverManager.getConnection(url,USER,PASSWORD);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return conn;
    }

            }
        
    

