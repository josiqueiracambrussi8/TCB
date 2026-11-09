package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Especime;

public class EspecimeDAO {
    public void inserir(Especime especime){
        String sql = "INSERT  especime(nome_cientifico, nome_popular, filo, classe, habitat, onde_visto, quanto_visto, caracteristica, periodo_reproducao, status_natividade) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    
        Connection conexao = null;
        PreparedStatement stmt = null;

        try {
            conexao = Conexao.getInstancia().conectar();
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, especime.getNomeCientifico());
            stmt.setString(2, especime.getNomePopular());
            stmt.setString(3, especime.getFilo());
            stmt.setString(4, especime.getClasse());
            stmt.setString(5, especime.getHabitat());
            stmt.setString(6, especime.getOndeFoiVisto());
            stmt.setInt(7, especime.getQuantoFoiVisto());
            stmt.setString(8, especime.getCaracteristica());
            stmt.setString(9, especime.getPeriodoReproducao());
            stmt.setString(10, especime.getStatusDeNatividade());

        } catch (Exception e) {
            System.out.println("deu bom não");
        }
    
    }
}
