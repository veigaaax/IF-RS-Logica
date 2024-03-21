
//faça um programa que leia a quantidade de um mesmo item e o seu valor. E aplique um desconto no valor de
// 5% do valor final a cada 3 itens;

import java.util.Scanner; 
  public class descontao{

     public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      int quantidade;
      float valorDesconto, valorItem, valorFinalCDesconto,semDesconto,valortotaldeitens;

      
      System.out.println("Digite a quantidade de Itens");
      quantidade = in.nextInt();

      System.out.println("Digite o valor dos Itens");
      valorItem = in.nextInt();

      semDesconto = quantidade * valorItem;
      valortotaldeitens = quantidade * valorItem;
      valorDesconto = (quantidade /3) * 0.05f;
      valorFinalCDesconto = valortotaldeitens - valorDesconto;


      
      System.out.println("Valor total dos itens com o desconto " + valorFinalCDesconto);
      System.out.println("Valor total dos itens sem o desconto " + semDesconto);

        
    }
}