package IMC;
//O IMC e a divisao entre o peso da pessoa e sua altura (metros) ao quadrado
// faca um programa para ajudar a calcular o imc dado a altura e peso de uma pessoa

//float peso;
//peso - in.nextFloat()
import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
    
    Scanner in = new Scanner (System.in);
    float peso;
    float altura;
    float IMC;

    System.out.println("Digite seu peso e altura");
    peso = in.nextFloat();
    altura = in.nextFloat();
       

    IMC = (peso) / (altura * altura);
    System.out.println("O resultado do IMC:" + IMC);
    
    }
}
