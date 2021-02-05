import javax.swing.JOptionPane;

public class ejercicio3App {

	public static void main(String[] args) {
		
		//usamos el mismo codigo del ejercicio anterior
		
		//pero esta vez creamos una ventana emergente para introducir el nombre
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		
		//y nuevamente lo imprimimos en pantalla
		JOptionPane.showMessageDialog(null,"Bienvenido "+nombre);
		
		//y lo imprimimos en consola
		System.out.println("nombre almacenado: "+nombre);
	}

}
