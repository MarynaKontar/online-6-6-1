package ua.goit.online6.second_example;

/**
 * Examples of static block initialization
 *
 * @author andreymi.
 */
public class StaticBlockExample {
    // static variables are initialized in order they are written in class.
    private static int aInt;
    // this is correct assignment, but aInt cannot be assigned aInt.
    private static int bInt = aInt;

    // despite static variables there are static blocks.
    // this is just simple curly brakes preceed by static keyword
    static {
        // here all variable from above are visible.
        // static blocks are executed in same way as ordinal variable: first instance of class creation
        // or static method call
        // Their advantage is that this block can have more complicated java code and execute only once.
        for (int i = 0; i < 10; i++) {
            aInt += i;
        }
        // (ADV) when exception occurred in static block then NoClassDefFoundError raised as class cannot be loaded.
    }

    // static variables can be assigned in static methods or ordinal method.
    public static int getaInt() {
        return aInt;
    }

    // when you have some value which is object scope data - it cannot be accessed from static
    // scope as static method or block do not have link to any created object
    private int value;

    //Error:(35, 16) java: non-static variable value cannot be referenced from a static context
    //public static int getValue() {
    //  return value;
    //}
    // but opposite possible

    public int getValue() {
        return aInt;
    }
}
