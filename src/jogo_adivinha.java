import java.util.Scanner;
import java.util.Random;

public class jogo_adivinha {

	public static void main(String[] args) {
	    Random numGerador = new Random();
	    int numAleatorio = numGerador.nextInt(101); 
	    int numero;
		Scanner tc = new Scanner(System.in);
		for (int numTentativa = 10; numTentativa > 1 ; --numTentativa) {
			while (true) {
				System.out.println("Digite um numero de 0 a 100:");
				numero = tc.nextInt();
				if (numero < 0 || numero > 100) {
		    	  System.out.println("Numero invalido!");
			      } else {
					   break;
				   }
				}
		   if (numero == numAleatorio) {
			  System.out.println("Você Acetou");
			  break;
		   } else if (numero > numAleatorio) {
			   System.out.println("Numero digitado é superior");
			} else {
				System.out.println("Numero digitado é inferior");
			}
		   System.out.println("Você tem " + (numTentativa - 1) + " tentativas!" );
		}
		tc.close();
	}
}
