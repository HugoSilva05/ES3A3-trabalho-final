//Classe Driver
public class Main
{
	public static void main (String[] args)
	{
		Desenvolvedor dev1 = new Desenvolvedor(100, "Lokesh Sharma", "Pro Developer");
		Desenvolvedor dev2 = new Desenvolvedor(101, "Vinay Sharma", "Developer");
		Diretor diretorEng = new Diretor();
		diretorEng.adicionaFuncionario(dev1);
		diretorEng.adicionaFuncionario(dev2);
		
		Gerente ger1 = new Gerente(200, "Kushagra Garg", "SEO Manager");
		Gerente ger2 = new Gerente(201, "Vikram Sharma ", "Kushagra's Manager");
		
		Diretor diretorConta = new Diretor();
		diretorConta.adicionaFuncionario(ger1);
		diretorConta.adicionaFuncionario(ger2);
	
		Diretor diretor = new Diretor();
		diretor.adicionaFuncionario(diretorEng);
		diretor.adicionaFuncionario(diretorConta);
		diretor.mostrarDetalhesDoFuncionario();
	}
}
