package co.edu.tdea.pruebas;

import java.util.Scanner;

public class Prueba15Agosto {

	public static void main(String[] args) {
		//Desarrolle un programa en java usando switch que dado un n�mero muestre el d�a de la semana
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor digite un n�mero del 1 al 7:");
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
				dia = "S�bado";
				break;
			case 7:
				dia = "Domingo";
				break;
		}
			
			System.out.println("El d�a segun su n�mero es: " + dia);
			
		}else {
			System.out.println("N�mero no v�lido");
		}
		
	}

}
