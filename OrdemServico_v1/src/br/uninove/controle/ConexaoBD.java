/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uninove.controle;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Roberto Silva
 */
public class ConexaoBD {

    static Connection connection = null;

    public static Connection conectar() throws Exception {

        String driver = "";
        String usuario = "";
        String senha = "";
        String url = "";
        String banco = "";

        //so renomear se precisar do outro properties
        File prop_file = new File(new File("").getAbsolutePath() + "/jdbc.properties");

        if (!prop_file.isFile()) {
            throw new Exception("N�o achou a arquivo de propriedade, caminho:" + prop_file.getAbsolutePath() + " , errado.");
        }

        Properties properties = new Properties();
        //Setamos o arquivo que ser� lido
        FileInputStream fis = new FileInputStream(prop_file.getAbsolutePath());

        //m�todo load faz a leitura atrav�s do objeto fis
        properties.load(fis);

        //Captura o valor da propriedade, atrav�s do nome da propriedade(Key)
        usuario = properties.getProperty("jdbc.user");
        senha = properties.getProperty("jdbc.pass");
        driver = properties.getProperty("jdbc.driver");
        url = properties.getProperty("jdbc.url");
        banco = properties.getProperty("jdbc.dataBase");
        
        Class.forName(driver);

        connection = DriverManager.getConnection(url + banco, usuario, senha);

        return connection;
    }

    public static Connection getConectar() throws SQLException {
        return connection;
    }

    //sobrecarga dos metodo desconectar,
    //na sobrecarga muda somente a assinatura dos metodos ou seja os par�metros
    public static void desconectar(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            System.out.println("|StatusConexao|\nErro, causa:" + e.getClass());
            e.printStackTrace();
        }
    }

    public static void desconectar(Connection conn, PreparedStatement pstm) {
        try {
            if (pstm != null) {
                pstm.close();
            }

            if (conn != null) {
                conn.close();
            }

        } catch (Exception e) {
            System.out.println("|StatusConexao|\nErro, causa:" + e.getClass());
            e.printStackTrace();
        }
    }

    public static void desconectar(Connection conn, PreparedStatement pstm, ResultSet rs) {
        try {

            if (rs != null) {
                rs.close();
            }

            if (pstm != null) {
                pstm.close();
            }

            if (conn != null) {
                conn.close();
            }

        } catch (Exception e) {
            System.out.println("|StatusConexao|\nErro, causa:" + e.getClass());
            e.printStackTrace();

        }
    }
}
