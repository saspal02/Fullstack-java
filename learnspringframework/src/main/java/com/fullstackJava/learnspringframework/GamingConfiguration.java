package com.fullstackJava.learnspringframework;


import com.fullstackJava.learnspringframework.game.GameRunner;
import com.fullstackJava.learnspringframework.game.GamingConsole;
import com.fullstackJava.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game());
        return gameRunner;
    }
}
