/**
 *
 * @author Leonardo Gomes da Silva
 */

public class Singleton {
	private static Singleton instance;
	private String string;
	
	private Singleton(String string) {
		this.string = string;
	}
	
	public String getString() {
		return this.string;
	}
	
	public static Singleton getInstance(String string) {
		if (instance == null)
			instance = new Singleton(string);
		
		return instance;
	}

}
