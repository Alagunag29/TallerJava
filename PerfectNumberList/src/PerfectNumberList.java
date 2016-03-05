import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumberList {

	public static void main(String[] args) {
		private int sumPerf = 0, limite;

		private ArrayList<Integer> listaPerf = new ArrayList();
		private ArrayList<Integer> listaDife = new ArrayList();
		private Scanner entradaTeclado = new Scanner (System.in);

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
		private int sumatoria = 0;
		private double promedio=0;
		System.out.println(lista);
		sumatoria = lista.size();
		promedio = ((sumatoria*100)/limite);
		System.out.println(sumatoria + " numeros, " + promedio + "%" );
	}


}
