public class Professor extends Pessoa {
    
    private int numeroRegistro;
    private double numeroHorasTrab;
    private double valorHora;
    
    public Professor() {
        super();
    }
    
    public int getNumeroRegistro() {
        return this.numeroRegistro;
    }
    
    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    
    public double getNumeroHorasTrab() {
        return this.numeroHorasTrab;
    }
    
    public void setNumeroHorasTrab(double numeroHorasTrab) {
        this.numeroHorasTrab = numeroHorasTrab;
    }
    
    public double getValorHora() {
        return this.valorHora;
    }
    
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double calcularSalarioBruto() {
        return this.numeroHorasTrab * this.valorHora;
    }
    
    public double calcularFGTS() {
        return (this.numeroHorasTrab * this.valorHora) * 0.8;
    }
    
    @Override
    public String toString() {
        return "Numero Registro: " + this.numeroRegistro
             + "\nHoras Trabalhada: " + this.numeroHorasTrab
             + "\nValor hora: " + this.valorHora
             + "\nSalário bruto: " + calcularSalarioBruto()
             + "\nCalculo FGTS: " + calcularFGTS();
    }
}
