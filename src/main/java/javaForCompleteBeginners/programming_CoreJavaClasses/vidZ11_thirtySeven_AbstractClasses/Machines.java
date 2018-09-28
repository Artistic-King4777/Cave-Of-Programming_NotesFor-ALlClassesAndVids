package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ11_thirtySeven_AbstractClasses;

public abstract class Machines {

    // somthing common between all the classes
    private int id;

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    // Want to put methods in machines that ALL
    //  machines will have but not want machine itself to
    //  use the methods (make them abstract!)
    public abstract void start();
    public abstract void doStuff();
    public abstract void shutdown();

    public void run() {
        start();
        doStuff();
        shutdown();
    }

}
