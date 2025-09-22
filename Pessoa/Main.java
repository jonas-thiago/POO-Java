package Pessoa;

public class Main {

    public static void main(String[] args) {
        // MELHORIA 1: Instanciamos a classe CONCRETA 'Aluno', não a abstrata 'Pessoa'.
        // MELHORIA 2: Usamos um nome de variável mais claro ('alunoJonas').
        Aluno alunoJonas = new Aluno("Jonas", 33, "2025A-001");

        // Agora podemos usar os métodos que vieram da classe Pessoa...
        System.out.println("O nome dele(a) é: " + alunoJonas.getNome());
        System.out.println("A idade dele(a) é: " + alunoJonas.getIdade());

        // ...e também os métodos específicos da classe Aluno!
        System.out.println("A matrícula é: " + alunoJonas.getMatricula());

        System.out.println("---");

        // MELHORIA 3: Usando um método que demonstra o comportamento do objeto.
        alunoJonas.apresentar();
    }
}