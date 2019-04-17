package cat;

public class Cat_Runner {
	public static void main(String [] args) {
Cat A = new Cat("Bongo");
A.meow();
A.printName();
for(int i = 9; i > 0; i--) {
	A.kill();
}
	}
}
