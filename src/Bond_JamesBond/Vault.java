package Bond_JamesBond;

import java.util.Random;

public class Vault {
	int secretCode = new Random().nextInt(1_000_001);
	static boolean unlocked;
	public static void main(String [] args) {
Vault A = new Vault();
JamesBond J = new JamesBond();
J.findCode(A);
if(unlocked = true) {
	System.out.println("You did it!");
}
else {
	System.out.println("You stink");
}
}
	Vault(){
}
	
	boolean tryCode(int code){
		if(code == secretCode) {
			 unlocked = true;
		}
		else {
			 unlocked = false;
		}
		return unlocked;
		}

	 

}

