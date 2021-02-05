import javax.swing.JOptionPane;

public class ejercicio12App {



	
	public static void main(String[] args) {
		
		//declaramos la contraseña y la asignamos a una variable
		String contra1 ="grizzlygold";
		
		//solicitamos en pantalla que se ingrese esa contraseña 
		String contra2= JOptionPane.showInputDialog("Introduce tu contraseña");
		
		// declaramos el contador de intentos "i"
		int i=0;
	
		//creamos un condicional if que nos indique si es correcta la contraseña introducida
		if(contra1.equals(contra2)) {
			
				//si es correcta nos imprimira en pantalla y consola que lo es y finalizara el programa
				System.out.println("Contraseña correcta");
				JOptionPane.showMessageDialog(null, "Contraseña correcta");
			
			//en caso contrario nos introduciremos en un loop while 
			}else {
				//las vueltas se incrementaran en 1 por cada intento fallido
				i++;
				
					
					while(i<3) {
					
					//si los intentos son inferiores a tres nos seguira diciendo en pantalla que la contraseña es incorrecta
					// y que la volvamos a ingresar
					contra2= JOptionPane.showInputDialog("contraseña incorrecta, repite la contraseña");
					
					//se comprueba si la contraseña es correcta
					if(contra1.equals(contra2)) {
						
						//si lo es, se imprime en pantalla que si
						JOptionPane.showMessageDialog(null, "Contraseña correcta");
						//y se interrumpe el loop
						break;
						
					//en caso contrario sigue sumando intentos
					} else {
						i++;
					}
								
					
					}
			//si finaliza el loop y no se ha conseguido la contraseña se indica que no hay mas intentos
			if(i==3){
					JOptionPane.showMessageDialog(null, "no hay mas intentos");
					}
				
		
				
		
				
		}
		
	}
}



	
		 
			
			
			
		
		
		
	


