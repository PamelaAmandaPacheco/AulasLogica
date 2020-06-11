import java.util.Scanner;
/**
 * Escreva a descrição da classe Trimestre aqui.
 * 
 * @author Pamela Pacheco / Josimar Lima
 * @version 1.0
 * @since 01/06/2020
 * @category Model
 */
public class principal {

   
    public static void main (String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner (System.in);
        
        Abastecer abastecer = new Abastecer();
        
        System.out.println("Tipos de combustiveis: ");
        System.out.println("1.Gasolina R$ 4.49 ");
        System.out.println("2.Alcool R$ 3.68 ");
        System.out.println("3.Alcool R$ 3.71 ");
        System.out.println("4.Flex: Gasolina R$ 4.49  Alcool R$ 3.68 ");
        
        System.out.println( "Digite a opçao de combustível: ");
        abastecer.setOpcao(scanner.nextInt());
        
        System.out.println("Digite a quantidade de combustivel");
        abastecer.setQuantidadeLitros(scanner.nextDouble());
        System.out.println(abastecer);
    }

}
