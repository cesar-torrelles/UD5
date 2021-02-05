
public class ejercicio9App {

	public static void main(String[] args) {

		//declaramos la variable inicial para el loop while
		int A = 1;
		
		//realizamos el loop while
		while(A<=100){
			
			//declaramos dos variables que comprueben que el valor de "A" es divisible entre 2 y 3
			int divisor1 = A%2;
			int divisor2 = A%3;
			
			//añadimos un condicional if, que nos permita imprimir el valor de "A" solo si este es divisible por 2 y 3 
	
				if (divisor1 == 0 && divisor2 == 0) 
			{
				System.out.println(A);
				}
			//aumentamos el valor de "A" en 1 y volvemos a comenzar el loop hasta que se cumpla la condicion
			A++;
			
			}
	}			
}
			
		
		



