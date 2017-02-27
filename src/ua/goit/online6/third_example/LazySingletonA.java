package ua.goit.online6.third_example;

/**
 * Example to lazy initialized singleton..
 *
 * @author andreymi
 */
public class LazySingletonA {
    // now when static variable initialized it will initialized with null value.
    private static LazySingletonA instance;

    // when we first time will call method getInstance then instance variable will create.
    // this algorythm is called lazy initialization (opposite is eager).
    public static LazySingletonA getInstance() {
        if (instance == null) {
            instance = new LazySingletonA(10);
        }
        return instance;
    }


    private int value;

    public LazySingletonA(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
