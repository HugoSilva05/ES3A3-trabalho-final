/**
*
* @author Leonardo Gomes da Silva
*/

public class Livro {
	private String titulo;
	private String autor;
	private int edicao;
	private int qtdPaginas;
		
	private Livro(String titulo, String autor, int edicao, int qtdPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.edicao = edicao;
		this.qtdPaginas = qtdPaginas;
	}
	
	public String getLivro() {
		return "Titulo: " + titulo + "\n" + 
				"Autor: " + autor + "\n" + 
				edicao + "° edição" + "\n" + 
				qtdPaginas + " páginas";
	}

	public static class LivroBuilder {
		private String titulo;
		private String autor;
		private int edicao;
		private int qtdPaginas;
		
		public LivroBuilder titulo(String titulo) {
			this.titulo = titulo;
			return this;
		}
		public LivroBuilder autor(String autor) {
			this.autor = autor;
			return this;
		}
		public LivroBuilder edicao(int edicao) {
			this.edicao = edicao;
			return this;
		}
		public LivroBuilder qtdPaginas(int qtdPaginas) {
			this.qtdPaginas = qtdPaginas;
			return this;
		}
		
		public Livro build() {
			return new Livro(titulo, autor, edicao, qtdPaginas);
		}
	}

}
