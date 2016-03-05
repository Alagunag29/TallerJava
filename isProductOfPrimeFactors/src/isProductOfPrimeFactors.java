package isProductOfPrimeFactors;

import java.util.ArrayList;
import java.util.Scanner;

public class isProductOfPrimeFactors {

	public static void main(String[] args) {
		
	   int limite, cantidad;
	   double porcentaje;
	   // lista para guardar los numeros;
	   ArrayList lista = new ArrayList(); 
	   Scanner entradaTeclado = new Scanner (System.in); 	
       
	   System.out.print("Ingrese limite: ");
       limite = entradaTeclado.nextInt();
       
       // guarda el numero 1 en la lista de primero
       lista.add(1);
       
       for(int i = 2; i<=limite; i++){
    	   //pasa a la funcion primo cada numero < que el limite 
    	   primos(i, lista);
       }
       
	   cantidad = lista.size();
       porcentaje =(cantidad*100)/limite; 
	   System.out.println(lista);
	   System.out.print(cantidad + " numeros " + porcentaje + "%");
       
	}
	
    public static void primos(int k, ArrayList<Integer> lista){
    	int num=0, mul=1, prod=1, contadorNum=0;
    	for(int j=2; j<k; j++){
    		for(int r=1 ; r<=j; r++ ){
    			if(j % r == 0 ){
    				num++;
    			}
    		}
    		if(num == 2){
    			//Si es primo la mando a la funcion operar que haga las divición
    			prod *= operacion(k,j);
    		}
    		if(prod >= k){
    			break; //Para terminar ciclo cuando
     		}
    		num = 0;
    	}
    	if(prod == k){
			lista.add(k);   		
    	}
        prod = 1;
        
    }
    
    public static int operacion(int k, int i ){
    	int mul=1;
    	if(k % i == 0 && k > 1){
    		k/=i;
    		mul*=i;  
    	}
		return mul;
   
    }
    
}
