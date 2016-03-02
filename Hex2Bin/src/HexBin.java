import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HexBin {

	public static void main(String[] args) throws IOException {
       
		String hex, binario;
		boolean sw=true;
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Ingrese numero hexadecimal: ");
		hex = in.readLine();
		for(int i=0;i<hex.length();i++){
			if(hex.charAt(i) >= '0' && hex.charAt(i) <= '9' || hex.charAt(i) >='a' && hex.charAt(i) <='f'){}
			else{
				sw = false;
			}
		}
        
		if(sw == true){
			int dec = Integer.parseInt(hex,16);
			binario = Integer.toBinaryString(dec);
			System.out.println("binario es :" + binario);
		}else{
			System.out.println("El numero no es Hexadecimal");
		}
		
			

	}

	private static char[] hex(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static boolean hexadecimal(int i) {
		// TODO Auto-generated method stub
		return false;
	}

}
