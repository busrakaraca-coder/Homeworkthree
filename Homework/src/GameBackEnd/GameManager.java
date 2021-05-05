package GameBackEnd;

public class GameManager implements GameService{
	
	@Override
	public void Add(Game game) {
		System.out.println("oyun eklendi : " + game.getGameName());
		
	}
	
	@Override
	public void Delete(Game game) {
		System.out.println("oyun silindi : " + game.getGameName());
		
	
	}
	
	@Override
	public void Update(Game game) {
		System.out.println("oyun güncellendi: " + game.getGameName());
		
	}

}
