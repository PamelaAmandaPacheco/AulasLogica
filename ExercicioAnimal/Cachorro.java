public class Cachorro extends Animal {

    private double altura;
    private String cor;
    private int idadeSemanas;
    private double peso;
    
    public Cachorro() {
        super();
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public void setAltura(double altura ) {
        this.altura = altura;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public int getIdadeSemanas() {
        return this.idadeSemanas;
    }
    
    public void setIdadeSemanas(int idadeSemanas) {
        this.idadeSemanas = idadeSemanas;
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double calcularPeso() {
        return (this.peso / this.idadeSemanas) * 52;
    }
    
    public double calcularIMC() {
        return calcularPeso() / (this.altura * 2);
    }
    
    @Override
    public String toString() {
        return "Cor: " + this.cor
            +"\nAltura: " + this.altura
            +"\nIdade em semanas: " + this.idadeSemanas
            +"\nCálculo peso: " + calcularPeso()
            +"\nCalculo IMC: " + calcularIMC();
    }
}