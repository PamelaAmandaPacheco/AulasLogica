public class Abacaxi extends Fruta implements FrutaInterface {
    
    @Override
    public String comer() {
        return "Doce e ácido";
    }
    
    @Override
    public String retirarCasca() {
        return "Descascar com a faca a casca dura";
    }
    
    @Override
    public String toString() {
        return "\nCor: " + this.cor
             + "\nSabor: " + this.comer()
             + "\nCasca: " + this.retirarCasca();
    }
   
}