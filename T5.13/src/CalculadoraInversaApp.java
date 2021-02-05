import javax.swing.JOptionPane;

public class CalculadoraInversaApp {

	public static void main(String[] args) {
		
		//solicitamos introducir el valor del operando 1
		String operando1 = JOptionPane.showInputDialog("Introduce el operando 1");
		//convertimos a valor  numerico el operando 1
		int operando1Int = Integer.parseInt(operando1);
		
		//solicitamos introducir el valor del signo aritmetico
		String signoaritmetico = JOptionPane.showInputDialog("Introduce el signo aritmetico");
		
		//solicitamos introducir el valor del operando 2
		String operando2 = JOptionPane.showInputDialog("Introduce el operando 2");
		//convertimos a valor numerico el operando 2
		int operando2Int = Integer.parseInt(operando2);

		//utilizamos un switch para que actue en funcion del signo aritmetico seleccionado
		//el resultado lo imprime en pantalla
		switch(signoaritmetico) {
		
		case "+": System.out.println(operando1Int + operando2Int);
				JOptionPane.showMessageDialog(null, "el resultado es " + (operando1Int + operando2Int));
		break;
		
		case "-": System.out.println(operando1Int - operando2Int);
				JOptionPane.showMessageDialog(null, "el resultado es " + (operando1Int - operando2Int));
		break;
		
		case "*": System.out.println(operando1Int * operando2Int);
				JOptionPane.showMessageDialog(null, "el resultado es " + (operando1Int * operando2Int));
		break; 
		
		case "/": System.out.println(operando1Int / operando2Int);
				JOptionPane.showMessageDialog(null, "el resultado es " + (operando1Int / operando2Int));
		break;
		
		case "^": System.out.println(Math.pow(operando1Int,operando2Int));
				JOptionPane.showMessageDialog(null, "el resultado es " + Math.pow(operando1Int,operando2Int));
		break;
		
		case "%": System.out.println(operando1Int % operando2Int);
		JOptionPane.showMessageDialog(null, "el resto es " +operando1Int % operando2Int);
		break;
		
		}

	}

}
