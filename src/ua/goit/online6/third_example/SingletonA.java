package ua.goit.online6.third_example;

/**
 * Class that acts himself as singleton.
 *
 * @author andreymi.
 */
public final class SingletonA {
    // We will create singleton pattern object. This means that it is only possible to hold
    // one instance of such class in application. (in java it is not correct as classes as loaded by classloader objects
    // and when in java app several classloaders loaded same class - there will be several singletons. So in java correct
    // statement will be one per classloader)

    // when we put variable 'instance' be static we guarantee it will be loaded once and holds only single instance of element.
    private static SingletonA instance = new SingletonA(5);
    // this means that every call to get instance will return same object.
    public static SingletonA getInstance() {
        return instance;
    }

    private int value;

    private SingletonA(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
