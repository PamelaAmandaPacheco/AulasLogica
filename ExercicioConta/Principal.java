import java.lang.String;
import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        ContaCorrente contacorrente = new ContaCorrente();
        System.out.println("Digite o nome do titular: ");
        contacorrente.serTitular(scanner.next());
        System.out.println("Digite o numero: ");
        contacorrente.serNumero(scanner.nextInt());
        System.out.println("Digite a agencia: ");
        contacorrente.serAgencia(scanner.nextInt());
        System.out.println("Digite o saldo: ");
        contacorrente.serSaldo(scanner.nextDouble());
        System.out.println("Digite o valor para sacar ou depositar: ");
        contacorrente.setValor(scanner.nextDouble());
        System.out.println("Digite a taxa: ");
        contacorrente.setTaxa(scanner.nextDouble());
        System.out.println(contacorrente);
        
        ContaPoupanca contapoupanca = new ContaPoupanca();
        System.out.println("Digite o nome do titular: ");
        contapoupanca.serTitular(scanner.next());
        System.out.println("Digite o numero: ");
        contapoupanca.serNumero(scanner.nextInt());
        System.out.println("Digite a agencia: ");
        contapoupanca.serAgencia(scanner.nextInt());
        System.out.println("Digite o saldo: ");
        contapoupanca.serSaldo(scanner.nextDouble());
        System.out.println("Digite o valor para depositar ou sacar: ");
        contapoupanca.setValor(scanner.nextDouble());
        System.out.println("Digite a taxa: ");
        contapoupanca.setTaxa(scanner.nextDouble());
        System.out.println(contapoupanca);
        
        
    }
}