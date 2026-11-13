package teste;

import JDBC.PlantaDAO;
import model.Planta;

public class TestePlanta {
      public static void main(String[] args) {

        Planta planta = new Planta();

        // Dados da tabela especime
        planta.setNomeCientifico("Monstera deliciosa");
        planta.setNomePopular("Costela-de-adão");
        planta.setFilo("Tracheophyta");
        planta.setClasse("Magnoliopsida");
        planta.setHabitat("Floresta tropical");
        planta.setOndeFoiVisto("Jardim");
        planta.setQuantoFoiVisto(2);
        planta.setCaracteristica("Folhas grandes");
        planta.setPeriodoReproducao("Primavera");
        planta.setStatusDeNatividade("Nativa");

        // Dados específicos da planta
        planta.setGrupoEvolutivo("Angiosperma");
        planta.setTipoDeSolo("Úmido");
        planta.setNecessidadeDeLuz("Luz indireta");
        planta.setNecessidadeDeAgua("Moderada");
        planta.setEstrategiaNutricional("Autotrófica");

        // Chama o DAO
        PlantaDAO dao = new PlantaDAO();
        dao.inserir(planta);

        System.out.println("ID gerado: " + planta.getId());
    }
}