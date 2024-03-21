import java.util.Scanner;
public class C2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
         int soma,dif,div,multi;
         int n1,n2;

         System.out.println("Digite dois numeros:");
         n1 = in.nextInt();
         n2 = in.nextInt();

         soma = n1 + n2;
         dif = n1 - n2;
         div = n1 / n2;
         multi = n1 * n2;

         System.out.println("A soma entre os numeros " + n1 + " mais " + n2 + " = " + soma );
         System.out.println("A diferenca entre os numeros " + n1 + " menos " + n2 + " = " + dif );
         System.out.println("A divisao entre os numeros " + n1 + " divido " + n2 + " = " + div );
         System.out.println("A multiplicao entre os numeros " + n1 + " multiplicado " + n2 + " = " + multi );




    }
}
