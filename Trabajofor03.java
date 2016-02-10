import java.util.Scanner;

public class Trabajofor03
{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);


		double suma;
		int valor;
		double prom;

	
		suma = 0;
		System.out.println("SE LE PEDIRA QUE INGRESE 10 VALORES ENTEROS.");
		for (int conta = 0; conta < 10; conta++){
			System.out.print("Ingrese un valor: ");
			valor = teclado.nextInt();
			suma = suma + valor;
			
		}
		
		prom = suma / 10;
		System.out.println("La suma de los numeros ingresados es: " + suma);
		System.out.println("El promedio de los numeros ingresados es: " + prom);
		
	}
}