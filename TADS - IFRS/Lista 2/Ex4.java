import java.util.Scanner;

public class Ex4 {
   
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n1,n2,temp;

        System.out.println("Digite dois numeros");
        n1 = in.nextInt();
        n2 = in.nextInt();


        temp = n1;
        n1 = n2;
        n2 = temp;

        if (n1 > n2){
            System.out.printf("O valor %d e maior que %d",n1,n2 );

        } else {
            System.out.printf("O valor %d e maior que %d",n2,n1 );
        }

        

    }
}