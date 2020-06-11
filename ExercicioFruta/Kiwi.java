public class Kiwi extends Fruta implements FrutaInterface {
    
    @Override
    public String comer() {
        return "Doce e ácido";
    }
    
    @Override
    public String retirarCasca() {
        return "Descascar com a faca a casca";
    }
    
    @Override
    public String toString() {
        return "\nCor: " + this.cor
             + "\nSabor: " + this.comer()
             + "\nCasca: " + this.retirarCasca();
    }
   
}