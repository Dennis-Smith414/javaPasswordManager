package passwordManager;
import java.util.Random;
import java.util.Scanner;

public class passwordGen {
	public int pLength;
	public String useCase;
	public String password;
	
	passwordGen() {
		this(0);
	}
	
	public passwordGen(int pLength) {
        this.setPLength(pLength);
	}
	
	public int getPLength(int pLength) {
		return this.pLength;
	}
	
	private void setPLength(int pLength) {
		this.pLength= pLength;
	}
	
	public void passGen(int pLength) {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder password = new StringBuilder();
		
		Random random	= new Random();
		for (int i=0; i< this.getPLength(i); i++) {
			int index = random.nextInt(chars.length());
			char randomChar = chars.charAt(index);
			password.append(randomChar);
		}
		
	}
	
	public String useCase(String useCase) {
		Scanner use = new Scanner(System.in);
		System.out.println("What will this password be use for?: ");
		useCase = use.next();
		return useCase;
	}
	
	public String toString() {
		return "your password for " + useCase + "is: " + password ;
		
	}

}
