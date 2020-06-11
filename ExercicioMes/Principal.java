/**
 * Write a description of class Mes here.
 *
 * @author Pamela Pacheco
 * @version 1.0
 * @since 30/05/2020 - 18:47
 * @category View
 */
import java.util.Scanner;
public class Principal {
    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Mes mes = new Mes();
        System.out.println("Digite o dia do mês:");
        mes.setDia(scanner.nextInt()); 
        System.out.println(mes);
    }
}