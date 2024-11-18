package logicaNegocio;

public class Delfin extends Animal {
    private final TipoHabitat habitat = TipoHabitat.ACUATICO;
    public String emitirSonido() {
        return "Chirrido";
    }

    public String obtenerDieta() {
        return "Pescado";
    }

    public String obtenerHabitad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

