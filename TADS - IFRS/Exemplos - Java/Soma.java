package Soma;
import java.util.Scanner;

public class Soma {

    public static void main (String[]args){

     Scanner in = new Scanner(System.in); //scanner imprime mostra na tela
     int valor1, valor2, soma, diferenca; //posso declarar varias variaveis desde que seja do mesmo tipo ou embaixo da outra
      

     System.out.println("Digite dois valores"); // imprime na tela
     valor1 = in.nextInt(); //nextInt() ==> indica que o usuario vai digitar um valor inteiro
     valor2 = in.nextInt();

     
     soma = valor1 + valor2; //
     diferenca = valor1 - valor2;
     
     System.out.println("O resultado da soma e =" + soma );                             
     System.out.println("O resultado da diferenca e =" + diferenca);
     
     
     
     
    
}
}
