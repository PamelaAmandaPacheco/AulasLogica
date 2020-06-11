public class Gato extends Animal {

    private String raca;
    private double peso;
    private int anoNasc;
    
    public Gato() {
        super();
    }
    
    public String getRaca() {
        return this.raca;
    }
    
    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public int getAnoNasc() {
        return this.anoNasc;
    }
    
    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    
    public int calcularIdade() {
        return 2020 - this.anoNasc;
    }
    
    public double acrescentarQuinzePorCentoNoPeso() {
        return this.peso + 0.15;
    }
    
    @Override
    public String toString() {
        return "Raça: " + this.raca
            +"\nPeso: " + this.peso
            +"\nAno Nascimento: " + this.anoNasc
            +"\nIdade: " + calcularIdade()
            +"\nPeso com acréscimo de 15%: " + acrescentarQuinzePorCentoNoPeso();
    }
}