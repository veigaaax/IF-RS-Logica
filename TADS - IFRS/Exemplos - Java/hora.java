// faça um programa que receba um tempo em segundos e converta para o formato HH:mm:SS 

import java.util.Scanner;
public class hora{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int segundos,minutos,horas,resto;
        
        System.out.println("Informe os segundos");
        segundos = in.nextInt();
        
        resto = segundos % 3600;
        segundos = resto % 60; // segundos é o resto que sobra do valor digitado pelo usario 65seg = 1min e "5seg" e o que sobra 
        minutos = segundos / 60;
        horas = segundos / 3600; 
        System.out.println("O tempo em e " + horas + " horas " + minutos  + "minutos" + segundos + "segundos");



        in.close();
        
    }
}