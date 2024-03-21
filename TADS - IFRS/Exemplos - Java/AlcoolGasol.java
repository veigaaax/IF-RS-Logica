import java.util.Scanner;
public class AlcoolGasol{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float precoAlcool, precoGasol, gasol30;
        boolean compraAlcool;

        System.out.println("Digite o preco da Gasolina e do Alcool");
        precoGasol = in.nextInt();
        precoAlcool = in.nextInt();

        gasol30 = precoGasol * 0.7f;

        compraAlcool = precoAlcool < gasol30;

        if (compraAlcool){
            System.out.println("Alcool");
            if (!compraAlcool){
             }
              else {
            System.out.println("Gasolina");
            }
        }












        
    }

}
