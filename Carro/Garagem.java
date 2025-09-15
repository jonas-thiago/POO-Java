public class Garagem {

    public static void main(String[] args) {
        // Criando os objetos
        Carro meuCarro = new Carro("Fusca", "Azul", 1975, 2);
        Moto minhaMoto = new Moto("CG 160 Titan", "Vermelha", 2023, 160);
        Caminhao meuCaminhao = new Caminhao("Scania R450", "Branco", 2021, 50.5);

        System.out.println("--- MINHA GARAGEM ---");
        System.out.println("\n-------------------------\n");

        // --- Testando o Carro ---
        System.out.println("VEÍCULO: CARRO");
        meuCarro.mostrarDetalhes();
        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.ligarArCondicionado();
        meuCarro.parar();

        System.out.println("\n-------------------------\n");

        // --- Testando a Moto ---
        System.out.println("VEÍCULO: MOTO");
        minhaMoto.mostrarDetalhes();
        minhaMoto.ligar();
        minhaMoto.acelerar();
        minhaMoto.empinar();
        minhaMoto.parar();

        System.out.println("\n-------------------------\n");

        // --- Testando o Caminhão ---
        System.out.println("VEÍCULO: CAMINHÃO");
        meuCaminhao.mostrarDetalhes();
        meuCaminhao.ligar();
        meuCaminhao.acelerar();
        meuCaminhao.carregar();
        meuCaminhao.parar();
    }
}