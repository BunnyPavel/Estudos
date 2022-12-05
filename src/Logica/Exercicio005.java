package Logica;
import java.util.Scanner;

public class Exercicio005 {


		public static void main(String [] args){

	        System.out.print("Escreva a temperatura em Celcius: ");
	        Scanner entrada = new Scanner(System.in);

	        double celcius = entrada.nextDouble();

	        double fahrenheit = (9 * celcius + 160) / 5;

	        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
	        
	        entrada.close();


	    }
	}

	/*converter temperatura de celcius para fahrenheit */