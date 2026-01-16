package com.perezcasallas.learnspringframework;

//import com.perezcasallas.learnspringframework.game.SuperContraGame;
//import com.perezcasallas.learnspringframework.game.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.perezcasallas.learnspringframework.game.GameRuner;
import com.perezcasallas.learnspringframework.game.GamingConsole;

public class App03GamingSpringBeans {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRuner.class).run();
		}
	}
}
