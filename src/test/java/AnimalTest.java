import logicaNegocio.Animal;
import logicaNegocio.Delfin;
import logicaNegocio.Leon;
import logicaNegocio.TipoHabitat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public abstract class AnimalTest {

    @Test
    void testHabitatSetterAndGetter() {
        Animal leon = new Leon();
        assertEquals(TipoHabitat.TERRESTRE, leon.obtenerHabitad());
        
        Animal delfin = new Delfin();
        assertEquals(TipoHabitat.ACUATICO, delfin.obtenerHabitad());
    }

    @Test
    abstract void testEmitirSonido();

    @Test
    abstract void testObtenerDieta();
}
