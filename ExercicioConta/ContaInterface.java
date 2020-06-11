public interface ContaInterface {

    public String getTitular();
    public int getNumero();
    public int getAgencia();
    public double getSaldo();
    public double gerarExtrato();
    public double getTaxa();
    public double sacar();
    public double depositar();
}