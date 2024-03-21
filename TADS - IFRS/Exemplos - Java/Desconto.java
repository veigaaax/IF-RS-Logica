package Desconto;
import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        
     Scanner in = new Scanner(System.in);
     float valorProduto, valorDesconto, porcentagemDesconto, valorFinalProduto;

     System.out.println("Digite o valor do produto(R$)");
     valorProduto = in.nextFloat();

     System.out.println("Digite o valor do desconto(%)");
     porcentagemDesconto = in.nextFloat();

     valorDesconto = (valorProduto * porcentagemDesconto) /100;
     valorFinalProduto = (valorProduto - valorDesconto);

     System.out.println("O valor do desconto e:" + valorDesconto);
     System.out.println("O valor final do produto e:" + valorFinalProduto);





    
    
    }
}
