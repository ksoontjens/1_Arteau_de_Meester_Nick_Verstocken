public class Main
{
	public static void main(String[] args) 
	{
		Werknemer nick = new Werknemer("nick", "maris", 1, 2000);
		Werknemer erik = new Werknemer("erik", "wijnen", 2, 50);
		Werknemer jorgos = new Werknemer("jorgos", "gilis", 3, 2000000);
		Werknemer tom = new Werknemer("tom", "niemand", 4, 9000000);

		PartTimeWerknemer paul = new PartTimeWerknemer("paul", "verhoeven", 5, 1, 15);
		PartTimeWerknemer joske = new PartTimeWerknemer("Joske", "Vermeulen", 6, 20, 18);

		nick.salarisVerhogen(10);
		erik.salarisVerhogen(10);

		System.out.println(nick.voornaam + ": " + nick.getSalaris());
		System.out.println(erik.voornaam + ": " + erik.getSalaris());
		System.out.println(jorgos.voornaam + ": " + jorgos.getSalaris());
		System.out.println(tom.voornaam + ": " + tom.getSalaris());

		paul.salarisVerhogen(10);

		System.out.println(erik.voornaam + ": " + erik.getWeekloon());
		System.out.println(joske.voornaam + ": " + joske.getWeekloon());


	}
}