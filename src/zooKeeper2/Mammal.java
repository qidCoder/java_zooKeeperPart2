package zooKeeper2;

//Create a Mammal class that has an energyLevel and displayEnergy() method. The displayEnergy() method should show the animals energy level as well as return it.

public class Mammal {
	protected int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;//default value
	}

	public Mammal(int energy) {
		this.energyLevel = energy;
	}

	public int displayEnergy() {
		System.out.printf("Current energy level: %d\n", energyLevel);
		return energyLevel;
	}

	public void setEnergy(int energy) {
		this.energyLevel = energy;
	}	

}
