import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Pamela Pacheco / Josimar Lima
 * @version 1.0
 * @since 01/06/2020
 * @category Model
 */
public class MesTest {
   
    private Trimestre trimestre = new Trimestre();
    
    public MesTest() {
        trimestre.setMes(2);
    }

    @Before
    public void setUp() {
        trimestre.setMes(2);        
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void verificarMes() {
        trimestre.setMes(1);
        assertEquals("Primeiro Trimestre", trimestre.verificarMes()); 
        trimestre.setMes(2);
        assertEquals("Primeiro Trimestre", trimestre.verificarMes());         
        trimestre.setMes(3);
        assertEquals("Primeiro Trimestre", trimestre.verificarMes());         
        trimestre.setMes(4);
        assertEquals("Segundo Trimestre", trimestre.verificarMes());         
        trimestre.setMes(5);
        assertEquals("Segundo Trimestre", trimestre.verificarMes());         
        trimestre.setMes(6);
        assertEquals("Segundo Trimestre", trimestre.verificarMes());         
        trimestre.setMes(7);
        assertEquals("Terceiro Trimestre", trimestre.verificarMes());         
        trimestre.setMes(8); 
        assertEquals("Terceiro Trimestre", trimestre.verificarMes());         
        trimestre.setMes(9);
        assertEquals("Terceiro Trimestre", trimestre.verificarMes());         
        trimestre.setMes(10);
        assertEquals("Quarto Trimestre", trimestre.verificarMes());         
        trimestre.setMes(11);
        assertEquals("Quarto Trimestre", trimestre.verificarMes());         
        trimestre.setMes(12);
        assertEquals("Quarto Trimestre", trimestre.verificarMes()); 
    }
}
