package co.edu.tdea.evaluacion;

import java.util.Scanner;

public class PruebaTres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor digite el número de estudiantes:");
		int estudiantes = sc.nextInt();
		
		
		System.out.println("Por favor digite las 4 notas del estudiante");
		for (int i = 1; i <= estudiantes; i++) {
			for (int j; i <=4; i++) {
				System.out.println("Digite la primera nota");
				double nota1 = sc.nextDouble();
				System.out.println("Digite la segunda nota");
				double nota2 = sc.nextDouble();
				System.out.println("Digite la tercera nota");
				double nota3 = sc.nextDouble();
				System.out.println("Digite la cuarta nota");
				double nota4 = sc.nextDouble();
				System.out.println("");
				double promedio = (nota1 + nota2 + nota3 + nota4) / 4;
				System.out.println("Promedio de estudiante: " + promedio);
				System.out.println("");
			}
		}
		
		sc.close();
		
	}

}
