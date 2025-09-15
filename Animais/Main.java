public class Main {
    public static void main(String[] args) {
        // --- Testando o Cachorro ---
        Raca rotweiller = new Raca("Rotweiller");
        Cachorro meuCachorro = new Cachorro("Hanna", rotweiller);

        System.out.println("--- Informações do Cachorro ---");
        System.out.println("Nome do cachorro: " + meuCachorro.getNomeDoAnimal());
        System.out.println("Raça do cachorro: " + meuCachorro.getRaca().getNomeDaRaca());
        
        meuCachorro.comer();
        meuCachorro.latir();
        meuCachorro.andar();

        System.out.println("\n----------------------------------\n");

        // --- Testando a Ave ---
        Ave meuPassaro = new Ave("Calopsita");

        System.out.println("--- Informações da Ave ---");
        System.out.println("Nome da ave: " + meuPassaro.getNomeDoAnimal());

        meuPassaro.comer();
        meuPassaro.piar();
        meuPassaro.andar();
        meuPassaro.voar();
    }
}