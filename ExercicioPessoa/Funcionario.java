public class Funcionario extends Pessoa {

    private int numeroRegistro;
    private double salarioFixo;
       
    public Funcionario() {
        super();
    }
       
    public int getNumeroRegistro() {
        return this.numeroRegistro;
    }
    
    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    
    public double getSalarioFixo() {
        return this.salarioFixo;
    }
    
    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
    public double calcularFGTS() {
        return this.salarioFixo * 0.8;
    }
    
    @Override
    public String toString() {
        return "Numero Registro: " + this.numeroRegistro
             + "\nSalario Fixo: " + this.salarioFixo
             + "\nCalculo FGTS: " + calcularFGTS();
    }
}