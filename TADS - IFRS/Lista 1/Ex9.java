
import java.util.Scanner;
public class Ex9{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int homens,mulheres,kids;
        float resultado;
        float v1, v2;
        
        v1 = 0.20f;
        
        System.out.println("Quantos mulheres irao comparecer no churrasco?");
        mulheres = in.nextInt();

        System.out.println("Quantos homens irao comparecer no churrasco?");
        homens = in.nextInt();
    
        System.out.println("Quantos criancas irao comparecer no churrasco?");
        kids = in.nextInt();

        v2 = (homens * 400) + (mulheres *320) + (kids * 200);
        resultado = v2 * v1;
    
        System.out.println("Serao necessarias " + resultado + " de Carne para o Churrasco");
        





    }

}