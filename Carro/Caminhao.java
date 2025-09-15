// public class Caminhao extends Veiculo {
//     private double capacidadeDeCarga;
//     private int numeroDeEixos;

//     public Caminhao(String cor, String modelo, int ano, int numeroDeEixos, double capacidadeDeCarga){
//         super(cor, modelo, ano, numeroDeEixos*2);
//         this.capacidadeDeCarga = capacidadeDeCarga;
//         this.numeroDeEixos = numeroDeEixos;
//     }

//     @Override
//     public void acelerar(){
//         System.out.println("Acelerando o Caminhão....");
//     }

//     public void carregar(){
//         System.out.println("Carregando o Caminhão...");
//     }

//     public void acoplar(){
//         System.out.println("Acoplando o carreta...");
//     }
// }


public class Caminhao extends Veiculo {

    private double capacidadeDeCarga; // em toneladas

    // Construtor do Caminhao
    public Caminhao(String modelo, String cor, int ano, double capacidadeDeCarga) {
        super(modelo, cor, ano);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public void acelerar() {
        System.out.println("Caminhão " + getModelo() + " acelerando lentamente...");
    }

    // Método específico do Caminhao
    public void carregar() {
        System.out.println("Caminhão sendo carregado.");
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Capacidade de Carga: " + this.capacidadeDeCarga + " toneladas");
    }
}