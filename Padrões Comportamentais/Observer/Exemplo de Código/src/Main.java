public class Main
{
	public static void main(String args[])
	{
		// Método para teste
		ExibirPontuacaoMedia pontuacaomedia = new ExibirPontuacaoMedia ();
		ExibirPontuacaoAtual pontuacaoptualexibir = new ExibirPontuacaoAtual ();

		// Passar os dados das partidas de cricket para exibir
		Criquete criquete = new Criquete(pontuacaoptualexibir ,pontuacaomedia);

		// Na aplicação real teria alguma lógica para chamar a isto
		// Função para quando os dados mudam
		criquete.alterarDados();
	}
}
