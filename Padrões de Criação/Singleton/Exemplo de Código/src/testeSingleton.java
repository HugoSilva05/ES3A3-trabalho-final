import javax.swing.JOptionPane;

/**
*
* @author Leonardo Gomes da Silva
*/

public class testeSingleton {

	public static void main(String[] args) {
		Singleton a = Singleton.getInstance("teste A");
		Singleton b = Singleton.getInstance("teste B");
		Singleton c = Singleton.getInstance("teste C");
		
		if ((a == b) && (b == c))
			JOptionPane.showMessageDialog(null, "Todos apontam para o mesmo objeto: " +
											"\n" + a.getInstance(null) + " - " + a.getString() + 
											"\n" + b.getInstance(null) + " - " + b.getString() + 
											"\n" + c.getInstance(null) + " - " + c.getString());										

	}

}
