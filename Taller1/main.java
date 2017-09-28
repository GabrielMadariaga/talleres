import java.io.IOException;

import ucn.ArchivoEntrada;
import ucn.ArchivoSalida;
import ucn.In;
import ucn.Out;
import ucn.Registro;
import ucn.StdIn;
import ucn.StdOut;

public class main {
	
	public static void main(String[] args) {
        String matrixVuelos[][] = new String[30][5];
        int cont = leerArchivo(matrixVuelos);
        
    private static int generarArchivo(String[][] matrixVuelos) {
    	
    	
    }
	
	private static int leerArchivo(String[][] matrixVuelos) {
        int cont = 0;

        In archive = new In("VuelosRealizados.txt");

        while (!archive.isEmpty()) {

            String line = archive.readLine();
            String lista[] = line.split(",");
            matrizVuelos[cont][0] = lista[0];
            matrizVuelos[cont][1] = lista[1];
            matrizVuelos[cont][2] = lista[2];
            matrizVuelos[cont][3] = lista[3];
            matrizVuelos[cont][4] = lista[4];
            matrizVuelos[cont][5] = lista[5];

            cont++;

        }

        archive.close();

        return cont;
    }
	
	private static void OrdenarAlfabeticamente(String[][] matriz, int cont) {

        System.out.println(cont);
        String numeroVuelo, ciudadOrigen, ciudadDestino, diaVuelo, mesVuelo, cantPasajeros;
        for (int i = 0; i < cont - 1; i++) {
            for (int j = i + 1; j < cont; j++) {
                if (matriz[i][0].compareTo(matriz[j][0]) > 0) {
                    numeroVuelo = matriz[i][0];
                    ciudadOrigen = matriz[i][1];
                    ciudadDestino = matriz[i][2];
                    diaVuelo = matriz[i][3];
                    mesVuelo = matriz[i][4];
                    cantPasajeros = matriz[i][5];

                    matriz[i][0] = matriz[j][0];
                    matriz[i][1] = matriz[j][1];
                    matriz[i][2] = matriz[j][2];
                    matriz[i][3] = matriz[j][3];
                    matriz[i][4] = matriz[j][4];
                    matriz[i][5] = matriz[j][5];

                    matriz[j][0] = numeroVuelo;
                    matriz[j][1] = ciudadOrigen;
                    matriz[j][2] = ciudadDestino;
                    matriz[j][3] = diaVuelo;
                    matriz[j][4] = mesVuelo;
                    matriz[j][5] = cantPasajeros;
                }
            }
        }
    }

	
	private static int EliminarVuelo(String[][] matriz, int cont){
		
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

