
    
import java.util.Scanner;
public class examecompleto {
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       float mediafinal, mediasemestre, exame,nota1,nota2,nota3,media; 

       System.out.println("Digite a Primeira,Segunda e Terceira nota");
       nota1 = in.nextFloat();
       nota2 = in.nextFloat();
       nota3 = in.nextFloat();

       media = (nota1 + nota2 + nota3) /3;
       
       System.out.println("A sua media e");
       System.out.printf("%2.f", media );

       if (media>=7){
        System.out.println("Parabens pitchulo! Voce aprovou!");
       }
       else {
        System.out.println("Bah pitchulo! Voce nao aprovou!");
        exame = (5)
        System.out.println("Voce precisa tirar" + exame + "nota no exame");
       }


    }
}

