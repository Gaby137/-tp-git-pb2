import java.util.Scanner;

public class Ahorcado {
	
	public static void main(String[] args){  
		Integer a;     
		Integer b;     
		Integer opcion;        
		Integer resultado;
		do{
			System.out.println("Ingrese su operación /n 1 para multiplicar /n 2 para "
					+ "restar /n 3 para sumar  /n 4 para dividir");
			 opcion = teclado.next();
		}while(opcion < 1 && opcion > 4)
			System.out.println("Ingrese el primer numero");
		a = teclado.next();
		System.out.println("Ingrese el segundo numero");
		a = teclado.next();
		switch (opcion) {
		case opcion.equals(1):
			resultado = a * b;
			break;
		case opcion.equals(2):
			resultado = a - b;

			System.out.println("es la resta");

			System.out.println("El cambio real merge ");

			break;
		case opcion.equals(3):
			resultado = a + b; 
			break;
		default:
			resultado = a / b;
			break;
		}
		
		System.out.println("El resultado es " + resultado.toString());
	}
}
			  
			  
			  
			  
			  
			  