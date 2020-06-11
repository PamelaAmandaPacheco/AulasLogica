import java.util.Scanner;
/**
 * @author Pamela Pacheco / Josimar 
 * @version 1.0
 * @since 01/06/2020 09:23
 * @category Model
 */
public class Principal {
    /**
     * Na classe principal terá o Scanner para a digitação
     */
    public static void main (String args[]) {
    
        System.out.println("\f");
        
        Nadador nadador = new Nadador();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        nadador.setNome(scanner.next()); 
        System.out.println("Digite sua idade: ");
        nadador.setIdade(scanner.nextInt()); 
        System.out.println(nadador);
    }
}
