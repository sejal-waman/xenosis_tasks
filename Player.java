public class Player {
    private String name;
    private int health;
    private int attackPower;
    private int score;
    private ArrayList<String> inventory;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.attackPower = 10;
        this.score = 0;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    public void heal(int amount) {
        health += amount;
        if (health > 100) health = 100;
    }

    public void addToInventory(String item) {
        inventory.add(item);
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(attackPower);
    }

    public void increaseScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }

    public void printStatus() {
        System.out.println(name + "'s Health: " + health);
        System.out.println(name + "'s Score: " + score);
        System.out.println("Inventory: " + inventory.toString());
    }
}