/*

 FAÇA UM PROGRAMA QUE LEIA O APELIDODE UMA PESSOA E MOSTRE ELE DUAS VEZES NA TELA
 
 */

   // IMPORTS FICAM ACIMA DA DECLARAÇÃO DA CLASSE

   import java.util.Scanner;

     //NOME DA CLASSE IGUAL DO ARQUIVO
      public class ExemploLeitura {

       private static String nome;

        //MAIN (PONTO PRINCIPAL,INICIO DA EXECUÇÃO)
        @SuppressWarnings("resource")
        public static void main(String[]args){

        // DECLARAÇÃO 
        Scanner in;

        // INICIALIZAÇÃO
        in = new Scanner(System.in); //TERMINAL /ENTRADA DO USUARIO
      

       // tipo / nome
       String apelido;
       
       //COMANDOS 
       System.out.println("DIGITE SEU APELIDO");
       apelido = in.next(); // a variavel apelido recebe a palavra escrita

       System.out.println("DIGITE SEU NOME");
       nome = in.next();

       System.out.println("DUAS VEZES");
       System.out.println("\t"+ apelido); // o + está concatenando (juntando) as strings
       System.out.println("\t" + nome);

       System.out.println("Bem-vindo ao meu codigo," + apelido);
    }
 }