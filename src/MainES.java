
import java.io.IOException;
import java.util.Scanner;

import java.util.Arrays;

public class MainES {
	
	//Se hace la una implementación cruzada de la clase Main, corresponde al ejercicio Exact sum. No nos pasa en el juez.
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner br = new Scanner(System.in); 
		String inputs = "0"; 
		
		while(br.hasNext()) {
			int numBooks = br.nextInt();
			br.nextLine();
			String priceBooks = br.nextLine();
			String[] array = priceBooks.split(" ");
			int money = br.nextInt();
			int[] prices = new int[array.length];
			for(int i = 0; i<prices.length;i++) {
				prices[i] = Integer.parseInt(array[i]);
			}
			Arrays.sort(prices);
			
			int v1 = 0;
			int v2 = 0;
			int finalOut1 = 0;
			int finalOut2 = money;
			
			
		
			for(int i = 0;i<prices.length;i++) {
				int valueSearched = money-prices[i];
				
				
				int inicio = 0;
				int fin = (prices.length)-1;
				int medio = 0; 
				boolean stop = false;
				   
				while(inicio <= fin && !stop) {
					medio = (inicio+fin)/2;
					if(prices[medio]==valueSearched) {
					
						v1 = prices[i];
						
						v2 = prices[medio];
						
						stop = true;
						
					}
					else if(valueSearched>prices[medio]) {
						inicio = medio+1;
					}
					else {
						fin = medio-1;
					}
				}

				if(Math.abs(finalOut1-finalOut2)>Math.abs(v1-v2)) {
					finalOut1 = v1;
					finalOut2 = v2;
				}
				
			}
		
			System.out.println("Peter should buy books whose prices are " + finalOut1 + " and " + finalOut2+".");
			System.out.println("");
			//inputs = br.nextLine();
			
		}
	}
	
}
