public interface Animal extends HumanRace { // extends HumanRace now classes that implements Animal interface also need methods from HumanRace

    double gravity = 9.81; //constant, every variable in interface is final
    void move(); //implementing methods - taking interface methods and giving them body

    void die();

    default void meth(){ // With default method you don't have to provide a body to it in other class that uses interface, but you can still override it
        System.out.println("ahudfaiuhsf");
        scream(); //you can call private method using default
    }
    //with static method you don't have to create object to call it
    static void stalk(){
        System.out.println("talking...");
    }

    private void scream(){
        System.out.println("aaaaaa");
        mscream(); //you can use private method using private method
    }

    private void mscream(){
        System.out.println("AAAAAAAAAA");
    }


}
