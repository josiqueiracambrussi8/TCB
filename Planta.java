package model;

public class Planta extends Especime {

    private String grupoEvolutivo;
    private String tipoDeSolo;
    private String necessidadeDeLuz;
    private String necessidadeDeAgua;
    private String estrategiaNutricional;

    public Planta(){
        
    }

    //GETTERS
    public String getGrupoEvolutivo() {
        return grupoEvolutivo;
    }
    public String getTipoDeSolo() {
        return tipoDeSolo;
    }
    public String getNecessidadeDeLuz() {
        return necessidadeDeLuz;
    }
    public String getNecessidadeDeAgua() {
        return necessidadeDeAgua;
    }
    public String getEstrategiaNutricional() {
        return estrategiaNutricional;
    }

    //SETTERS
    public void setGrupoEvolutivo(String grupoEvolutivo) {
        this.grupoEvolutivo = grupoEvolutivo;
    }

    public void setTipoDeSolo(String tipoDeSolo) {
        this.tipoDeSolo = tipoDeSolo;
    }

    public void setNecessidadeDeLuz(String necessidadeDeLuz) {
        this.necessidadeDeLuz = necessidadeDeLuz;
    }

    public void setNecessidadeDeAgua(String necessidadeDeAgua) {
        this.necessidadeDeAgua = necessidadeDeAgua;
    }

    public void setEstrategiaNutricional(String estrategiaNutricional) {
        this.estrategiaNutricional = estrategiaNutricional;
    }
}