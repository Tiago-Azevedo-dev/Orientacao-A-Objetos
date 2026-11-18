public class Calculadora {
    double dobrar(double valor) {
        return valor * 2;
    }
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        double dobrado = c1.dobrar(5);
        System.out.println(dobrado);
    }
}