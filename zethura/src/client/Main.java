package client;

public class Main {

	public static void main(String[] args) {
		
		Game game = new Game();
		game.init();
		game.loop();
		game.shutdown();
	}

}