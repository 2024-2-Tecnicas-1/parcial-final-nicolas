package logicaNegocio;

public class Leon extends Animal {
    void EmitirSonido(){
Animal leon = new Leon ();
assertEquals("Rugido", leon.emitirSonido());
    }
    void ObtenerDieta() {
        Animal leon = new Leon();
        assertEquals("Carnivoro", leon.obtenerDieta());
    }
    void LeonHabitat() {
        Animal leon = new Leon();
        assetEquals(TipoHabitat.TERRESTRE, leon.getHabitat());
    }
}
