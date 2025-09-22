package Retangulo;
public class Main {

    public static void main(String[] args) {
        // Passamos apenas os valores na ordem correta que o construtor espera.
        Retangulo meuRetangulo = new Retangulo(10.0, 5.0);

        // 1. Chamamos o método para obter o valor
        double areaCalculada = meuRetangulo.calcularArea();

        // 2. Agora decidimos o que fazer com o valor (neste caso, imprimir)
        System.out.println("A largura do retângulo é: " + meuRetangulo.getLargura());
        System.out.println("A altura do retângulo é: " + meuRetangulo.getAltura());
        System.out.println("A área do retângulo é: " + areaCalculada);
    }
}