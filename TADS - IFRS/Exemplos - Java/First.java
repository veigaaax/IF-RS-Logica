import javax.swing.*;
public class First {
     
     public static void main(String args []){
        //a é variavel do tipo caracteres
         String a="";
       // num, antecessor, sucessor é do tipo inteiro 
         int num=0;
         int antecessor=0;
         int sucessor=0;
       //saida é do tipo caracteres
         String saida="";
         // ele abriu uma caixa de dialogo para vc inserir o numero
         a = JOptionPane.showInputDialog("Entre com o número");
        // num recebe a, mas para não acontecer problemas ele converteu  
       //para inteiro
         num = Integer.parseInt(a);
         // o antecessor pegou o valor de num e diminuiu para -1
         antecessor = num -1;
         // o sucessor pegou o valor de num e somou para +1
         sucessor = num +1;
         
         saida += " O antecessor de " + num + " é " + antecessor;
         saida += "\n O sucessor de " + num + " é " + sucessor;
         // pediu para que uma caixa de dialogo desse o resultado
         JOptionPane.showMessageDialog(null,saida);
         
         
     }
     
 }