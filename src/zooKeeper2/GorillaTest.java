package zooKeeper2;

public class GorillaTest {

	public static void main(String[] args) {
		//Create a GorillaTest class to instantiate a gorilla and have it throw three things, eat bananas twice, and climb once.

		Gorilla myGorilla = new Gorilla();//instantiate a gorilla
		
		myGorilla.throwSomething();
		myGorilla.throwSomething();
		myGorilla.throwSomething();
		myGorilla.eatBananas();
		myGorilla.eatBananas();
		myGorilla.climb();
		
		//display
		myGorilla.displayEnergy();
		
		
		//////////////////////////
		//Bat
		//Create a BatTest class to instantiate a bat and have it attack three towns, eat two humans, and fly twice.
		
		Bat myBat = new Bat();
		
		myBat.attackTown();
		myBat.attackTown();
		myBat.attackTown();
		myBat.eatHumans();
		myBat.eatHumans();
		myBat.fly();
		myBat.fly();
		
		myBat.displayEnergy();
		
		
	}

}
