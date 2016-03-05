import java.util.ArrayList;
import java.util.Scanner;

public class GradeStatistics {

	public static int[] notas;
	
	public static void main(String[] args) {
		private ArrayList<Integer> listaNotas = new ArrayList<>();
		
		readGrades(listaNotas); 
		System.out.println("The average is " + average(listaNotas)); 
		System.out.println("The minimum is " + min(listaNotas)); 
		System.out.println("The maximum is " + max(listaNotas)); 
		System.out.println("The standard deviation is " + stdDev(listaNotas));
	}
	
	public static void readGrades(ArrayList<Integer> listaNotas) {
		private Scanner teclado = new Scanner(System.in);
		private int numAlumnos=0, temp=1, notas=0;
				
		System.out.print("numero de alumnos: ");
		numAlumnos=teclado.nextInt();
		
		while(temp<=numAlumnos){
			System.out.print("digite la nota del alumno "+temp+": ");
			notas=teclado.nextInt();
			if( notas >= 0 && notas <=100 ){
				listaNotas.add(notas);
				temp++;
			}else{
				System.out.println("valor no invalido...");
			}
		}
	}
	public static double average(ArrayList<Integer> listaNotas) {
		private double promedio=0;
		private int sumatoria=0, temp=0;
		
		for (int i = 0; i < listaNotas.size(); i++) {
			sumatoria += (int) listaNotas.get(i);
			temp++;
		}
		
		promedio=(float) sumatoria/temp;
		return promedio;
	} 
	public static int max(ArrayList<Integer> listaNotas){
		private int maximo=0, temp=0;
		
		for (int i = 0; i < listaNotas.size(); i++) {
			temp = (int) listaNotas.get(i);
			if(temp>maximo){
				maximo=temp;
			}
		}
		return maximo;
	}
	public static int min(ArrayList<Integer>listaNotas) {
		private int minimo=100, temp=0;
		
		for (int i = 0; i < listaNotas.size(); i++) {
			temp = (int) listaNotas.get(i);
			if(temp<minimo){
				minimo=temp;
			}
		}
		return minimo;
	}
	public static double stdDev(ArrayList<Integer>listaNotas) {
		private float resultado=0, media=0;
		private int temp=0, suma=0, sumatoria=0, cont=0, uno=-1, dos=2;
		for (int i = 0; i < listaNotas.size(); i++) {
			temp = (int) listaNotas.get(i);
			suma+=temp*temp;
			sumatoria+=temp;
			cont++;
		}
		
		resultado=(float) (1*Math.pow(cont, uno));
		resultado*=suma;
		media=(float) sumatoria/cont;
		resultado=(float) (resultado-Math.pow(media, dos));
		resultado=(float) Math.sqrt(resultado);
		return resultado;
	}

}
