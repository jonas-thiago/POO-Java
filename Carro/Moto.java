// public class Moto extends Veiculo {
//     private double potencia;
//     private double peso;

//     public Moto(String cor, String modelo, int ano, double potencia, double peso){
//         super(cor, modelo, ano, 2);
//         this.potencia = potencia;
//         this.peso = peso;
//     }

//     @Override
//     public void acelerar(){
//         System.out.println("Acelerando a Moto....");
//     }

//     public void empinar(){
//         System.out.println("Empinando a moto hehehehe....");
//     }

//     public void buzinarMoto(){
//         System.out.println("Buzinando a moto.....");
//     }

// }


public class Moto extends Veiculo {

    private int cilindradas;

    // Construtor da Moto
    public Moto(String modelo, String cor, int ano, int cilindradas) {
        super(modelo, cor, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void acelerar() {
        System.out.println("Moto " + getModelo() + " acelerando! Raaandandandan!");
    }

    // Método específico da Moto
    public void empinar() {
        System.out.println("Dando grau com a moto! Cuidado!");
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Cilindradas: " + this.cilindradas);
    }
}