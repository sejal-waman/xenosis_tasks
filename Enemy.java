public class Enemy {
    private String type;
    private int health;
    private int attackPower;

    public Enemy(String type, int health, int attackPower) {
        this.type = type;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    public void attack(Player player) {
        player.takeDamage(attackPower);
    }

    public boolean isDefeated() {
        return health == 0;
    }
}