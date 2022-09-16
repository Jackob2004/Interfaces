public interface Animal extends HumanRace { // extends HumanRace now classes that implements Animal interface also need methods from HumanRace

    double gravity = 9.81; //constant, every variable in interface is final
    void move(); //implementing methods - taking interface methods and giving them body

    void die();

    default void meth(){ // With default method you don't have to provide a body to it in other class that uses interface, but you can still override it
        System.out.println("ahudfaiuhsf");
    }

}
