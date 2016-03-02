import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumberList {

	public static void main(String[] args) {
		int sumPerf = 0, limite;
		
		ArrayList<Integer> listaPerf = new ArrayList();
		ArrayList<Integer> listaDife = new ArrayList();
		Scanner entradaTeclado = new Scanner (System.in);
		
		System.out.print("INGRESE LIMITE: ");
		limite = entradaTeclado.nextInt(); 
		
		for(int i=1;i<=limite; i++){
			for(int j=1;j<i;j++){
				if(i % j == 0){
					sumPerf += j;
				}
			}
			if(sumPerf == i){
				listaPerf.add(i);
			}else if(sumPerf > i){
				listaDife.add(i);
			}
			sumPerf = 0;
		}
	
        operacion(limite, listaPerf);
		operacion(limite, listaDife);
	}
	
	public static void operacion(int limite, ArrayList<Integer> lista){
		int sumatoria = 0;
		double promedio=0;
		System.out.println((100*3)/1000);
		System.out.println(lista);
		sumatoria = lista.size();
		promedio = ((sumatoria*100)/limite); 
		
		//System.out.println(sumatoria + " numeros, " + promedio + "%" );
	}
	
	
}