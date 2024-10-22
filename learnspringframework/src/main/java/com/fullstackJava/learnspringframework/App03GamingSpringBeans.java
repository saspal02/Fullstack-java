package com.fullstackJava.learnspringframework;

import com.fullstackJava.learnspringframework.game.GameRunner;
import com.fullstackJava.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App03GamingSpringBeans {
    public static void main(String[] args) {

       try  (var context =
                     new AnnotationConfigApplicationContext(GamingConfiguration.class))
        {
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
