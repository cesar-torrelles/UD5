import javax.swing.JOptionPane;
public class ejercicio4App {

	public static void main(String[] args) {

		//Hacemos un input grafico para recoger el radio del circulo que se desea calcular
		String radio =JOptionPane.showInputDialog("introduce el radio para calcular el area de un circulo");
		
		//convertimos el dato recogido en un valor numerico
		Double radioDouble =Double.parseDouble(radio);
		
		//declaramos la constante PI
		Double PI = Math.PI;
		
		//declaramos el exponente que usaremos en la operacion
		int exponente = 2;
		
		//realizamos la operacion del radio elevado al exponente y lo guardamos en una variable llamada radioalcuadrado
		Double radioalcuadrado = (Math.pow(radioDouble,exponente));
		
		//calculamos el area multiplicando PI por la variable radioalcuadrado
		Double area = PI*radioalcuadrado;
		
		//imprimimos el resultado en pantalla y en la consola
		System.out.println("el area del circulo es "+area);
		JOptionPane.showMessageDialog(null,"el area del circulo es "+area);
		
	}

}
