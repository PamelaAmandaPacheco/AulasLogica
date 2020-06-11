import java.util.Scanner;
/**
 * Escreva a descrição da classe Trimestre aqui.
 * 
 * @author Pamela Pacheco / Josimar Lima
 * @version 1.0
 * @since 01/06/2020
 * @category Model
 */
public class Principal {
    /**
     * Feita a injeçao e leitura dados
     */
    public static void main(String args[]) {
        
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Trimestre trimestre = new Trimestre();
        
        System.out.println(" Digite o número referente ao mês de nascimento:");
        trimestre.setMes(scanner.nextInt());
        System.out.println(trimestre);
        
    }
}

