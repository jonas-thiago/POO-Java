// public class Carro extends Veiculo {
//     private String tipo;
//     private String marca;

//     public Carro(String cor, String modelo, int ano, String tipo, String marca){
//         super(cor, modelo, ano, 4);
//         this.tipo = tipo;
//         this.marca = marca;
//     }

//     @Override
//     public void acelerar(){
//         System.out.println("ACelerrando o Carro....");
//     }

//     public void estacionar(){
//         System.out.println("Estacionando o carro...");
//     }

//     public void re(){
//         System.out.println("Dando ré no carro");
//     }
// }


public class Carro extends Veiculo {

    private int numeroDePortas;

    // Construtor do Carro
    public Carro(String modelo, String cor, int ano, int numeroDePortas) {
        // 1º: Chama o construtor da classe pai (Veiculo)
        super(modelo, cor, ano);
        // 2º: Inicializa os atributos próprios
        this.numeroDePortas = numeroDePortas;
    }

    // Implementação obrigatória do método abstrato
    @Override
    public void acelerar() {
        System.out.println("Carro " + getModelo() + " acelerando! Vruuum!");
    }

    // Método específico do Carro
    public void ligarArCondicionado() {
        System.out.println("Ar condicionado ligado.");
    }

    // Sobrescrevendo para adicionar detalhes específicos do Carro
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes(); // Mostra os detalhes comuns de Veiculo
        System.out.println("Portas: " + this.numeroDePortas);
    }
}