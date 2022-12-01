public class Main
{
	public static void main(String args[])
	{
		MensagemColecao mc = new MensagemColecao();
		BarraNofiticacoes bn = new BarraNofiticacoes(mc);
		bn.printMensagens();
	}
}
