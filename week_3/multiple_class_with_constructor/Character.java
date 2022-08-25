public class Character {
    // Character attributes
    int strength;
    int agility;
    int intelligence;
    String name;

    // Character method
    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }

    // Constructor
    public Character(int str, int agi, int intel, String characterName) {
        strength = str;
        agility = agi;
        intelligence = intel;
        name = characterName;
    }
}