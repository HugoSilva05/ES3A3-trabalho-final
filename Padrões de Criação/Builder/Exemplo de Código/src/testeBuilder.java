import javax.swing.JOptionPane;

/**
*
* @author Leonardo Gomes da Silva
*/

public class testeBuilder {

	public static void main(String[] args) {
		Livro livro = new Livro.LivroBuilder()
			.titulo("Um Livro")
			.autor("Ugo")
			.edicao(2)
			.qtdPaginas(411)
			.build();
		
		JOptionPane.showMessageDialog(null, livro.getLivro());

	}

}
