public class ContaCorrente extends Conta implements ContaInterface {

    private double taxa;
    
    public ContaCorrente()
    
    public double getTaxa() {
        return this.taxa;
    }
    
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    public double getValor() {
        return this.valor;
    }
    
    public void setValor(double Valor) {
        this.valor = valor;
    }
    
    public double gerarExtrato() {
        return this.saldo + (this.saldo * 0.4);
    }
    
    @Override
    public double sacar() {
        return this.saldo - (this.valor + this.taxa);
    }
    
    @Override 
    public double depositar() {
        return this.saldo + (this.valor + this.taxa);
    }
    
    @Override
    public String toString() {
        return "\nTitular: " + this.titular
            + "\nNumero: " + this.numero
            + "\nAgencia: " + this.agencia
            + "\nSaldo: " + this.saldo
            + "\nExtrato: " + this.gerarExtrato()
            + "\nSacar: " + this.sacar()
            + "\nDepositar: " + this.depositar();
    }
}