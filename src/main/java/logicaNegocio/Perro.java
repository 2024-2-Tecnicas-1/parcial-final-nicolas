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

    @Override
    public String obtenerHabitad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


