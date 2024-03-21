import java.util.Scanner;
public class C4 {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ascii;
        char letra, maiuscula,miniscula;

        System.out.println("Digite uma Letra:");
        letra = in.next().charAt(0);

        ascii = letra;

        maiuscula = (char) (ascii - 62);
        miniscula = (char) (ascii - 96);

        System.out.println("A letra maiscula e " + maiuscula);
        System.out.println("A letra minuscula e " + miniscula);


        
    }
}
