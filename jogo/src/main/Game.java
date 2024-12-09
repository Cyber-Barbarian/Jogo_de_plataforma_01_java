package main;

public class Game {
    private GameWnindow gameWnindow;
    private GamePanel gamePanel;
    public Game() {
        gamePanel = new GamePanel();
        gameWnindow = new GameWnindow(gamePanel);
    }
}
