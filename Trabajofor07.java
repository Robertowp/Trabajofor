import java.util.Scanner;

public class Trabajofor07
{

	public static void main (String[] args){
		Scanner teclado = new Scanner (System.in);

				
				System.out.print("Ingrese un Numero: ");
				int num = teclado.nextInt ();
				
				int fact = 1;
			 	for (int n = num; n>1; n--){
					 		fact = fact * n;
					 
					 	}
					 	System.out.println ("El factorial de " + num + " es: " + fact);
					 }
					
				}	


		