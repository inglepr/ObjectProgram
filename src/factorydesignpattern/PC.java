package factorydesignpattern;

public class PC extends Computer{
public  static String ram;
public static String cpu;
public static String hdd;
public PC(String ram, String hdd, String cpu){
	this.ram=ram;
	this.hdd=hdd;
	this.cpu=cpu;
}
	@Override
	public String getRAM() {
		
		return this.ram;
	}

	@Override
	public String getCPU() {
		
		return this.cpu;
	}

	@Override
	public String getHDD() {

		return this.hdd;
	}

}
