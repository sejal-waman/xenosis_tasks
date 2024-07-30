import java.util.Scanner;

public class GameWorld {
    private Player player;
    private Enemy enemy;
    private Scanner scanner;

    public GameWorld() {
        scanner = new Scanner(System.in);
    }

    public void startGame() {
        System.out.println("Enter your player's name: ");
        String playerName = scanner.nextLine();
        player = new Player(playerName);

        System.out.println("Welcome " + playerName + "! Your adventure begins now.");

        while (player.getHealth() > 0) {
            encounterEnemy();
            if (player.getHealth() > 0) {
                System.out.println("Do you want to continue to the next level? (yes/no)");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("no")) {
                    break;
                }
            }
        }

        System.out.println("Game over! Your final score is: " + player.getScore());
    }

    private void encounterEnemy() {
        enemy = new Enemy("Goblin", 50, 10);
        System.out.println("An enemy " + enemy.getType() + " appears!");

        while (enemy.getHealth() > 0 && player.getHealth() > 0) {
            System.out.println("Choose your action: attack, run");
            String action = scanner.nextLine();

            if (action.equalsIgnoreCase("attack")) {
                player.attack(enemy);
                System.out.println("You attacked the " + enemy.getType() + "!");
                if (enemy.isDefeated()) {
                    System.out.println("You defeated the " + enemy.getType() + "!");
                    player.increaseScore(10);
                } else {
                    enemy.attack(player);
                    System.out.println("The " + enemy.getType() + " attacked you!");
                }
            } else if (action.equalsIgnoreCase("run")) {
                System.out.println("You ran away from the " + enemy.getType() + "!");
                break;
            } else {
                System.out.println("Invalid action. Try again.");
            }

            player.printStatus();
            System.out.println(enemy.getType() + "'s Health: " + enemy.getHealth());
        }
    }
}

