import java.util.Scanner;

public class Ex1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float metro,centimetro,conversao;

        System.out.println("Digite o valor em metros");
        metro = in.nextFloat();

        conversao = metro * 100f;

        System.out.printf("O valor e %.2f centimetros",conversao);
    }
}