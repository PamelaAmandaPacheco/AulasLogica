import java.io.PrintStream;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Principal {

    public Principal() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BancoArray sistema = new BancoArray();
        Animal animal = null;
        boolean var4 = false;

        int opcao;
        do {
            System.out.println("1-Cadastrar\n2-Ver sistema\n3-Excluir\n4-Filtrar\n5-Ver quantidade\n6-Limpar sistema\n7-Sair");
            opcao = scanner.nextInt();
            switch(opcao) {
                case 1:
                    animal = new Animal();
                    System.out.println("Digite o nome: ");
                    animal.setNome(scanner.next());
                    System.out.println("Digite a idade: ");
                    animal.setIdade(scanner.nextInt());
                    System.out.println("Digite a espécie: ");
                    animal.setEspecie(scanner.next());
                    System.out.println("Digite o peso: ");
                    animal.setPeso(scanner.nextDouble());
                    System.out.println("Digite a altura: ");
                    animal.setAltura(scanner.nextDouble());
                    sistema.cadastrar(animal);
                    System.out.println("Animal cadastrado com sucesso!");
                    break;
                case 2:
                    if (sistema.verificarQuantidade() != 0) {
                        List var10000 = sistema.buscar();
                        PrintStream var10001 = System.out;
                        Objects.requireNonNull(var10001);
                        var10000.forEach(var10001::println);
                    } else {
                        System.out.println("Não há animais cadastrados!");
                    }
                    break;
                case 3:
                    System.out.println("Digite uma posição para excluir: ");
                    int index = scanner.nextInt();
                    sistema.excluir(index);
                    System.out.println("Animal excluido com sucesso!");
                    break;
                case 4:
                    animal = new Animal();
                    System.out.println("Digite o nome do animal que deseja filtrar: ");
                    animal.setNome(scanner.next());
                    System.out.println("Digite a espécie do animal que deseja filtrar: ");
                    animal.setEspecie(scanner.next());
                    System.out.println("Digite a idade do animal que deseja filtrar: ");
                    animal.setIdade(scanner.nextInt());
                    animal = sistema.filtrar(animal, 1);
                    System.out.println(animal != null ? animal : "Animal não encontrado!");
                    break;
                case 5:
                    System.out.println("Há " + sistema.verificarQuantidade() + " animais cadastrado(s)");
                    break;
                case 6:
                    sistema.apagarSistema();
                    System.out.println("Sistema limpo!");
                    break;
                case 7:
                    System.exit(0);
            }
        } while(opcao != 7);

    }
}


