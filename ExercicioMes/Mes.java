/**
 * Escreva a descrição da classe Mes aqui.
 * 
 * @author Pamela Pacheco 
 * @version 1.0
 * @since 30/05/2020 - 15:23
 * @category Model
 */
public class Mes {

    private int dia;
    
    public Mes() {
    }
    
    public int getDia() {
        return this.dia;
    }
    
    public void setDia(int dia) {
        this.dia = (dia > 0) ? dia : 0;
    }
    
    
    /**
     * @return verificar dia
     */
    public String verificarDia() {
        if(this.dia <= 28) {
            return "Fevereiro";
        } if (this.dia <= 30) {
            return "Abril, Junho, Setembro e Novembro";
        } if (this.dia <= 31) {
            return "Janeiro, Março, Maio, Julho, Agosto, Outubro, Dezembro";
        } else {
            return "Mês inválido";
        }
    }  
    @Override
    public String toString() {
        return "\nDia: " + this.dia
             + "\nMês: " + verificarDia();
    }           
}
    