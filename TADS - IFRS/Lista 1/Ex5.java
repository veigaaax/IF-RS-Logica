import java.util.Scanner;
public class Ex5{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int vcelsius,vfahrenheit,resultado;
        vcelsius = 0;
        vfahrenheit =0;

        System.out.println("Digite a temperatura em Celsius");
        vcelsius = in.nextInt();

        resultado = (vcelsius *9/5) + 32;
        

        System.out.println(vcelsius + " graus em Celsius equivale a " + resultado + " em Fahrenheit");

        

    


    }
}