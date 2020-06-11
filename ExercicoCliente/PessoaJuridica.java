public class PessoaJuridica extends Cliente {

    private String razaoSocial;
    private int CNPJ;
    private int inscricao;
    private int estadual;
    private double capitalInicial;
    
    public PessoaJuridica() {
        super();
    }
    
     public String getRazaoSocial() {
        return this.razaoSocial;
    }
    
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
     public int getCNPJ() {
        return this.CNPJ;
    }
    
    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }
    
     public int getInscricao() {
        return this.inscricao;
    }
    
    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }
    
     public int getEstadual() {
        return this.estadual;
    }
    
    public void setEstadual(int estadual) {
        this.estadual = estadual;
    }
    
     public double getCapitalInicial() {
        return this.capitalInicial;
    }
    
    public void setCapitalInicial(double capitalInicial) {
        this.capitalInicial = capitalInicial;
    }
    
    @Override
    public String toString() {
        return "Razão Social: " + this.razaoSocial
            +"\nCNPJ: " + this.CNPJ
            +"\nInscrição: " + this.inscricao
            +"\nEstadual: " + this.estadual
            +"\nCapital Inicial: " + this.capitalInicial;
    }
}