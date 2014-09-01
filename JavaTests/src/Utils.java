import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Utils {
	public static String ReadLine() throws IOException{
		// Open the standard input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
		String output = br.readLine();
       
		return output;
	}
	
	public static float ReadFloat(){
		System.out.printf("Please enter a float");
        
		Scanner scanner = new Scanner(System.in);
		float f = scanner.nextFloat();
		return f;
	}	
}
