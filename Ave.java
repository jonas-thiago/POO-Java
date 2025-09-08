public class Ave extends Animal implements Voador, Andador {
    public Ave(String nomeDoAnimal) {
        super(nomeDoAnimal);
    }

    public void piar() {
        System.out.println(getNomeDoAnimal() + " está piando: Piu piu!");
    }
    
    @Override
    public void voar(){
        System.out.println(getNomeDoAnimal() + " está voando alto!");
    }

    @Override
    public void andar() {
        System.out.println(getNomeDoAnimal() + " está pulando.");
    }
}