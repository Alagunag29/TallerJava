import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradesAverage {

	public static void main(String[] args) {
		int i=1, numeroEstudiantes, notas, sumatoria=0;
		
		
		ArrayList listaNotas = new ArrayList();
		Scanner entradaTeclado = new Scanner (System.in);
		
		System.out.print("Digite numero de estudiantes: ");
		numeroEstudiantes = entradaTeclado.nextInt();
		while(i <= numeroEstudiantes){
			
			System.out.print("Ingrese nota del estudiante numero " + i + ": ");
			notas = entradaTeclado.nextInt();
			if( notas >= 0 && notas <=100 ){
				listaNotas.add(notas);
				i++;
			}else{
				System.out.println("Nota invalida Digite de nuevo");
			}
		}
		for (int j = 0; j < listaNotas.size(); j++) {
			sumatoria += (int) listaNotas.get(j);
		}
		
		System.out.println("el promedio es: " + sumatoria/numeroEstudiantes);	
		
	}

}
