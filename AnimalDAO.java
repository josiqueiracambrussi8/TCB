package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Animal;

public class AnimalDAO {
        public void inserir(Animal animal){
        //INSERT DADOS PAI
        String sql = "INSERT  INTO especime(nome_cientifico, nome_popular, filo, "+
        "classe, habitat, onde_visto, quanto_visto, caracteristica, periodo_reproducao, "+
        "status_natividade) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conexao = Conexao.getInstancia().conectar();
            stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, animal.getNomeCientifico());
            stmt.setString(2, animal.getNomePopular());
            stmt.setString(3, animal.getFilo());
            stmt.setString(4, animal.getClasse());
            stmt.setString(5, animal.getHabitat());
            stmt.setString(6, animal.getOndeFoiVisto());
            stmt.setInt(7, animal.getQuantoFoiVisto());
            stmt.setString(8, animal.getCaracteristica());
            stmt.setString(9, animal.getPeriodoReproducao());
            stmt.setString(10, animal.getStatusDeNatividade());
            stmt.executeUpdate();

            //PEGA CHAVE PRIMARIA PAI
            rs = stmt.getGeneratedKeys();
            int id = 0;
            if (rs.next()){              
            id = rs.getInt(1);
            animal.setId(id);
            }

            //RESET SQL
            sql = "INSERT  INTO especime_animal(id_especime, habito, dieta, comportamento_social, "+
        "periodo_gestacao, migracao, extensao_territorio) VALUES (?, ?, ?, ?, ?, ?, ?);";

            //PEGA DADOS FILHA COM CHAVE ORIMARIA PAI = HERANÇA
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setString(2, animal.getHabito());
            stmt.setString(3, animal.getDieta());
            stmt.setString(4, animal.getComportamentoSocial());
            stmt.setString(5, animal.getPeriodoGestacao());
            stmt.setString(6, animal.getMigracao());
            stmt.setInt(7, animal.getExtencaoTerritorial());
            stmt.executeUpdate();


        } catch (Exception e) {
            System.out.println("deu bom não");
            e.printStackTrace();
        }


    
    }
}