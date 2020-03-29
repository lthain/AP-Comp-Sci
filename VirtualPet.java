
public class VirtualPet {
	private String name;
	private int tired;
	private int boredom;
	private int thirst;
	private int hungerLevel;
	private int happy;
	
	public VirtualPet(String name, int hungerLevel, int tired, int thirst, int boredom, int happy) {
		this.name = name;
		this.hungerLevel = hungerLevel;
		this.tired = tired;
		this.thirst = thirst;
		this.boredom = boredom;
		this.happy= happy;

	}


	//get
	public String getName() {
		return name;
	}
	
	public int getTired() {
		return tired;
	}
	public int getHappy() {
		return happy;
	}
	
	public int hungerLevel() {
		return hungerLevel;
	}
	
	public int getBoredom() {
		return boredom;
	}

	public int getThirst() {
		return thirst;
	}
	
	//set
	public void feed() {
		hungerLevel -=5;
		thirst +=2;
	}
	
	public void drink() {
		thirst -=5;
		happy +=1;
	}
	
	public void play(){
		boredom -=5;
		thirst +=2;
		hungerLevel +=1;
	}
	public void sleep() {
		tired -=5;
		boredom += 2;
	}
	public void walk() {
		happy +=5;
		boredom -=5;
	}
	public void tick() {
		hungerLevel +=5;
		thirst +=5;
		boredom +=5;
		tired +=5;
	}
	
	public String toString() {
		return "VirtualPet stat's [name = " + name + ", hungerLevel = " + hungerLevel + ", thirst level = " + thirst+ ", boredom level = "+ boredom+ ", tired level = "+ tired+ ", happiness level= "+ happy+ "]";
	}
}
