package logicaNegocio;

public abstract class Animal {
    void LeonAnimal() {
        Animal leon = new Leon();
        assertTrue(leon instanceof Animal);
    } 
    void testDelfinIsAnimal() {
        Animal delfin = new Delfin();
        assertTrue(delfin instanceof Animal);
}
    void testPerroIsAnimalAndDomestico() {
        Animal perro = new Perro();
        assertTrue(perro instanceof Animal);
        assertTrue(perro instanceof Domestico);
        }
