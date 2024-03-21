import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int validos, nulos, brancos, total; 
        int porVal, porNul, porBran;
       
        System.out.println("Informe o numero de votos validos");
        validos = in.nextInt();

        System.out.println("Informe o numero de votos nulos");
        nulos = in.nextInt();

        System.out.println("Informe o numero de brancos ");
        brancos = in.nextInt();

        total = validos + nulos + brancos;

        porVal = (validos * 100)/total;
        porNul = (nulos * 100)/total;
        porBran = (brancos *100)/total;

        System.out.println("O percentual de votos Validos sao de: " + porVal +"%");
        System.out.println("O percentual de votos Nulos sao de: " + porNul +"%" );
        System.out.println("O percentual de votos Brancos sao de: " + porBran +"%");



    }
}
