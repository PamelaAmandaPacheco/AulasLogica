
/**
 * 
 * @author Pamela Pacheco / Josimar Lima
 * @version 1.0
 * @since 01/06/2020
 * @category Model
 */
public class Trimestre {
    
    private int mes;

    public int getMes() {
        return this.mes;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    /**
     * @return Retorna o trimestre de acordo com o mes
     */
    public String verificarMes() {
        if(this.mes >= 1 && this.mes <= 3) {
            return "Primeiro Trimestre";
        } else if(this.mes >= 4 && this.mes <= 6) {
            return "Segundo Trimestre";
        } else if(this.mes >= 7 && this.mes <= 9) {
            return "Terceiro Trimestre";
        } else if(mes >= 10 && mes <= 12) {
            return "Quarto Trimestre";
        }
            return"Digite um mês válido";
    }
    
    @Override
    public String toString() {
        return "\n Mês : " + this.mes
              +"\n Nasceu no : " + this.verificarMes();
    }
}