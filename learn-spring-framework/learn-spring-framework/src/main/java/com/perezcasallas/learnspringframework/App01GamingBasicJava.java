package com.perezcasallas.learnspringframework;

import com.perezcasallas.learnspringframework.game.GameRuner;
import com.perezcasallas.learnspringframework.game.PacManGame;
//import com.perezcasallas.learnspringframework.game.SuperContraGame;
//import com.perezcasallas.learnspringframework.game.MarioGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// var game = new MarioGame();
		// var game = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner = new GameRuner(game);
		gameRunner.run();
	}

}
