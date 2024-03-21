import java.util.Scanner;

public class conversaohoras {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int segundos,hh, ss, min, rest;
        
        System.out.println("Digite o tempo em Segundos");
        segundos = in.nextInt();

        hh = segundos / 3600; //dividimos o segundos por 3600 para chegar na quantidade horas 
        rest = segundos % 3600; // o resto que sobrou das horas, ou seja, os segundos que sobraram das horas

        min = rest /60; // os segundos que sobraram das horas dividos por 60seg que fecha 1 min, para saber quanto minutos deu
        ss = rest % 60;  // e depois o resto dos segundos que fecham basicamente os proprios segundos

        System.out.println ("Horas " + hh);
        System.out.println ("Minutos " + min);
        System.out.println ("Segundos " +ss);
        
        System.out.printf("\n\t %02d : %02d : %02d\n\n", hh, min, ss );


    
    }
    
}

