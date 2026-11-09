package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Animal;

public class AnimalDAO {
    public void inserir(Animal animal){
        //INSERT DADOS PAI
        String sql = "INSERT  INTO especime(nome_cientifico, nome_popular, filo, "+
        "classe, habitat, onde_visto, quanto_visto, caracteristica, periodo_reproducao, "+
        "status_natividade) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    
        Connection conexao = null;
        PreparedStatement stmt = null;

        try {
            conexao = Conexao.getInstancia().conectar();
            stmt = conexao.prepareStatement(sql);
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
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()){                //PROBLEMA NO ID!!!!!!!!
            int id = rs.getInt("id_especime");//LEMBRAR A PROF Q TENHO ID NA CLASSE ESPECIME!!!!!!!
            animal.setId(id);;
            }

            //RESET SQL
            sql = "INSERT  INTO animal(id_especime, habito, dieta, comportamento_social, "+
        "periodo_gestacao, migracao, extensao_territorio) VALUES (?, ?, ?, ?, ?, ?, ?);";

            //PEGA DADOS FILHA COM CHAVE ORIMARIA PAI = HERANÇA
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
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


        } catch (Exception e) {
            System.out.println("deu bom não");
        }


    
    }
    
}
