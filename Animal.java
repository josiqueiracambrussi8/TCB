package model;

public class Animal extends Especime {

    private String habito;
    private String dieta;
    private String periodoGestacao;
    private String comportamentoSocial;
    private String migracao;
    private int extencaoTerritorial;

    public Animal(){

    }

    //GETTERS
    public String getHabito() {
        return habito;
    }
    public String getDieta() {
        return dieta;
    }
    public String getPeriodoGestacao() {
        return periodoGestacao;
    }
    public String getComportamentoSocial() {
        return comportamentoSocial;
    }
    public String getMigracao() {
        return migracao;
    }
    public int getExtencaoTerritorial() {
        return extencaoTerritorial;
    }


    //SETTERS
    public void setHabito(String habito) {
        this.habito = habito;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public void setPeriodoGestacao(String periodoGestacao) {
        this.periodoGestacao = periodoGestacao;
    }

    public void setComportamentoSocial(String comportamentoSocial) {
        this.comportamentoSocial = comportamentoSocial;
    }

    public void setMigracao(String migracao) {
        this.migracao = migracao;
    }

    public void setExtencaoTerritorial(int extencaoTerritorial) {
        this.extencaoTerritorial = extencaoTerritorial;
    }
}
