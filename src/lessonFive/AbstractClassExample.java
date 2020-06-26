package lessonFive;

public abstract class AbstractClassExample {
    int age=10;
    String name="child";

    protected abstract void sing();//abstract method

    public void walk(){//concrete method
        System.out.println("yes i can walk");
    }

    public static void main(String[] args) {
        // AbatractClassExample raz=new AbatractClassExample() {

        ChildOfAbstractClass child= new ChildOfAbstractClass();


        child.sing();
        child.walk();

    }
}
