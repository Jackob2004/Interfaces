public class Wolf implements Animal{ //if a class is abstract you don't have to implement methods from interface

    @Override
    public void move() {
        System.out.println("THe wolf starts to move");
    }

    @Override
    public void die() {
        System.out.println("The wolf has perished");
    }

    @Override
    public void sth() {

    }
}
