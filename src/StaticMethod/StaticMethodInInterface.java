package StaticMethod;
interface Verhicle{

    default void printDefault(){
        System.out.println("ping ping Default");
    }

    static void printStatic(){
        System.out.println("ping ping Static");
    }

    void printNonAbstract();
}
public class StaticMethodInInterface implements Verhicle{
    @Override
    public void printNonAbstract() {
        System.out.println("ping ping non abstract");
    }

    public static void main(String[] args) {
        StaticMethodInInterface object = new StaticMethodInInterface();
        object.printNonAbstract();
        object.printDefault();
        Verhicle.printStatic();

    }

}
