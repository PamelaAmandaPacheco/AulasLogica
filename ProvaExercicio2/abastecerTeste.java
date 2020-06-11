

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste abastecerTeste.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class abastecerTeste {

    private Abastecer abastecer = new Abastecer();
    
    
    /**
     * @ Construtor default para a classe de teste abastecerTeste
     */
    public abastecerTeste() {
    
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp(){
        abastecer.setOpcao(1);
        abastecer.setQuantidadeLitros(25);
    }

   
    @After
    public void tearDown() {
    }
    
    @Test
    public void testSetOpcao() {
        abastecer.setOpcao(1);
        assertEquals(1, abastecer.getOpcao());
        
        abastecer.setOpcao(2);
        assertEquals(2, abastecer.getOpcao());
        
        abastecer.setOpcao(3);
        assertEquals(3, abastecer.getOpcao());
        
        abastecer.setOpcao(4);
        assertEquals(4, abastecer.getOpcao());
        
    }
    
    @Test
    public void testGetOpcao() {
        assertEquals(1, abastecer.getOpcao());
        
        assertEquals(2, abastecer.getOpcao());
        
        assertEquals(3, abastecer.getOpcao());
        
        assertEquals(4, abastecer.getOpcao());
    }
    
    @Test
    public void testSetQuantidadeLitros() {
        abastecer.setQuantidadeLitros(25);
        assertEquals(25, abastecer.getQuantidadeLitros());
    }
    
    @Test
    public void testGetQuantidadeLitros() {
        assertEquals(25, abastecer.getQuantidadeLitros());
    }
    
    @Test
    public void testCalcularValorPagar() {
        abastecer.setOpcao(1);
        assertEquals("Gasolina", abastecer.calcularValorPagar());
        abastecer.setOpcao(2);
        assertEquals("Alcool", abastecer.calcularValorPagar());
        abastecer.setOpcao(3);
        assertEquals("Diesel", abastecer.calcularValorPagar());
    }
    
    @Test
    public void testSelecionarTipoCombusativel() {
        abastecer.setOpcao(1);
        assertEquals("Gasolina", abastecer.calcularValorPagar());
        abastecer.setOpcao(2);
        assertEquals("Alcool", abastecer.calcularValorPagar());
        abastecer.setOpcao(3);
        assertEquals("Diesel", abastecer.calcularValorPagar());
        abastecer.setOpcao(4);
        assertEquals("Flex", abastecer.calcularValorPagar());
    }
    
    
}
