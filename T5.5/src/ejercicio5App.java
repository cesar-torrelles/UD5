import javax.swing.JOptionPane;
public class ejercicio5App {

	public static void main(String[] args) {

		//solicitamos ingresar el numero en el teclado
		String numero =JOptionPane.showInputDialog("introduce un numero entero");
		
		//lo convertimos en un valor numerico
		int numeroint =Integer.parseInt(numero);
		
		//realizamos el calculo para ver si es divisible entre 2 y guardamos el valor en la variable "division"
		int division = numeroint%2;{
			
		//imprimimos el resto de la division en consola	para comprobar que funciona
		System.out.println("la division da: "+division);
		}
		//empleamos un "if" que indique si el resto da 0, si es correcto imprime en pantalla y consola que lo es
		if (division==0) {
			System.out.println("el numero si es divisible entre 2");
			JOptionPane.showMessageDialog(null,"el numero si es divisible entre 2");
			
		//si no es correcto imprime en pantalla y consola que no lo es
		}else {
			System.out.println("el numero no es divisible entre 2");
			JOptionPane.showMessageDialog(null,"el numero no es divisible entre 2");
		}
	}
		
}