package EstudoDirigido.P1;
import javax.swing.JOptionPane;
public class Q2 {
public static void main (String[] args) {
    String strA = JOptionPane.showInputDialog("Informe o valor de A"); //leu-se o valor 13.5
    String strB = JOptionPane.showInputDialog("Informe o valor de B"); //leu-se o valor 5
    float a = Float.parseFloat(strA);   //type-cast
    int b = Integer.parseInt(strB);  //type-cast    
    JOptionPane.showMessageDialog(null, "A + B = " + (int)(a + b));     //18 type-cast
    JOptionPane.showMessageDialog(null, "A - B = " + (a - b));         //8.5
}
}