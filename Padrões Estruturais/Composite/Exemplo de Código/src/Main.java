//Classe Driver
public class Main
{
	public static void main (String[] args)
	{
		Desenvolvedor dev1 = new Desenvolvedor(10, "Hugo Silva", "Desenvolvedor Senior");
		Desenvolvedor dev2 = new Desenvolvedor(15, "Gustavo Delbon", "Desenvolvedor Junior");
		Diretor diretorEng = new Diretor();
		diretorEng.adicionaFuncionario(dev1);
		diretorEng.adicionaFuncionario(dev2);
		
		Gerente ger1 = new Gerente(20, "Gabriel Azevedo", "Gerente Geral");
		Gerente ger2 = new Gerente(21, "Leonardo Gomes", "Gerente de Produção");
		
		Diretor diretorConta = new Diretor();
		diretorConta.adicionaFuncionario(ger1);
		diretorConta.adicionaFuncionario(ger2);
	
		Diretor diretor = new Diretor();
		diretor.adicionaFuncionario(diretorEng);
		diretor.adicionaFuncionario(diretorConta);
		diretor.mostrarDetalhesDoFuncionario();
	}
}