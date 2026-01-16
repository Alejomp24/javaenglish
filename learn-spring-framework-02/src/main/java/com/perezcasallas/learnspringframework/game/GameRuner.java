package com.perezcasallas.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component

public class GameRuner {
	private GamingConsole game;

	public GameRuner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running Game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
