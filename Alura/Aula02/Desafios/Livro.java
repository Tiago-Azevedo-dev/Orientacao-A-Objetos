public class Livro {
    private String titulo, autor;
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void exibirDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.setTitulo("Harry Potter");
        l1.setAutor("J.K. Rowling");
        l1.exibirDetalhes();
    }
}