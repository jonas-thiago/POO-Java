package Retangulo;
public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            System.out.println("Erro: Dimensão Inválida");
        }
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Erro: Dimensão Inválida");
        }
    }

    /**
     * MÉTODO CORRIGIDO E MELHORADO:
     * - Não precisa de parâmetros, pois usa os atributos da própria classe.
     * - Tem uma única responsabilidade: calcular e retornar a área.
     */
    public double calcularArea() {
        return this.largura * this.altura;
    }
}