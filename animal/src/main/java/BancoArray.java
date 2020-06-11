import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BancoArray implements BancoArrayInterface {

    List<Animal> sistema = new ArrayList();

    public BancoArray() {
    }

    public void cadastrar(Animal animal) { this.sistema.add(animal); }

    public List<Animal> buscar() { return this.sistema; }

    public void excluir(int index) { this.sistema.remove(index); }

    public void alterar(int index, Animal animal) {
        this.sistema.add(index, animal);
    }

    public Animal filtrar(Animal animal, int filtro) {
        Iterator var3;
        Animal animalAuxiliar;
        switch(filtro) {
            case 1:
                var3 = this.sistema.iterator();

                do {
                    if (!var3.hasNext()) {
                        return null;
                    }

                    animalAuxiliar = (Animal) var3.next();
                } while(!animalAuxiliar.getNome().contains(animal.getNome()));

                return animalAuxiliar;
            case 2:
                var3 = this.sistema.iterator();

                do {
                    if (!var3.hasNext()) {
                        return null;
                    }

                    animalAuxiliar = (Animal) var3.next();
                } while(animalAuxiliar.getIdade() != animal.getIdade());

                return animalAuxiliar;
            default:
                return null;
        }
    }

    public int verificarQuantidade() {
        return this.sistema.size();
    }

    public void apagarSistema() {
        this.sistema.clear();
    }
}


