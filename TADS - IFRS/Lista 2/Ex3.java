import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float num;
        boolean positivo;
      
        System.out.println("Digite 1 numero");
        num = in.nextFloat();

        positivo = (num > -1);
        
        
        if (positivo){
            System.out.println("Esse numero e positivo");
         } else {
            System.out.println("Esse numero e negativo");
         }
        
}
}