package logicaNegocio;

public class Perro {
   void EmitirSonido() {
        Animal perro = new Perro();
        assertEquals("Ladrido", perro.emitirSonido());
    }
    void ObtenerDieta() {
        Animal perro = new Perro();
        assertEquals("Omnívoro", perro.obtenerDieta());
    }
    void PerroHabitat() {
        Animal perro = new Perro();
        assertEquals(TipoHabitat.TERRESTRE, perro.getHabitat());
    }
    void PerroInteractuarConHumano() {
        Domestico perro = new Perro();
        assertEquals("El perro mueve la cola y ladra de felicidad", perro.interactuarConHumano());
    }
}

