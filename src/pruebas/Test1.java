package pruebas;

import java.util.Scanner;

public class Test1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		solution ( str);
	}
	
	private static void solution (String str){
		
		int contador = 1;
		
		if (!str.isEmpty()){
			
			for (int i=0; i< str.length(); i++){
				
				char charOfStr = str.charAt(i);
				
				if (charOfStr >= 65 && charOfStr <= 90){
					contador++;
				}
			}
			
		}else{
			contador = 0;
		}
		
		System.out.println(contador);
	}
}
