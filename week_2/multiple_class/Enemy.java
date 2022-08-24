public class Enemy {
    int damage;
    int health;
    int armor;
    boolean hasMagicImmunnity;
    String name;

    public void enemyDialogue() {
        System.out.println("Fear me player for my name is " + name + " and I deal " + damage + " damage!");
    }
}