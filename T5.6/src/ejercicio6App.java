import javax.swing.JOptionPane;
public class ejercicio6App {

	public static void main(String[] args) {
		
		//solicitamos el numero en pantalla
		String precio =JOptionPane.showInputDialog("introduzca el precio del producto");
		
		//lo convertimos en un valor numerico
		double preciodouble =Double.parseDouble(precio);
		
		//declaramos el IVA
		double IVA = 0.21;
		
		//realizamos el calculo del precio con IVA y lo guardamos en una variable "precioconIVA"
		double precioconIVA = preciodouble+(preciodouble*IVA);{
		
			//imprimimos la variable con el resultado por consola y pantalla
			System.out.println("el PVP del producto es: "+precioconIVA);
			JOptionPane.showMessageDialog(null,"el PVP del producto es: "+precioconIVA);
		
		}
	}
		
}