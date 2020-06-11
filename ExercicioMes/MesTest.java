import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste MesTest.
 * @author  Pamela Pacheco
 * @version 1.0
 */
public class MesTest {

    private Mes mes = new Mes();
    
    public MesTest() {
    }
    
    @Test
    public void testSetDia() {
        mes.setDia(20);
        assertEquals(20, mes.getDia());       
    }
    
    @Test
    public void testGetDia() {
        assertEquals(20, mes.getDia());
    }    
    
    @Test
    public void testVerificarDia() {
        mes.setDia(20);
        assertEquals("Fevereiro", mes.verificarDia());
        mes.setDia(32);
        assertEquals("Mês inexistente", mes.verificarDia());        
    }  
    
}
    