package logicaNegocio;

public class Leon extends Animal {
    private final TipoHabitat habitat = TipoHabitat.TERRESTRE;

    
    public String emitirSonido() {
        return "Rugido";
    }

    
    public String obtenerDieta() {
        return "Carnívoro";
    }

    public TipoHabitat getHabitat() {
        return habitat;
    }
}

