import java.util.List;

public interface BancoArrayInterface {

    void cadastrar(Animal var1);

    List<Animal> buscar();

    void excluir(int var1);

    void alterar(int var1, Animal var2);

    Animal filtrar(Animal var1, int var2);

    int verificarQuantidade();

    void apagarSistema();
}
