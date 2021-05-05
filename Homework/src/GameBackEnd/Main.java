package GameBackEnd;

public class Main {

	public static void main(String[] args) {
		GameManager gameManager = new GameManager();
		Game game1 = new Game();
		game1.setGameId(1);
		game1.setGameName("PUBG");
		
		gameManager.Add(game1);
		gameManager.Delete(game1);
		gameManager.Update(game1);
		
		System.out.println("------");
		

	}

}
