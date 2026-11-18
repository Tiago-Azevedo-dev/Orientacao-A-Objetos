package EstudoDirigido.P1;
public class Q1{
public static void main (String[] args) {
   int a = 13; 
   int b = 10; 
   int c = 30; 
   
   String resposta1 = ""; 
   String resposta2 = ""; 
   
   resposta1 += a;             //resposta1 = 53 //resposta2 = "131030"
   resposta1 += b; 
   resposta1 += c; 
   
   resposta2 += a + b + c; 
   
   System.out.println (resposta1); 
   System.out.println (resposta2); 
}
}