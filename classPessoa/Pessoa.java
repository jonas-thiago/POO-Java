package classPessoa;

public abstract class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // CORREÇÃO 1: O método deve retornar String, não void.
    public String getNome() {
        // CORREÇÃO 2: Apenas retorna o valor do atributo, sem reatribuir.
        return this.nome;
    }

    // CORREÇÃO 1: Setters devem ser void.
    public void setNome(String nome) {
        // CORREÇÃO 2: Setters não retornam valor, apenas atribuem.
        this.nome = nome;
    }
    
    // CORREÇÃO 1: O método deve retornar int, não void.
    public int getIdade() {
        // CORREÇÃO 2: Apenas retorna o valor.
        return this.idade;
    }

    // CORREÇÃO 1: Setters devem ser void (já estava correto).
    public void setIdade(int idade) {
        if (idade >= 0) {
            // CORREÇÃO 2: Removido o 'return'. Apenas a atribuição é necessária.
            this.idade = idade;
        } else {
            System.out.println("Erro: Idade Inválida");
        }
    }
}