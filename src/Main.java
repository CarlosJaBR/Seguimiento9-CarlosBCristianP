import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String inputs = "0"; 
		String output = ""; 
		while(inputs!=null) {
			
			String in = br.readLine();
			if(in.equals("")) {
				break;
			}
			int numBooks = Integer.parseInt(in);
			String priceBooks = br.readLine();
			String[] array = priceBooks.split(" ");
			int money = Integer.parseInt(br.readLine());
			int[] prices = new int[array.length];
			for(int i = 0; i<prices.length;i++) {
				prices[i] = Integer.parseInt(array[i]);
			}
			Arrays.sort(prices);
			
			int inicio = 0;
			int fin = (prices.length)-1;
			int medio = (inicio + fin+1)/2; 
			int valor = 0;
			while(inicio < fin) {
				int sum = prices[medio] + prices[medio-1];
				if(sum==money) {
					valor = prices[medio-1];
					break;
				}else {
					fin = medio-1;
				}
			}
			
			output += "Peter should buy books whose prices are " + valor + " and " + prices[medio] + "\n";
			output += "\n";
			
			inputs = br.readLine();
		}
		System.out.println(output);
	}
	
}
