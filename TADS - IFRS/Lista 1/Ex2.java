import java.util.Scanner;

public class Ex2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float resultado;
        int num;

        System.out.println("Digite um numero");
        num = in.nextInt();

        resultado = num /5;
        System.out.println("O numero "+ num + " com a porcentagem de 20% da o valor de "+ resultado);



    }
}