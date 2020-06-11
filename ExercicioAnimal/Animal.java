public class Animal {

    private String nome;
    private int idade;
    
    public Animal() {
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
     public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.nome
            +"\nIdade: " + this.idade;
    }
}