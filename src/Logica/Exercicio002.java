package Logica;
import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {

		        Scanner input = new Scanner(System.in);
		        
		        double Notas = 0; 
		        double media = 0;
		        double recuperacao = 0;

		        for(int i = 0; i < 4 ; i++){ 

		            System.out.println("Digite as notas do aluno: "); 

		            Notas += input.nextDouble();
		        }
		        
		        media = Notas / 4;

		        if(media >=7){

		            System.out.println("Aluno Aprovado Com media: " + media);
		        
		        }else if(media < 7){

		            System.out.println("Digite a nota da recuperação: ");
		            recuperacao = input.nextDouble();

		            media = (media + recuperacao) / 2;

		            if(media >=7) {
		                System.out.println("Aluno Aprovado Com media: " + media);
		                
		            }
		             else{
		                System.out.println("Aluno Reprovado.");

		            }        
		        }
		        input.close();
		    }
		}
		/*Exercicio de aluno aprovado ou não */
		
