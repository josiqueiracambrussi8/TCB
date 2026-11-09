package model;

public class Especime {
    private int idEsp;
    private String nomeCientifico;
    private String nomePopular;
    private String filo;
    private String classe;
    private String habitat;
    private String ondeFoiVisto;
    private int quantoFoiVisto;
    private String caracteristica;
    private String periodoReproducao;
    private String statusDeNatividade;

    public Especime(){
        
    }

    //GETTERS
    public int getId() {
        return idEsp;
    }
    public String getNomeCientifico() {
        return nomeCientifico;
    }
    public String getNomePopular() {
        return nomePopular;
    }
    public String getClasse() {
        return classe;
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

    //SETTERS
    public void setId(int idEsp) {
        this.idEsp = idEsp;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public void setNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
    }

    public void setClasse(String reino) {
        this.classe = reino;
    }

    public void setFilo(String filo) {
        this.filo = filo;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setOndeFoiVisto(String ondeFoiVisto) {
        this.ondeFoiVisto = ondeFoiVisto;
    }

    public void setQuantoFoiVisto(int quantoFoiVisto) {
        this.quantoFoiVisto = quantoFoiVisto;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void setPeriodoReproducao(String periodoReproducao) {
        this.periodoReproducao = periodoReproducao;
    }

    public void setStatusDeNatividade(String statusDeNatividade) {
        this.statusDeNatividade = statusDeNatividade;
    }
}
