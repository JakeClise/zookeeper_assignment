package zookeeper;

public class Bat {
	private Integer energyLevel;
	
	public Bat() {
		this.energyLevel = 300;
	}

	public String fly() {
		this.setEnergyLevel(50);
		return "'CAWWWW', the bat is flying, it's energy level is now at: " + this.getEnergyLevel() + "/300";
	}
	
	public String eatHumans() {
		this.setEnergyLevel(-25);
		return "The bat decided to eat a human, it's energy level is now at: " + this.getEnergyLevel() + "/300";
	}
	
	public String attackTown() {
		this.setEnergyLevel(100);
		return "The bat is currently going HAM on a town and it's energy level is at: " + this.getEnergyLevel() + "/300";
	}

	public Integer getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(Integer amount) {
		this.energyLevel -= amount;
	}
	
	
	
	
	
	

}
