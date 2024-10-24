package co.edu.tdea.evaluacion;

public class PruebaUno {

	public static void main(String[] args) {
		
		        int suma = 0;
		        int limiteInferior = 1;
		        int limiteSuperior = 100;

		        for (int i = limiteInferior; i <= limiteSuperior; i++) {
		            if (i % 7 == 0) {
		                suma += i;
		            }
		        }
		        System.out.println("La suma de los múltiplos de 7 entre 1 y 100 es: " + suma);
	}
}
