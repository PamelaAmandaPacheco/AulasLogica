/**
 * @author Pamela Pacheco / Josimar 
 * @version 1.0
 * @since 01/06/2020 08:25
 * @category Model
 */
public class Nadador {

   private String nome;
   private int idade;
   
   /**
    * Construtor da classe Nadador
    */
   public Nadador() {
   }
    
   public String getNome() {
       return this.nome;
   }
    
   public void setNome(String nome) {
       this.nome = nome;
   }
    
   public int getIdade() {
       return this.idade;
   }
    
   public void setIdade(int idade) {
       this.idade = (idade > 0) ? idade : 0;
   }
    
   /**
     * @return Verificação da idade do nadador por categoria
     */
   public String verificarCategoria() {
       if(this.idade < 8 && this.idade > 0 ) {
           return "Não pode ser nadador. Mínimo oito anos.";
       } else if (this.idade >= 8 && this.idade <= 10) {
           return "Infantil";
       } else if (this.idade >= 11 && this.idade <= 17) {
           return "Juvenil";
       } else if (this.idade >= 18) {
           return "Adulto";
       } else {
           return "Idade inválida!";
       }
   }
   
   @Override
   public String toString() {
        return "\nNome: " + this.nome
             + "\nIdade: " + this.idade
             + "\nVerificar categoria: " + this.verificarCategoria();
    }
}