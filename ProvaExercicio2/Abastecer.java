 //2 - Faça um programa que receba a quantidade de litros a abastecer, 
//o tipo de combustível e diga o valor a pagar, conforme tabela:
//Combustível 
//1. Gasolina ---------- R$ 4.49 
//2. Álcool ------------ R$ 3.68 
//3. Diesel ------------ R$ 3.71 
//4. Flex -------------- Retornar os valores de Gasolina e Álcool.
/**
 * Escreva a descrição da classe Abastecer aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Abastecer {

    private int opcao;
    private double quantidadeLitros;

    /**
     * Construtor para objetos da classe Abastecer
     */
    public Abastecer() {    
        
    }
    
    public int getOpcao() {
        return this.opcao;   
    }
    
    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }
    
    public double getQuantidadeLitros() {
        return this.quantidadeLitros;   
    }
    
    public void setQuantidadeLitros(double quantidadeLitros) {
        this.quantidadeLitros = quantidadeLitros;
    }
    
    public double calcularGasolina() {
        return this.quantidadeLitros * 4.49;
   
    }
    
    public double calcularAlcool() {
        return this.quantidadeLitros * 3.68;
   
    }
    
    public double calcularDiesel() {
        return this.quantidadeLitros * 3.71;
   
    }
    
    
    public String selecionarTipoCombusativel() {
        switch(this.opcao) {
            case 1 :
            return "Gasolina R$ 4.49";
            
            case 2 :
            return "Alcool R$ 3.68";
            
            case 3 :
            return "Diesel R$ 3.71";
            
            case 4 :
            return "Flex = Alcool R$ 3.68 Gasolina R$ 4.49 ";
            
            default :
            return "Opçao inválida";
        }
    }
    
    public double calcularValorPagar() {
        switch(this.opcao) {
            case 1 :
            return calcularGasolina();
            
            case 2 :
            return calcularAlcool();
            
            case 3 :
            return calcularDiesel();
            
            default :
            return 0;
        }

        
    }


    @Override
    public String toString() {
        return "\n Opção : " + this.opcao
               +"\n opçao selecionada : " + this.selecionarTipoCombusativel()
               +"\n Quantidade: " + this.quantidadeLitros
               +"\n Valor a pagar; " + this.calcularValorPagar();
    }
}
