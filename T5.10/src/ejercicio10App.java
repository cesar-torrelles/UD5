import javax.swing.JOptionPane;

public class ejercicio10App {

	public static void main(String[] args) {

		//solicitamos introducir el numero de articulos o ventas en una variable
		String numeroVentas = JOptionPane.showInputDialog(null,"Bienvenido, introduce la cantidad de articulos que deseas comprar ");
		
		//convertimos la cantidad de la variable a tipo numerico
		int numeroVentasInt = Integer.parseInt(numeroVentas);
		
		//declaramos la suma de articulos que se iran haciendo
		double acumulado = 0;
		
		//añadimos un loop for que nos permita solicitar el valor de los articulos que hemos declarado antes
		for (int i= 0; i<numeroVentasInt; i++) {
		
		//solicitamos el valor de cada articulo	con un contador para que nos indique el articulo nuevo	
		 String venta = JOptionPane.showInputDialog(null,"introduce el valor del articulo " +(i+1));
		 
		//convertimos el valor introducido en valor numerico
		 double cantidad = Double.parseDouble(venta);
		
		 //vamos realizando la suma del valor de todos los articulos
		acumulado = acumulado + cantidad;

		}
		//al acabar el loop imprimimos en pantalla la suma total del valor de todos los articulos ingresados
		JOptionPane.showMessageDialog(null,"el monto total es de " +acumulado+" euros");
	}
}
