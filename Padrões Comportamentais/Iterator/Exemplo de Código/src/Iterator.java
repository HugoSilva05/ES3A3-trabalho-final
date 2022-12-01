class Mensagem
{
	String mensagem;

	public Mensagem(String mensagem)
	{
		this.mensagem = mensagem;
	}
	public String getMensagem()
	{
		return mensagem;
	}
}

interface Colecao
{
	public Iterator createIterator();
}

class MensagemColecao implements Colecao
{
	static final int LIMETE_ITENS = 6;
	int numeroDeItens = 0;
	Mensagem[] mensagemLista;

	public MensagemColecao()
	{
		mensagemLista = new Mensagem[LIMETE_ITENS];

		addItem("Mensagem 1");
		addItem("Mensagem 2");
		addItem("Mensagem 3");
	}

	public void addItem(String str)
	{
		Mensagem mensagem = new Mensagem(str);
		if (numeroDeItens >= LIMETE_ITENS)
			System.err.println("Cheio");
		else
		{
			mensagemLista[numeroDeItens] = mensagem;
			numeroDeItens = numeroDeItens + 1;
		}
	}

	public Iterator createIterator()
	{
		return new MensagemIterator(mensagemLista);
	}
}

interface Iterator
{
	boolean hasNext();

	Object next();
}

class MensagemIterator implements Iterator
{
	Mensagem[] mensagemLista;

	int pos = 0;

	public MensagemIterator (Mensagem[] mensagemLista)
	{
		this.mensagemLista = mensagemLista;
	}

	public Object next()
	{
		Mensagem mensagem = mensagemLista[pos];
		pos += 1;
		return mensagem;
	}

	public boolean hasNext()
	{
		if (pos >= mensagemLista.length ||
			mensagemLista[pos] == null)
			return false;
		else
			return true;
	}
}

class BarraNofiticacoes
{
	MensagemColecao mensagens;

	public BarraNofiticacoes(MensagemColecao mensagens)
	{
		this.mensagens = mensagens;
	}

	public void printMensagens()
	{
		Iterator iterator = mensagens.createIterator();
		System.out.println("-------Barra de Nofiticações------------");
		while (iterator.hasNext())
		{
			Mensagem n = (Mensagem)iterator.next();
			System.out.println(n.getMensagem());
		}
	}
}