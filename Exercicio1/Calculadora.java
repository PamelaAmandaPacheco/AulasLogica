public class Calculadora {

    private double valor1;
    private double valor2;
    private double valor3;
    
    
    
     public double getValor1() { 
        return this.valor2;
    }
    
    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }
    
     public double getValor2() { 
        return this.valor2;
    }
    
    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    
     public double getValor3() { 
        return this.valor3;
    }
    
    public void setValor3(double valor3) {
        this.valor3 = valor3;
    }
    
     public double calcularValorNumeros() {
        return this.valor1 * this.valor2 * this.valor3;
    }
    
    @Override
    public String toString() {
        return "\nValor 1: " + this.valor1
             + "\nValor 2: " + this.valor2
             + "\nValor 3: " + this.valor3
             + "\nMultiplicação dos tres valores: " + this.calcularValorNumeros();             
    }
     

}