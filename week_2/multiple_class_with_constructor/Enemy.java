public class Enemy {
    // Enemy Attributes
    int damage;
    int health;
    int armor;
    boolean hasMagicImmunity;
    String name;

    // Enemy method
    public void enemyDialogue() {
        System.out.println("Fear me player for my name is " + name + " and I deal " + damage + " damage!");
    }

    // Constructor
    public Enemy(int enemyDamage, int enemyHealth, int enemyArmor, boolean enemyImmunity, String enemyName) {
        damage = enemyDamage;
        health = enemyHealth;
        armor = enemyArmor;
        hasMagicImmunity = enemyImmunity;
        name = enemyName;
    }
}