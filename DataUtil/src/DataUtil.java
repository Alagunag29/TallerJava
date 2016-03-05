import java.util.Scanner;

public class DataUtil {

	public static void main(String[] args) {
		
		String fecha, dd, mm, aa, ax;
		int dia, mes, ann, aux, veriFecha;
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("INGRESE FECHA EN FORMATO : DD/MM/AAAA");
		System.out.print("ejemplo 02/03/2016: "); 
		fecha = entradaTeclado.next();
		  
	    if( dateCheck(fecha) == true){
	    	dd  = fecha.substring(0, 2);
			mm  = fecha.substring(3, 5);
			aa  = fecha.substring(6, 10);
			ax  = fecha.substring(8,10);
			
			dia  = Integer.parseInt(dd);
			mes  = Integer.parseInt(mm);
			ann  = Integer.parseInt(aa);
			aux  = Integer.parseInt(ax);
			
			veriFecha = fexistingDate(dia, mes, ann);
			
			if(veriFecha == 1){
				 printDate(dia, mes, ann, aux);
			}
			else{
				System.out.println("Fecha incorrecta no se encuentra en el calendario ");
			}
			
	    }else{
	    	System.out.println("Ingreso la fecha mal ");
	    }
		
	}	
		


	
	
	//vericacion de la fecha sea expresada como se pide
	public static boolean dateCheck(String valor){
		int SW=1;
		if(valor.length() == 10){
		 
			for(int i=0;i<valor.length();i++){
			 
				if(i == 2 || i == 5){
				 
					if( valor.charAt(i) == '/'){
						SW = 0; 
					}else{
						SW = 1;
					}
					i++; // incremento la i para que en la pregunta siguiente pase a la otra posicion
				}
			 
				if(valor.charAt(i)>= '0' && valor.charAt(i) <= '9'){
					SW=0;
				}else{
					SW=1;
					break;
				}
			}	 		
		}
		
		if(SW==0){
			return true;
		}else{
			return false;
		}
	 }
	
	
	// Verificacion si la fecha si existe el calendario
	public static int fexistingDate(int dia, int mes, int add ){
		int sw=0;
		int numDiaMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
	    if( add % 4 == 0 && add >= 1582 && dia == numDiaMes[mes-1] + 1 && mes > 0 && mes <= 12 ){
	    	sw = 1;
	    }else if(add > 0  && dia <= numDiaMes[mes-1] && mes > 0 && mes <= 12) {
	    	sw = 1;
	    }
		return sw;
		
	}

	// Imprime ya la fecha teniendo las condiciones dadas por el algoritmo
    public static void printDate(int dia, int mes, int add, int aux){
    	
    	int a=0, b, c, d, e, num; // variables para sacar el dia dada por el algoritmo  	
        
    	int valorMes[] = {6, 2, 2, 5, 0, 3, 5, 4, 6, 2, 4};
    	String diaSemana[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    	String nomMes[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dic"}; 
        
        if(add >= 1700 && add <= 1799){
        	a = 5;
        }
        if(add >= 1800 && add <= 1899){
        	a = 3;
        }
        if(add >= 1900 && add <= 1999){
        	a = 1;
        }
        if(add >= 2000 && add <= 2099){
        	a = 0;
        }
        if(add >= 2100 && add <= 2199){
        	a = -2;
        }
    	if(add >= 2200 && add <= 2299){
    		a = -4;
    	}
    	
    	b = aux / 4;
    	b = aux + b;
    	
    	if(add % 4 == 0 && mes == 1 || mes == 2){
    		c = -1;
    	}else{
    		c = 0;
    	}
    	d = valorMes[mes-1]; 
    	e = dia;
    	
    	num = (a + b + c + d + e ) % 7;
    	
    	
    	System.out.println(diaSemana[num] + " " + dia +  " " + nomMes[mes-1] + " " + add );
    	
    }
   
  


	
}

