import java.util.Scanner;

public class Ex6{
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
         int nt1,nt2,media;
         System.out.println("Digite sua primeira e segunda nota:");
         nt1 = in.nextInt();
         nt2 = in.nextInt();

         media = (nt1 + nt2) / 2;

         System.out.println("A media das suas notas e:"+ media);

         

    }
}