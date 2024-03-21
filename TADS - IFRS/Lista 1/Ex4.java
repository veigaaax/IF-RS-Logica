import java.util.Scanner;

public class Ex4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base,altura,areatotal;

        System.out.println("Informe os seguintes valores: base, altura");
        base = in.nextDouble();
        altura = in.nextDouble();

        areatotal = (altura * base)/2;

        System.out.println("A area total do triangulo e: "+ areatotal );

    }
}