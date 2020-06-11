public class Algoritmo{

    private double base;
    private double altura;
    
    
     public double getBase() { 
        return this.base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
     public double getAltura() { 
        return this.altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularArea() {
        return this.base * this.altura;
    }
    
    public double calcularPerimetro() {
        return this.base + this.base + this.altura + this.altura;
    }
    
    @Override
    public String toString() {
        return "\nBase: " + this.base
             + "\nAltura: " + this.altura
             + "\nArea: " + this.calcularArea()
             + "\nPerimetro: " + this.calcularPerimetro();             
    }
    

}