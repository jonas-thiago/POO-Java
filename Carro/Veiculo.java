// public abstract class Veiculo {
//     // 1. Atributos privados para garantir o encapsulamento
//     private String cor;
//     private String modelo;
//     private int ano;
//     private int velocidade;
//     private int numeroDeRodas;

//     // 2. Construtor para inicializar o objeto
//     public Veiculo(String cor, String modelo, int ano, int numeroDeRodas) {
//         this.cor = cor;
//         this.modelo = modelo;
//         this.ano = ano;
//         this.numeroDeRodas = numeroDeRodas;
//         this.velocidade = 0; // Velocidade inicial é sempre 0
//     }

//     // Métodos genéricos
//     public void ligar() {
//         System.out.println("Ligando o veículo...");
//     }

//     public void acelerar() {
//         System.out.println("Acelerando o veículo...");
//     }

//     public void parar() {
//         System.out.println("Parando o veículo.");
//         this.velocidade = 0;
//     }

//     // 3. Getters e Setters para acesso controlado aos atributos
//     public String getCor() {
//         return cor;
//     }

//     public void setCor(String cor) {
//         this.cor = cor;
//     }

//     public String getModelo() {
//         return modelo;
//     }

//     public void setModelo(String modelo) {
//         this.modelo = modelo;
//     }

//     public int getAno() {
//         return ano;
//     }

//     public void setAno(int ano) {
//         this.ano = ano;
//     }

//     public int getVelocidade() {
//         return velocidade;
//     }
// }


public abstract class Veiculo {

    // Atributos protegidos (visíveis para as classes filhas)
    private String modelo;
    private String cor;
    private int ano;
    private int velocidade;

    // Construtor
    public Veiculo(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = 0; // Todo veículo começa parado
    }

    // Métodos que todas as classes filhas devem ter
    public abstract void acelerar();

    // Métodos comuns a todos
    public void ligar() {
        System.out.println(this.modelo + " ligando...");
    }

    public void parar() {
        this.velocidade = 0;
        System.out.println(this.modelo + " parou.");
    }

    public void mostrarDetalhes() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }
}