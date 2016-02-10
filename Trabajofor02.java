import java.util.Scanner;

public class Trabajofor02
{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.println("Hasta que numero quiere contar: ");
		int var2 = teclado.nextInt();

		for (int var1 = 0; var1 <= var2; var1++){
			
			System.out.print(var1 + ", ");
		}
		
		
		
	}
}