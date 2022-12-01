//Um programa Java para demonstrar o funcionamento do
//padrão Composite usando o exemplo
//de uma empresa com diferentes
//dados de funcionários

import java.util.ArrayList;
import java.util.List;


//Uma interface comum para todos os funcionários
interface Funcionario
{
	public void mostrarDetalhesDoFuncionario();
}

class Desenvolvedor implements Funcionario
{
	private String nome;
	private long funId;
	private String cargo;
	
	public Desenvolvedor(long funId, String nome, String cargo)
	{
		// Atribua o ID do funcionário,
		// nome e a cargo
		this.funId = funId;
		this.nome = nome;
		this.cargo = cargo;
	}
	
	@Override
	public void mostrarDetalhesDoFuncionario()
	{
		System.out.println(funId+" " +nome+ " " + cargo );
	}
}

class Gerente implements Funcionario
{
	private String nome;
	private long funId;
	private String cargo;

	public Gerente(long funId, String nome, String cargo)
	{
		this.funId = funId;
		this.nome = nome;
		this.cargo = cargo;
	}
	
	@Override
	public void mostrarDetalhesDoFuncionario()
	{
		System.out.println(funId+" " +nome+ " " + cargo );
	}
}


//Classe usada para obter a lista de funcionários
//e fazer operações como
//adicionar ou remover Funcionários

class Diretor implements Funcionario
{
	private List<Funcionario> listaDeFuncionarios = new ArrayList<Funcionario>();
		
	@Override
	public void mostrarDetalhesDoFuncionario()
	{
		for(Funcionario fun:listaDeFuncionarios)
		{
			fun.mostrarDetalhesDoFuncionario();
		}
	}
		
	public void adicionaFuncionario(Funcionario fun)
	{
		listaDeFuncionarios.add(fun);
	}
		
	public void removeFuncionario(Funcionario fun)
	{
		listaDeFuncionarios.remove(fun);
	}
}
