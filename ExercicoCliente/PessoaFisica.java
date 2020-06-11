public class PessoaFisica extends Cliente {

    private String estadoCivil;
    private int CPF;
    private String dataNasc;
    
    public PessoaFisica() {
        super();
    }
    
     public String getEstadoCivil() {
        return this.estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
     public int getCPF() {
        return this.CPF;
    }
    
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    
     public String getDataNasc() {
        return this.dataNasc;
    }
    
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    @Override
    public String toString() {
        return "Pessoa fisica"
            +"Estado Civil: " + this.estadoCivil
            +"\nCPF: " + this.CPF
            +"\nData Nascimento: " + this.dataNasc;
    }
}