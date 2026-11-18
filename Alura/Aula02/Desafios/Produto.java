public class Produto {
    private double preco;
    private String nome;
    public double getPreco() {
        return preco;
    }
    public String getNome() {
        return nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void aplicarDesconto(double porcentagem) {
        double desconto = 1 - (porcentagem / 100);
        this.preco = preco * desconto;
    }
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setPreco(35.99);
        p1.setNome("Cerveja");
        System.out.println("Preço: " + p1.getPreco());
        System.out.println("Nome: " + p1.getNome());
        p1.aplicarDesconto(30);
        System.out.println("Preço com desconto: " + p1.getPreco());
    }
}