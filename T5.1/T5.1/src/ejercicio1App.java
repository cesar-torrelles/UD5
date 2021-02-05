
public class ejercicio1App {

	public static void main(String[] args) {
		
		//declaramos los numeros que queremos comparar
		int num1  = 5;
		int num2  = 4;
		
		//añadimos un condicional if elseif y comparamos los valores
		if(num1>num2) {
			
			//si es mayor imprimimos un string indicandolo
			System.out.println("num1 es mayor que num2");
		}
			//si es menor imprimimos un string indicandolo
		else if(num1<num2) {
			System.out.println("num2 es mayor que num1");
		}
			//si es igual imprimimos otro string indicandolo
		else if(num1==num2) {
			System.out.println("num1 es igual que num2");
		}
	}

}
