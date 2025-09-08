public class StatusAluno {

    public static void main(String[] args) {
        int nota = 20;

        if (nota >= 90) {
            System.out.println("Parabéns! Excelente nota!");
        } else if (nota >= 70) {
            System.out.println("Aprovado!");
        } else if (nota >= 60) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}