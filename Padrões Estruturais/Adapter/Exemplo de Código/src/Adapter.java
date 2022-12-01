//Implementação Java do Padrão Adapter

interface Passaro
{
	// passaros implementam a interface Passaro, 
	// que os permite voar e cantar
	public void voar();
	public void cantar();
}

class Pardal implements Passaro
{
	// uma implementação de passaro
	public void voar()
	{
		System.out.println("Voando");
	}
	public void cantar()
	{
		System.out.println("Piu Piu");
	}
}

interface PatinhoDeBrinquedo
{
	// interface alvo, 
	// passaros de brinquedo não voam, 
	// apenas chiam
	public void chiar();
}

class PatinhoDeBrinquedoDePlastico implements PatinhoDeBrinquedo
{
	public void chiar()
	{
		System.out.println("Quen quen");
	}
}

class PassaroAdapter implements PatinhoDeBrinquedo
{
	// você precisa implementar a interface que
	// o cliente espera usar.
	Passaro passaro;
	public PassaroAdapter(Passaro passaro)
	{
		// precisamos referenciar o objeto que
		// estamos adaptando
		this.passaro = passaro;
	}

	public void chiar()
	{
		// traduzir os metodos apropriadamente
		passaro.cantar();
	}
}