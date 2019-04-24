package Duck;

public class Duck {
	String favoriteFood;
	int numberOfFriends;
Duck(String favoriteFood, int numberOfFriends){
	this.favoriteFood = favoriteFood;
	this.numberOfFriends = numberOfFriends;
}
public void quack(int numberOfTimes) {
	for(;numberOfTimes > 0; numberOfTimes--) {
		System.out.println("Quack");
	}
}
public void askFavoriteFood() {
	System.out.println("**I AM GERALD**");
	System.out.println("**I FEAST OFF THE SOULS OF THE INNOCENT**");
	System.out.println("**AND ALSO I EAT SALMON**");
	System.out.println("**BUT PREFERABLY THE SOULS**");
	System.out.println("Ima hungry");
}
}
