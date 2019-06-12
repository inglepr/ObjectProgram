package factorydesignpattern;

public class Server extends Computer {
public static String ram;
public static String hdd;
public static String cpu;
public Server(String ram,String hdd,String cpu) {
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
		// TODO Auto-generated method stub
		return this.cpu;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

}
