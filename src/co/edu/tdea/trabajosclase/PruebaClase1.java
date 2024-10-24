package co.edu.tdea.pruebas;

import java.util.Scanner;

public class Prueba15Agosto {

	public static void main(String[] args) {
		//Desarrolle un programa en java usando switch que dado un número muestre el día de la semana
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor digite un número del 1 al 7:");
		int numeroDia = sc.nextInt();
		String dia = "";
		
		if (numeroDia >=1 && numeroDia <=7) {
			
			switch (numeroDia) {
			
			case 1:
				dia = "Lunes";
				break;
			case 2:
				dia  = "Martes";
				break;
			case 3:
				dia = "Miercoles";
				break;
			case 4:
				dia = "Jueves";
				break;
			case 5:
				dia = "Viernes";
				break;
			case 6:
				dia = "Sábado";
				break;
			case 7:
				dia = "Domingo";
				break;
		}
			
			System.out.println("El día segun su número es: " + dia);
			
		}else {
			System.out.println("Número no válido");
		}
		
	}

}
