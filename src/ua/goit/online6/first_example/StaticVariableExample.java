package ua.goit.online6.first_example;

/**
 * This is example class showing static variable usages.
 *
 * @author andreymi
 */
public class StaticVariableExample {
    // Static variable is variable that holds the value in scope of
    // class, not object
    private static long value;
    // it might have any visibility: private, protected or public.
    protected static int intValue;
    // Static variable initialized when first instance of class created, or first time static method called

    // There is possibility to create static methods - methods that can be called without
    // class instance creation
    public static void setValue(int value) {
        // as static variable belongs to class we cannot use 'this' or 'super' - so this means that
        // we can call static methods and variables without creation of object class
        StaticVariableExample.value = value;
    }

    // we can combine static and not static variables in class
    private int notStaticValue;
    // 1. Lets create two constructors - one accept value and next just take it from static variable
    // 2. Implement toString method to describe object text value.

    public StaticVariableExample() {
        this.notStaticValue = intValue;
    }

    @Override
    public String toString() {
        return "StaticVariableExample{" +
                "notStaticValue=" + notStaticValue +
                '}';
    }
}
