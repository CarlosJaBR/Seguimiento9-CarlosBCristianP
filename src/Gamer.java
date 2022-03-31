import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Gamer {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		int nCases = Integer.parseInt(br.readLine());
		int counter = 0; 
		while(counter < nCases) {
			
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
			//operación de validar vida.
			
			int inicio = 0;
			int fin = (weapons.length)-1;
			int j = 0; 
			while(inicio < fin) {
				
				int medio = (inicio + fin + 1)/2;
				if(fin==medio) {
					lifeMounster-=weapons[medio];
					j++;
					if(lifeMounster<=0) {
						break;
					}else {
						fin = medio-1;
					}
				}else {
					
				}
			}
			counter++; 
		}
		
	}
}
