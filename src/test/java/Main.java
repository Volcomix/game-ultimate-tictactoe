import com.codingame.gameengine.runner.MultiplayerGameRunner;

public class Main {
    public static void main(String[] args) {

        System.setProperty("league.level", String.valueOf(2));
        MultiplayerGameRunner gameRunner = new MultiplayerGameRunner();
        gameRunner.addAgent("../tic-tac-toe-rust/target/release/tic-tac-toe-rust", "Volcomix",
                "https://static.codingame.com/servlet/fileservlet?id=9274241205710&format=agent_avatar");
        gameRunner.addAgent(Player1.class);
        // gameRunner.addAgent(Player2.class);

        gameRunner.start();
    }
}
