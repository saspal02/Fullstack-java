package com.fullstackJava.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class GamingAppLauncherApplication {

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        System.out.println("Parameter" + game);
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }

        //var game = new MarioGame();
        //var game = new SuperContraGame();
//        var game = new PacmanGame(); //1: Object creation
//        var gameRunner = new GameRunner(game); //2: Object Creation + Wiring Depependencies
//        gameRunner.run();
    }
}
