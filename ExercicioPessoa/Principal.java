public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Aline");
        System.out.println("Nome: " + pessoa.getNome());
        pessoa.setSobrenome("Santos");
        System.out.println("Sobrenome: " + pessoa.getSobrenome());
        pessoa.setEmail("alinesantos@gmail.com");
        System.out.println("Email: " + pessoa.getEmail());
        pessoa.setDataNasc("10/02/1991");
        System.out.println("Data de nascimento: " + pessoa.getDataNasc());
        
       
        
        Professor professor = new Professor();
        professor.setNumeroRegistro(12345678);
        System.out.println("Número Registro: " + professor.getNumeroRegistro());
        professor.setNumeroHorasTrab(220);
        System.out.println("Horas Trabalhada: " + professor.getNumeroHorasTrab());
        professor.setValorHora(6);
        System.out.println("Valor Hora: " + professor.getValorHora());
        System.out.println("Salário bruto: " + professor.calcularSalarioBruto());
        System.out.println("Calculo FGTS: " + professor.calcularFGTS());
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNumeroRegistro(98765432);
        System.out.println("Número Registro: " + funcionario.getNumeroRegistro());
        funcionario.setSalarioFixo(1300);
        System.out.println("Salario fixo: " + funcionario.getSalarioFixo());
        System.out.println("Calculo FGTS: " + funcionario.calcularFGTS());
    }
}