import java.util.Scanner;
public class Challenge {
	public static void main(String []args) {
		
		Scanner in = new Scanner(System.in);
        
		int minutos,segundos,segundostotais;

		System.out.println("Digite a quantidade de segundos");
		segundostotais = in.nextInt();
		minutos = segundostotais / 60;
	   	segundos = segundostotais % 60;
	    System.out.println("O total de minutos " + minutos + " o total de segundos " + segundos);
		
  }
}
