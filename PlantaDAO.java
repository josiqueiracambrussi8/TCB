package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Planta;

public class PlantaDAO {
    public void inserir(Planta planta){
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
            stmt.setString(1, planta.getNomeCientifico());
            stmt.setString(2, planta.getNomePopular());
            stmt.setString(3, planta.getFilo());
            stmt.setString(4, planta.getClasse());
            stmt.setString(5, planta.getHabitat());
            stmt.setString(6, planta.getOndeFoiVisto());
            stmt.setInt(7, planta.getQuantoFoiVisto());
            stmt.setString(8, planta.getCaracteristica());
            stmt.setString(9, planta.getPeriodoReproducao());
            stmt.setString(10, planta.getStatusDeNatividade());
            stmt.executeUpdate();

            //PEGA CHAVE PRIMARIA PAI
            rs = stmt.getGeneratedKeys();
            int id = 0;
            if (rs.next()){                
            id = rs.getInt(1);
            planta.setId(id);
            }

            //RESET SQL
            sql = "INSERT  INTO especime_planta(id_especime, grupo_evolutivo, tipo_solo, necessidade_luz, "+
        "necessidade_agua, estrategia_nutricional) VALUES (?, ?, ?, ?, ?, ?);";

            //PEGA DADOS FILHA COM CHAVE ORIMARIA PAI = HERANÇA
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setString(2, planta.getGrupoEvolutivo());
            stmt.setString(3, planta.getTipoDeSolo());
            stmt.setString(4, planta.getNecessidadeDeLuz());
            stmt.setString(5, planta.getNecessidadeDeAgua());
            stmt.setString(6, planta.getEstrategiaNutricional());
            stmt.executeUpdate();


        } catch (Exception e) {
            System.out.println("deu bom não");
            e.printStackTrace();
        }


    
    }
}