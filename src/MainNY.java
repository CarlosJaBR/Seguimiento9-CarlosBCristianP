import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainNY{
	
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		String [] separated = input.split(" ");
		
		int numProblems = Integer.valueOf(separated[0]);
		
		int minutesGoHome = Integer.valueOf(separated[1]);
		
		
	
		
		int out = 0;
		
		int totalMinutes = 240-minutesGoHome;
		
		boolean stop = false;
		
		int acumulatedMinutes = 0;
		
		for (int i = 0; i < numProblems && !stop; i++) {
			
			acumulatedMinutes += 5*(i+1);
			
			if(acumulatedMinutes > totalMinutes) {
				stop = true;
			}
			else {
				out ++;
			}
			
		}
		
		System.out.println(out);
		
		
		
	}
}
