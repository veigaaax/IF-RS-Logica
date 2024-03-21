 import java.util.Scanner;
 public class Ex1 {


  public static void main(String[]args){
   Scanner in;
   in = new Scanner(System.in);

   int num,antecessor,sucessor;
   num = 0;
   antecessor = 0;
   sucessor = 0;

   System.out.println("Digite um numero:");
   num = in.nextInt();

   antecessor = (num - 1);
   sucessor = (num +1);

   System.out.println("O antecessor do numero " + num + " e " + antecessor);
   System.out.println("O Sucessor do numero "+ num + " e " + sucessor);

 
}
}