import java.util.Scanner;

public class Ex2 {
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int base,altura,area,perimetro;

        System.out.println("Digite a base e altura do retangulo");
        base = in.nextInt();
        altura = in.nextInt();

        area = (base * altura);
        perimetro = base + base + altura + altura;

        System.out.printf("A area total do retangulo e %d \n e o perimetro e %d", area, perimetro);


}
}