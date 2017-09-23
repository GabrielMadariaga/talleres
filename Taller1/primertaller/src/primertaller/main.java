package primertaller;


import ucn.*;
import java.io.IOException;


public class main {

	public static void main(String[] args) throws IOException {
		ArchivoEntrada arch1 = new ArchivoEntrada("VuelosRealizados.txt");
		ArchivoSalida arch2 = new ArchivoSalida("Ciudades.txt");
		
		while(!arch1.isEndFile()){
			
			
		}
		arch1.close();
	}

}
