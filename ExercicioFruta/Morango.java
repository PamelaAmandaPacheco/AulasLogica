public class Morango extends Fruta implements FrutaInterface {

   @Override
    public String comer() {
        return "Agridoce";
    }
    
    @Override
    public String retirarCasca() {
        return "Apenas tirar as folhas";
    }
    
    @Override
    public String toString() {
        return "\nCor: " + this.cor
             + "\nSabor: " + this.comer()
             + "\nCasca: " + this.retirarCasca();
    } 
}