public class Enemy {
    // Enemy attributes
    int damage;
    int health;
    int armor;
    boolean hasMagicImmunnity;
    String name;

    // Enemy method
    public void enemyDialogue() {
        System.out.println("Fear me player for my name is " + name + " and I deal " + damage + " damage!");
    }
}