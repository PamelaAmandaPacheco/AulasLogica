public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Animal animal = new Animal();
        animal.setNome("Bolinha");
        System.out.println("Nome: " + animal.getNome());
        animal.setIdade(8);
        System.out.println("Idade: " + animal.getIdade());
        
        Gato gato = new Gato();
        gato.setRaca("Persa");
        System.out.println("Raça: " + gato.getRaca());
        gato.setPeso(4);
        System.out.println("Peso: " + gato.getPeso());
        gato.setAnoNasc(2012);
        System.out.println("Ano Nascimento: " + gato.getAnoNasc());
        System.out.println("Idade: " + gato.calcularIdade());
        System.out.println("Peso com acréscimo de 15%: " + gato.acrescentarQuinzePorCentoNoPeso());
        
        Cachorro cachorro = new Cachorro();
        cachorro.setCor("Preto");
        System.out.println("Cor: " + cachorro.getCor());
        cachorro.setAltura(6);
        System.out.println("Altura: " + cachorro.getAltura());
        cachorro.setPeso(4);
        System.out.println("Peso: " + cachorro.getPeso());
        cachorro.setIdadeSemanas(348);
        System.out.println("Idade em semanas: " + cachorro.getIdadeSemanas());
        System.out.println("Cálculo peso: " + cachorro.calcularPeso());
        System.out.println("Cálculo IMC: " + cachorro.calcularIMC());
    }
}