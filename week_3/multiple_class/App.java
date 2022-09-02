public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();

        // Create a Pet Class

        // Properties
        // name
        // trust level
        // isAdopted
        // Birthday

        // Create one object
        // object - dog

        // name - Browny
        // trust level - 100
        // isAdopted - false
        // Birthday - 04/03/1990

        Pet dog = new Pet();
        dog.name = "Browny";
        dog.trustlevel = 100;
        dog.isAdopted = false;
        dog.birthday = "04/03/1990";

        // Create a Person Class

        // Properties

        // object - Me
        // firstname
        // middlename
        // surname
        // age

        // object - me
        // firstname - elizer
        // middlename - D
        // surname - ponio
        // age - 50

        Person Me = new Person();
        Me.firstname = "elizer";
        Me.middlename = 'D';
        Me.surname = "ponio";
        Me.age = 50;

        // Create a fruit class

        // properties
        // color
        // taste
        // weight
        // isMyfavorite
        // firstLetterofFruitObject

        // example:

        // object - Mango
        Fruit Mango = new Fruit();

        // color - Yellow
        Mango.color = "Yellow";
        // taste - supersweet
        Mango.taste = "supersweet";
        // weight - 0.25
        Mango.weight = 0.25f;
        // isMyfavorite - true
        Mango.isMyfavorite = true;
        // firstLetterofFruitObject - M
        Mango.firstLetterofFruitObject = 'M';

    }
}