package Pessoa;

// Aluno é uma classe CONCRETA que herda da classe ABSTRATA Pessoa.
public class Aluno extends Pessoa {

    private String matricula;

    // Construtor da classe Aluno
    public Aluno(String nome, int idade, String matricula) {
        // 1. A primeira coisa a fazer é chamar o construtor da classe-mãe (Pessoa)
        //    para inicializar os atributos 'nome' e 'idade'.
        super(nome, idade);
        
        // 2. Depois, inicializamos o atributo específico desta classe.
        this.matricula = matricula;
    }

    // Método específico para Aluno
    public String getMatricula() {
        return this.matricula;
    }
    
    // Podemos até sobrescrever um método para dar um comportamento novo
    public void apresentar() {
        // Usamos o getNome() que foi herdado de Pessoa
        System.out.println("Olá, eu sou o(a) aluno(a) " + getNome() + " e minha matrícula é " + this.matricula);
    }
}