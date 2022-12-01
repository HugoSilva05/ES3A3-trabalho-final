class Criquete
{
	int voltas, pontos;
	float overs;
	ExibirPontuacaoAtual exibirPontuacaoAtual;
	ExibirPontuacaoMedia exibirPontuacaoMedia;

	// Método Construtor
	public Criquete(ExibirPontuacaoAtual exibirPontuacaoAtual, ExibirPontuacaoMedia exibirPontuacaoMedia)
	{
		this.exibirPontuacaoAtual = exibirPontuacaoAtual;
		this.exibirPontuacaoMedia = exibirPontuacaoMedia;
	}

	// Os retornos abaixo servem para simplificar a ideação do código
	// Recebe as ultimas voltas no estadio
	private int getUltimasVoltas(){
		return 90;
	}

	// Get para pegar todos os objetivos (uma espécie de objeto por onde se obtem a pontuaçãp)
	private int getUltimosPontos()
	{
		return 2;
	}

	// Get latest overs from stadium
	private float getUltimasOvers()
	{
		return (float)10.2;
	}

	// Método criado para exibir as informações quando as informações acabm mudando
	public void alterarDados()
	{
		// Recebe a última informacao do estádio
		voltas = getUltimasVoltas();
		pontos = getUltimosPontos();
		overs = getUltimasOvers();

		exibirPontuacaoAtual.update(voltas,pontos,overs);
		exibirPontuacaoMedia.update(voltas,pontos,overs);
	}
}

// Uma classe para exibir a pontuação média. Os dados desta classe são
// Atualizado pelas informações da Criquete
class ExibirPontuacaoMedia
{
	private float PorcentagemVoltas;
	private int PredicaoPontuacao;

	public void update(int voltas, int pontos, float overs)
	{
		this.PorcentagemVoltas = (float)voltas/overs;
		this.PredicaoPontuacao = (int) (this.PorcentagemVoltas * 50);
		display();
	}

	public void display()
	{
		System.out.println("\nExibição de pontuação média:\n" +
						"Média de voltas: " + PorcentagemVoltas +
						"\nPredicaoPontuacao: " + PredicaoPontuacao);
	}
}

// Uma classe para exibir a pontuação. Os dados desta classe são
// actualizado por Criquete

class ExibirPontuacaoAtual
{
	private int voltas, pontos;
	private float overs;

	public void update(int voltas,int pontos,float overs)
	{
		this.voltas = voltas;
		this.pontos = pontos;
		this.overs = overs;
		display();
	}

	public void display()
	{
		System.out.println("\nExibição de pontuação atual: \n" +
						"voltas: " + voltas +"\npontos:"
						+ pontos + "\nOvers: " + overs );
	}
}