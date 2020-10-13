import java.util.Scanner;

// The interface for the MyBotPlayer class to implement
public interface BotPlayer extends Player{
    // In a map without any walls
    // eats all food elements
    // by choosing the shortest path
    void eat();

    // Passes the initialized food to the bot player
    void feed(Food f);

    // In a customized map
    // finds a valid path to food and eats it
    void find();
}


