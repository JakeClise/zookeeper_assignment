package zookeeper;

public class Gorilla extends Mammal {

	public Gorilla () {};
	
	public String throwBanana() {
		this.setEnergyLevel(-5);
		return "The Gorilla threw a banana, their energy level is now at " + this.getEnergyLevel() + "/100";
	}
	
	public String climb() {
		this.setEnergyLevel(-10);
		return "The Gorilla is climbing, their energy level is now at " + this.getEnergyLevel() + "/100";
	}
	
	public String eatBanana() {
		this.setEnergyLevel(10);
		return "The Gorilla is eating bananas, their energy level is now at " + this.getEnergyLevel() + "/100";
	}
	
}
