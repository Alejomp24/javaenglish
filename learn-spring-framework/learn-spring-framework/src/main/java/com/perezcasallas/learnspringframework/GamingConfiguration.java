package com.perezcasallas.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.perezcasallas.learnspringframework.game.GameRuner;
import com.perezcasallas.learnspringframework.game.GamingConsole;
import com.perezcasallas.learnspringframework.game.PacManGame;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}

	@Bean
	public GameRuner gameRunner(GamingConsole game) {
		var gameRunner = new GameRuner(game);
		return gameRunner;
	}
}
