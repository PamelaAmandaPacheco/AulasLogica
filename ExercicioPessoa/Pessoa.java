public class Pessoa{
    
    private String nome;
    private String sobrenome;
    private String email;
    private String dataNasc;
    
    public Pessoa() {
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getDataNasc() {
        return this.dataNasc;
    }
    
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.nome
            +"\nSobrenome: " + this.sobrenome
            +"\nE-mail: " + this.email
            +"\nData de Nascimento: " + this.dataNasc;
    }
    
}