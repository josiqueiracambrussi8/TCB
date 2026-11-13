package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private String URL = "jdbc:mysql://localhost:3306/biobank";
    private String USUARIO = "aluno";
    private String SENHA = "aluno";

    public Conexao() {
        
    }

    public static Conexao getInstancia(){
        return new Conexao();
    }

    public Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }

}