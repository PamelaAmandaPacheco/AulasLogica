public class Animal {

    private String nome;
    private String especie;
    private double peso;
    private double altura;
    private int idade;

    public Animal() {
    }

    public Animal(String nome, String especie, double peso, double altura, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public String getNome() { return this.nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getEspecie() { return this.especie;}

    public void setEspecie(String especie) { this.especie = especie; }

    public double getPeso() { return this.peso; }

    public void setPeso(double peso) { this.peso = peso; }

    public double getAltura() { return this.altura; }

    public void setAltura(double altura) { this.altura = altura; }

    public int getIdade() { return this.idade; }

    public void setIdade(int idade) { this.idade = idade; }

    public double calcularIdadeEmMeses() {
        return this.idade * 12;
    }

    public String toString() {
        return "\nNome: " + this.nome + "\nIdade: " + this.idade  + "\nIdade em meses: " + calcularIdadeEmMeses() + "\nEspécie: " + this.especie + "\nPeso: " + this.peso + "\nAltura: " + this.altura; }
}
