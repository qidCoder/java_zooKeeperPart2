package zooKeeper2;

//Create a Bat class that can fly(), eatHumans(), and attackTown() and has a default energy level of 300.
public class Bat extends Mammal{
	//override default energyLevel with 300
	public Bat() {
		//directly call the mammal constructor
		super(300);
	}
	
	//For the fly() method, print the sound a bat taking off and decrease its energy by 50.
	public void fly() {
		System.out.println("zip zip flap flap");
		this.energyLevel -= 50;
	}
	
	//For the eatHumans() method, print the so- well, never mind, just increase its energy by 25.
	public void eatHumans() {
		System.out.println("The Bat just ate...");
		this.energyLevel += 25;
	}
	
	//For the attackTown() method, print the sound of a town on fire and decrease its energy by 100.
	public void attackTown() {
		System.out.println("fire fire in the town!");
		this.energyLevel -= 100;
	}
}
