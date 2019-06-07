package singletonpattern;

public class ThredSefty {
	
	private ThredSefty() {}
	private static class ThreadHelp{
		private static ThredSefty obj=new ThredSefty();
		
	}
	public ThredSefty getInstance() {
		return ThreadHelp.obj;
		
	}
}
	
