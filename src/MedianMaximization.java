import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MedianMaximization {
	
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numTest = Integer.valueOf(br.readLine());
		String out = "";
	
		
		
		
		for(int i = 0;i<numTest;i++) {
			String test = br.readLine();
			String [] separatedTest = test.split(" ");
			
			int length = Integer.valueOf(separatedTest[0]);
			int rSum = Integer.valueOf(separatedTest[1]);
			
			int answer = rSum/((length/2)+1);
			
			out += answer+"\n";
		}
		
		System.out.println(out);
		
		
	}
	
}