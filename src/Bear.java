public class Bear implements PolarBear.nestedThingy { // if bear was a subclass (without implementing Animal) of abstract class Wolf(that implements Animal) then you would have to implements Animal methods in subclass


    @Override
    public void doThing() {
        System.out.println("Thing done");
    }
}
