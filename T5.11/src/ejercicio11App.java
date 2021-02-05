import javax.swing.JOptionPane;

public class ejercicio11App {

	public static void main(String[] args) {

		//solicitamos en pantallla ingresar el nombre de un dia
		String dia=JOptionPane.showInputDialog("Introduce un dia de la semana");

		
		//empleamos un switch para que nos imprima si es laborable o no, dependiendo del dia que hemos ingresado
		switch(dia) {
		
		case "lunes": JOptionPane.showMessageDialog(null,"ese dia es laboral");
		break;
		case "martes": JOptionPane.showMessageDialog(null,"ese dia es laboral");
		break;
		case "miercoles": JOptionPane.showMessageDialog(null,"ese dia es laboral");
		break;
		case "jueves": JOptionPane.showMessageDialog(null,"ese dia es laboral");
		break;
		case "viernes": JOptionPane.showMessageDialog(null,"ese dia es laboral");
		break;
		case "sabado": JOptionPane.showMessageDialog(null,"ese dia es laboral");
		break;
		case "domingo": JOptionPane.showMessageDialog(null,"ese dia no es laboral, no se trabaja");
		break;
		//en caso de que no se ingrese el String esperado se imprime en pantalla el siguiente texto:
		default: JOptionPane.showMessageDialog(null, "Respuesta incorrecta, has de escribir un dia de la semana, en minusculas");
		
		
		}
	}

}
