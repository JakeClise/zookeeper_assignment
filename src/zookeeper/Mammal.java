package zookeeper;

public class Mammal {
	private Integer energyLevel; 
	
	
	
	public Mammal() {
		this.energyLevel = 100;
	}

	public Integer getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(Integer amount) {
		this.energyLevel -= amount;
	}
	
	

}
