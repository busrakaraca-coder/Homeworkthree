package GameBackEnd;

public class Game {
	
	private int gameId;
	private String gameName;
	public Game() {
		
	}
	public Game(int gameId,String gameName) {
		this.gameId=gameId;
		this.gameName=gameName;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	

}
