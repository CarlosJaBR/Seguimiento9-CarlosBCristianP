import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Gamer2 {
public static void main(String[] args) throws NumberFormatException, IOException {
		
	
	//Este es el código final que se hizo en el ejercio Gamer Hemose.
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		int nCases = Integer.parseInt(br.readLine());
		int counter = 0;
		String output = "";
		while(counter<nCases) {
			int j = 0; 
			String weaponLifeEne = br.readLine();
			String[] datas2 = weaponLifeEne.split(" ");
			String dataWeapon = br.readLine();
			String[] datas3 = dataWeapon.split(" ");
			int nWeapon = Integer.parseInt(datas2[0]);
			int lifeMounster = Integer.parseInt(datas2[1]);
			int weapons[] = new int[nWeapon];
			for(int i = 0; i < nWeapon; i++) {
				weapons[i] = Integer.parseInt(datas3[i]);
			}
			Arrays.sort(weapons);
			int resta = lifeMounster-weapons[weapons.length-1];
			if(resta<=0) {
				j++;
			}else { 
				int suma = weapons[weapons.length-1]+weapons[weapons.length-2];
				int veces = lifeMounster/suma;
				if(veces<1) {
					veces=1; 
				}
				int valor = suma*veces;
				j+=2*veces;
				if((lifeMounster-valor)>0) {
					valor+=weapons[weapons.length-1];
					j++;
					if((lifeMounster-valor)>0) {
						valor+=weapons[weapons.length-2];
						j++;
					}
				}
				
				
			}
			
			output+= j+"\n";
			counter++;
		}
		System.out.println(output);
	}
}
