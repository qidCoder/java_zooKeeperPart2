package zooKeeper2;

//Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()

//inherit the Mammal class
public class Gorilla extends Mammal{
//	For the throwSomething() method, have it print out a message indicating that the gorilla has thrown something, as well as decrease the energy level by 5
	public void throwSomething() {
		this.energyLevel -= 5;
		System.out.println("The gorilla has thrown something and lost 5 energy points.");
	}
	
//	For the eatBananas() method, have it print out a message indicating the gorilla's satisfaction and increase its energy by 10
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println("The gorilla just ate bananas and is so happy!");
	}
	
//	For the climb() method, have it print out a message indicating the gorilla has climbed a tree and decrease its energy by 10
	public void climb() {
		this.energyLevel -= 10;
		System.out.println("The gorilla climbed a tree and is now 10 points out of energy.");
	}

}
