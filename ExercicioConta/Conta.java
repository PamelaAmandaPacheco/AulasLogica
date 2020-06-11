public abstract class Conta {

    protected String titular;
    protected int numero;
    protected int agencia;
    protected double saldo;
    
    public Conta() {
        this.saldo = 100.0;
    }
    
    public String getTitular() {
        return this.titular;
    }
    
    public void serTitular(String titular) {
        this.titular = titular;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void serNumero(int numero) {
        this.numero = numero;
    }
    
    public int getAgencia() {
        return this.agencia;
    }
    
    public void serAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void serSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
}