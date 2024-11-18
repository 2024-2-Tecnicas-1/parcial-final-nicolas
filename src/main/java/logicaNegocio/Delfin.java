package logicaNegocio;

public class Delfin extends Animal {
    private final TipoHabitat habitat = TipoHabitat.ACUATICO;
    public String emitirSonido() {
        return "Chirrido";
    }

    public String obtenerDieta() {
        return "Pescado";
    }

    public TipoHabitat getHabitat() {
        return habitat;
    }
}

