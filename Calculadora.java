public class Calculadora {
    int op1, op2, resultado;
    public Calculadora() {
    }

    public Calculadora(int o1, int o2) {
        this.op1 = o1;
        this.op2 = o2;
    }

    public void setOp1(int op) {
        this.op1 = op;
    }

    public void setOp2(int op) {
        this.op2 = op;
    }

    public int getResultado() {
        return resultado;
    }

    public int getOp1() {
        return op1;
    }

    public int getOp2() {
        return op2;
    }

    public int somar() {
        resultado = op1 + op2;
        return resultado;
    }

    public int subtrair() {
        resultado = op1 - op2;
        return resultado;
    }

    public int dividir() {
        resultado = op1 / op2;
        return resultado;
    }

    public int multiplicar() {
        resultado = op1 * op2;
        return resultado;
    }  

public static void main(String[] args) {    
    Calculadora c1 = new Calculadora(2, 3);
    Calculadora c2 = new Calculadora(2, -2);
    c1.somar();
    c2.somar();

    System.out.println(c1.getOp1());
    System.out.println(c1.getOp2());
    System.out.println(c1.getResultado());
    
    System.out.println(c2.getOp1());
    System.out.println(c2.getOp2());
    System.out.println(c2.getResultado());
    }
}