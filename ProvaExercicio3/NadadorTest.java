import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author  Pamela Pacheco / Josimar
 * @version 1.0
 * @since 01/06/2020 08:55
 * @category Model
 */
public class NadadorTest {
    
    private Nadador nadador = new Nadador();
    
    /**
     * Construtor default para a classe de teste NadadorTest
     */
    public NadadorTest() {
    }

    /**
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp() {
        nadador.setNome("Aline");
        nadador.setIdade(15);
    }

    /**
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown() {
    }
    
    /**
     * Teste para verificar a idade
     */
    @Test
    public void testSetIdade() {
        nadador.setIdade(15);
        assertEquals(15, nadador.getIdade());
        
        nadador.setIdade(-2);
        assertEquals(0, nadador.getIdade());        
    }
    
    @Test
    public void testGetIdade() {
        assertEquals(15, nadador.getIdade());
    }    
    
    /**
     * Teste para verificar o nome
     */
    @Test
    public void testSetNome() {
        nadador.setNome("Aline");
        assertEquals("Aline", nadador.getNome());
    }
    
    @Test
    public void testGetNome() {
        assertEquals("Aline", nadador.getNome());
    } 
    
    /**
     * Teste para verificar a categoria conforme a idade
     */
    @Test
    public void testVerificarCategoria() {
        nadador.setIdade(9);
        assertEquals("Infantil", nadador.verificarCategoria());
        
        nadador.setIdade(30);
        assertEquals("Adulto", nadador.verificarCategoria());       
        
        nadador.setIdade(15);
        assertEquals("Juvenil", nadador.verificarCategoria());                
        
        nadador.setIdade(5);
        assertEquals("Não pode ser nadador. Mínimo oito anos.", nadador.verificarCategoria());               
                             
        nadador.setIdade(-2);
        assertEquals("Idade inválida!", nadador.verificarCategoria());                                
    }         
}
