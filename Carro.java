// A classe Carro serve como o "molde".
// Ela define a estrutura, mas não é um objeto real.
public class Carro {
    //Atributos(características)
    String modelo;
    String cor;
    int ano;
    int velocidade;

    //Métodos(comportamentos)
    public void acelerar() {
        velocidade++;
        System.out.println("Acelerando! Velocidade atual: " + velocidade);
    }

    public void frear() {
        if (velocidade > 0) {
            velocidade--;
        }
        System.out.println("Freando! Velocidade atual: " + velocidade);
    }
}