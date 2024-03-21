import java.util.Scanner;
public class C1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, v2;
        float num2, v1;

        System.out.println("Digite um numero inteiro");
        num1 = in.nextInt();

        System.out.println("Digite um numero decimal");
        num2 = in.nextFloat();

        v1 = (float)num1;
        v2 = (int)num2;

        System.out.println("O numero" + num1 + "em forma decimal e " + v1);
        System.out.println("O numero" + num2 + "em forma decimal e " + v2);

    }
}
