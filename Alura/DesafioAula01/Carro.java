public class Carro {
    String modelo, cor;
    int ano;
    void exibirFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.modelo = "Toyota Supra";
        c1.cor = "Azul Escuro";
        c1.ano = 2024;
        c1.exibirFichaTecnica();
    }
}