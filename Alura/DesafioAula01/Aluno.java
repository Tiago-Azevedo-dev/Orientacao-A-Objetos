public class Aluno {
    String nome;
    int idade;
    void exibirInformacoes() {
        System.out.println(nome);
        System.out.println("Idade: " + idade);
    }
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Tiago";
        a1.idade = 19;
        a1.exibirInformacoes();
    }
}