import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Abacaxi abacaxi = new Abacaxi();
        System.out.println("Digite a cor do Abacaxi: ");
        abacaxi.setCor(scanner.next("Amarelo"));  
        System.out.println(abacaxi);
        
        Morango morango = new Morango();
        System.out.println("Digite a cor do Morango: ");
        morango.setCor(scanner.next("Vermelho"));
        System.out.println(morango);

        Kiwi kiwi = new Kiwi();
        System.out.println("Digite a cor do Kiwi: ");
        kiwi.setCor(scanner.next("Verde"));
        System.out.println(kiwi);
    }
}