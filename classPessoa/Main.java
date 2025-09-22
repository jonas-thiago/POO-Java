package classPessoa;

public class Main {
    public static void main(String[] args) {
        Aluno alunoJonas = new Aluno("Jonas", 33, "2025A-001");

        System.out.println("O nome dele(a) é: " + alunoJonas.getNome());
        System.out.println("A idade dele(a) é: " + alunoJonas.getIdade());
        System.out.println("A matrícula é: " + alunoJonas.getMatricula());
        System.out.println("---");
        alunoJonas.apresentar();
    }
}