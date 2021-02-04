import javax.swing.JOptionPane;

public class ejercicio2App {

	public static void main(String[] args) {
		
		//declaramos un string con un nombre
		String nombre= "Cesar";
		
		//mostramos un mensaje de bienvenida mediante una ventana emergente
		JOptionPane.showMessageDialog(null,"Bienvenido "+nombre);
		
		//mostramos un mensaje de bienvenida mediante consola
		System.out.println("nombre almacenado: "+nombre);
	}

}
