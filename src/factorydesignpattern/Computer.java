package factorydesignpattern;

public abstract class Computer {
	public abstract String getRAM();
	public abstract String getCPU();
	public abstract String getHDD();
	public String toString() {
		
		return "RAM"+this.getCPU()+"CPU"+this.getHDD()+"RAM"+this.getCPU();
	}
}
