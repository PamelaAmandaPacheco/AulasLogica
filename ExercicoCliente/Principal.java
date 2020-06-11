public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Cliente cliente = new Cliente();
        cliente.setCodigoCliente(1235679);
        System.out.println("Codigo Cliente: " + cliente.getCodigoCliente());
        cliente.setNome("João da Silva");
        System.out.println("Nome: " + cliente.getNome());
        cliente.setProfissao("Arquiteto");
        System.out.println("Profissão: " + cliente.getProfissao());
        
        PessoaJuridica pessoajuridica = new PessoaJuridica();
        pessoajuridica.setRazaoSocial("Turismo Ltda.");
        System.out.println("Razão social: " + pessoajuridica.getRazaoSocial());
        pessoajuridica.setCNPJ(756453421);
        System.out.println("CNPJ: " + pessoajuridica.getCNPJ());
        pessoajuridica.setInscricao(13579863);
        System.out.println("Inscrição: " + pessoajuridica.getInscricao());
        pessoajuridica.setEstadual(246809753);
        System.out.println("Estadual: " + pessoajuridica.getEstadual());
        pessoajuridica.setCapitalInicial(50000);
        System.out.println("Capital Inicial: " + pessoajuridica.getCapitalInicial());
        
        PessoaFisica pessoafisica = new PessoaFisica();
        pessoafisica.setEstadoCivil("Casado");
        System.out.println("Estado Civil: " + pessoafisica.getEstadoCivil());
        pessoafisica.setCPF(123789054);
        System.out.println("CPF: " + pessoafisica.getCPF());
        pessoafisica.setDataNasc("27/01/1979");
        System.out.println("Data Nascimento: " + pessoafisica.getDataNasc());
        
    }
}