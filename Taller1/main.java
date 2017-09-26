import java.io.IOException;

import ucn.ArchivoEntrada;
import ucn.ArchivoSalida;
import ucn.Registro;
import ucn.StdIn;
import ucn.StdOut;

public class main {
	
	private static int Eliminar(String[][] matrix, int cont){
		
		while(true){
			int i = 0;
			
			while(i<cont && !matriz[i][5].equals(1)){
				i++;
			}
			if(i!=cont){
				for(int j = i; j < cont-1; j++){
					matriz[j][0] = matriz[j + 1][0];
					matriz[j][1] = matriz[j + 1][1];
					matriz[j][2] = matriz[j + 1][2];
					matriz[j][3] = matriz[j + 1][3];
					matriz[j][4] = matriz[j + 1][4];
					matriz[j][5] = matriz[j + 1][5];
				}
				cont--;
			}else{
				break;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		
		ArchivoEntrada arch1 = new ArchivoEntrada("VuelosRealizados.txt");
		ArchivoSalida arch2 = new ArchivoSalida("Resultado.txt");
		
		int contador = 0;
		
		while(!arch1.isEndFile()){
			
			Registro regEnt = arch1.getRegistro();
			
			int numeroVuelo = regEnt.getInt();
			String ciudadOrigen = regEnt.getString();
			String ciudadDestino = regEnt.getString();
			int diaVuelo = regEnt.getInt();
			String mesVuelo = regEnt.getString();
			int cantPasajeros = regEnt.getInt();
			
			Registro registroSalida = new Registro(3);
			
			registroSalida.agregarCampo(nombreCiudad);
			registroSalida.agregarCampo(cantPasajerosLlegados);
			registroSalida.agregarCampo(cantPasajerosSalidos);
			
			arch2.writeRegistro(registroSalida);
			
			arch1.close();
			arch2.close();
			
		}
		
		

	}

}
