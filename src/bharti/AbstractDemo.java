package bharti;

abstract class AbstractDemo {
    public abstract void run();
    public void color() {
        System.out.println("blue");
    }
}

class Car extends AbstractDemo {
    public void run() {
        System.out.println("running");
    }
}
//cd eclipse-workspace/practice
//git branch -M main


