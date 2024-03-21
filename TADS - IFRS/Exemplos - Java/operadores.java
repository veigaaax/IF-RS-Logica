
import java.util.Scanner;


public class operadores {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int a,b;

     System.out.println("Informe 2 numeros");
     a = in.nextInt();
     b = in.nextInt();

     if (b>a){ 
        System.out.println("Entao " + b + " e maior que " + a);
     }
     else { 
        System.out.println("Entao " + a + " e maior que " + b);
     }
    }
}
