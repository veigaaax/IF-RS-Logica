import java.util.Scanner;
public class Idade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idade;
        idade = 0;

        System.out.println("Digite sua idade");
        idade = in.nextInt();

        if (idade >= 18) {
            System.out.println("Voce e maior de idade");
        } else {
            System.out.println("Voce e pitchulo");
        } 
    }
}
