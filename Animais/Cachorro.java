public class Cachorro extends Animal implements Andador {
    private Raca raca;

    public Cachorro(String nomeDoAnimal, Raca raca) {
        super(nomeDoAnimal);
        this.raca = raca;
    }

    public void latir() {
        // As classes filhas agora usam o getter para acessar o nome do pai.
        System.out.println(getNomeDoAnimal() + " está latindo: Au au!");
    }

    public Raca getRaca() {
        return this.raca;
    }

    @Override
    public void andar() {
        System.out.println(getNomeDoAnimal() + " está andando.");
    }
}