import java.util.Scanner;
public class Ex10 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int qtSocios, qtPagantes, qtCriancas;
        int qtPessoas, valorIngressoIntegral, ingressoFree;
        double desconto, valorIngressoDesconto, ingressoSocioValorFinal, lucroPag, lucroSocio;
        double rendaTotalDoEvento, valorNaoArrecadado;

        desconto = 0.3d;

        ingressoFree = 0;
        valorIngressoIntegral = 0;

        System.out.println("Seja Bem-Vindo!");

        System.out.println("Digite o valor dos ingressos");
        valorIngressoIntegral = in.nextInt();

        System.out.println("Digite o numero de pessoas que sao Socias"); // 30% de desconto
        qtSocios = in.nextInt();

        System.out.println("Digite o numero de pessoas que sao Menores de 10 anos"); //não pagam
        qtCriancas = in.nextInt();

        System.out.println("Digite o numero de pessoas que sao pagantes sem desconto ");//valor normal do ingresso
        qtPagantes = in.nextInt();
        
        qtPessoas = qtCriancas + qtPagantes + qtSocios; //quantas pessoas estao presentes no evento ESTA CORRETO 
        valorIngressoDesconto = (valorIngressoIntegral * desconto); // somente o valor de desconto ESTA CORRETO
        ingressoSocioValorFinal = (valorIngressoIntegral - valorIngressoDesconto); // valor final com o desconto CORRETO
        lucroSocio = ingressoSocioValorFinal * qtSocios; // a quantidade arrecadada pelos ingressos de socios
        lucroPag = valorIngressoIntegral * qtPagantes; // a quantidade arrecadada pelos ingressos integrais
        rendaTotalDoEvento = lucroSocio + lucroPag + ingressoFree;  //lucro total
        valorNaoArrecadado = (qtCriancas * valorIngressoIntegral) + (valorIngressoDesconto * qtSocios);
 
        
        System.out.println("O numero de pessoas no evento sao " + qtPessoas );
        System.out.println("Renda total do evento: R$" + rendaTotalDoEvento );
        System.out.println("Valor total nao arrecadado no evento: R$" + valorNaoArrecadado );



      // Valor de cada ingresso
//- Número de pessoas (público do evento) que são sócias do clube
//- Número de pessoas (público do evento) não pagantes (menores de 10anos)
// Número de pessoas (público do evento) pagantes (sem desconto algum)

//att
    }
}
