public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character(10, 5, 0, "Chen");
        knight.sayMyName();

        Character mage = new Character(0, 5, 10, "Akasha");
        mage.sayMyName();

        Character thief = new Character(5, 10, 0, "Gondar");
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy(50, 500, 100, true, "Roshan");
        boss.enemyDialogue();

        Enemy skeleton = new Enemy(5, 10, 5, false, "Common Skeleton Warrior");
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy(40, 400, 75, false, "Ancient Wyvern");
        dragon.enemyDialogue();
    }
}
