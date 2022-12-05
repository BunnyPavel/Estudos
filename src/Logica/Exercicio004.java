package Logica;
import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {
		 

		        Scanner input = new Scanner(System.in);
		        
		        System.out.print("Digite um numero: ");
		        double numero1 = input.nextDouble();

		        System.out.print("Digite outro numero: ");
		        double numero2 = input.nextDouble();

		        if(numero1 > numero2){
		            System.out.println("O primeiro numero digitado é maior!!\n este numero é: " + numero1);

		        }else if(numero2 > numero1){
		            System.out.println("O segundo numero digitado é maior!!\n este numero é: " + numero2);
		        }else {
		            System.out.println("Os numeros são iguais!!\no primeiro numero é: " + numero1 + "\nsegundo numero é: " + numero2);
		        }

		        input.close();

		    }

		}

		    /*Escreva um programa que leia dois números e exiba mensagem informando o
		valor do maior número e o valor do menor número. Se os dois números forem
		iguais, o programa deve exibir mensagem informando este fato */