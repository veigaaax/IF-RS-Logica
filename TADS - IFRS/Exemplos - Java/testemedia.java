import java.util.Scanner;
public class testemedia {
    public static void main (String []args){
      Scanner in = new Scanner(System.in);

      float nota1, nota2, nota3, exame, media;
      boolean aprovado;
      final float nota_aprovacao = 7.0f;

      System.out.println("Informe 3 notas para obter sua media");
      nota1 = in.nextFloat();
      nota2 = in.nextFloat();
      nota3 = in.nextFloat();

      media = (nota1 + nota2 + nota3) /3;
      System.out.printf("Sua media e %.1f ", media);

      aprovado = media >= nota_aprovacao;
      

      if (aprovado){
        System.out.println("Voce aprovou!");
       if (media >= 9)
       System.out.println("Voce tirou A");
       if (media >= 8)
       System.out.println("Voce tirou B");

      } else {
        System.out.println("Voce nao aprovou");
        exame =  (5 - media * 0.6f) / 0.4f;
        System.out.printf("Sua nota para o exame e %.1f", exame);
        
        }


    }
}
