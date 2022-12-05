package Logica;
import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {
		  double total = 0;

	        Scanner input = new Scanner(System.in);
	        System.out.print("Digite quantos valores serão calculados: ");
	        int quantidade = input.nextInt();
	        

	        for(int x = 0; x <= quantidade; x++){

	            System.out.print("Digite o valor a acrescentar: ");
	            double valor = input.nextDouble();
	            total += valor;
	        }
	        System.out.println("A media dos valores é: " + total/quantidade);

	        input.close();



	    }
	}

	/*programa que recebe e tira media */

