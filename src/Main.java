public class Main {
    public static void main(String[] args) {
    Wolf wolf = new Wolf();
    Bear bear = new Bear();

    wolf.move();

    Animal animal = new Wolf(); //with interface reference you cannot access any method declared inside a class(like Wolf) but you can access interface methods that were override
    animal.die();
    }
}
