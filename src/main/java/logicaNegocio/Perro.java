package logicaNegocio;

public class Perro extends Animal implements Domestico {
    private final TipoHabitat habitat = TipoHabitat.TERRESTRE;

    public String emitirSonido() {
        return "Ladrido";
    }

    public String obtenerDieta() {
        return "Omnívoro";
    }

    public String interactuarConHumano() {
        return "El perro mueve la cola y ladra de felicidad";
    }

    public TipoHabitat getHabitat() {
        return habitat;
    }
}


