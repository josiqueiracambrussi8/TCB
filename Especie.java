package model;

public class Especie {
    private int id;
    private String nomeCientifico;
    private String nomePopular;
    private String reino;
    private String filo;
    private String habitat;
    private String ondeFoiVisto;
    private int quantoFoiVisto;
    private String caracteristica;
    private String periodoReproducao;
    private String statusDeNatividade;

    public Especie(){
        
    }

    public int getId() {
        return id;
    }
    public String getNomeCientifico() {
        return nomeCientifico;
    }
    public String getNomePopular() {
        return nomePopular;
    }
    public String getReino() {
        return reino;
    }
    public String getFilo() {
        return filo;
    }
    public String getHabitat() {
        return habitat;
    }
    public String getOndeFoiVisto() {
        return ondeFoiVisto;
    }
    public int getQuantoFoiVisto() {
        return quantoFoiVisto;
    }
    public String getCaracteristica() {
        return caracteristica;
    }
    public String getPeriodoReproducao() {
        return periodoReproducao;
    }
    public String getStatusDeNatividade() {
        return statusDeNatividade;
    }

}
