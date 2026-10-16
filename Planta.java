package model;

public class Planta extends Especie {
    private String grupoEvolutivo;
    private String tipoDeSolo;
    private String necessidadeDeLuz;
    private String necessidadeDeAgua;
    private String estrategiaNutricional;

    public Planta(){
        
    }

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
    
}
