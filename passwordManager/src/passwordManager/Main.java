package passwordManager;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		 int desiredPasswordLength;
		 Scanner stdIn = new Scanner(System.in);
		 
		 System.out.println("How long would you like the password to be?");
		 desiredPasswordLength = stdIn.nextInt();
		 
	        passwordGen pass = new passwordGen(desiredPasswordLength);
	        String password = pass.passGen(desiredPasswordLength);
	        System.out.println(password);
	}
}
