public class Main
{
	public static void main(String args[])
	{
		Pardal pardal = new Pardal();
		PatinhoDeBrinquedo patinhoDeBrinquedo = new PatinhoDeBrinquedoDePlastico();

		// Envolva um passaro em um passaroAdapter paraque
		// se comporte como um patinho de brinquedo
		PatinhoDeBrinquedo passaroAdapter = new PassaroAdapter(pardal);

		System.out.println("Pardal...");
		pardal.voar();
		pardal.cantar();

		System.out.println("PatinhoDeBrinquedo...");
		patinhoDeBrinquedo.chiar();

		// patinho de brinquedo se comportando como um pássaro
		System.out.println("PassaroAdapter...");
		passaroAdapter.chiar();
	}
}