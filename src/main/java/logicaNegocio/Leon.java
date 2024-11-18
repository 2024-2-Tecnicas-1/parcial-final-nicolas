package logicaNegocio;

public class Leon extends Animal {
    private final TipoHabitat habitat = TipoHabitat.TERRESTRE;

    
    public String emitirSonido() {
        return "Rugido";
    }

    
    public String obtenerDieta() {
        return "Carnívoro";
    }

    @Override
    public String obtenerHabitad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

