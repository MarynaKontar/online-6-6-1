package ua.goit.online6.sixth_example;

/**
 * Example about final methods and classes.
 * <p>
 * Created by andreymi on 2/27/2017.
 */
public class FinalMethodsAndClassesExample {
    // In addition to final variables - methods and classes can be final.
    // final in case of methods - means method cannot be overriden.
    static class A {
        final int getValue() {
            return 1;
        }
    }

    static class B extends A {
        // lines below will give you an error. Uncomment and check.
        //  @Override
        //  int getValue() {
        //     return 1;
        //  }
    }

    // in this case - final methods cannot be abstract (forced to override) and interface methods.
    static abstract class C {
        // line below will  give you error.
        //abstract final int getValue();
    }

    //
    // Classes are also can be final - this means they cannot be extended.
    // Examples in java: String, BigDecimal, Integer, Long, ZonedDateTime (java8) and much more.
    static final class D {
        int value = 10;

        public int getValue() {
            return value;
        }
    }
    // Next statement will give you an error.
    // static class E extends D {
    //
    //}
    //
    // Final class or method mostly means that this is final version and you can just accept it :)

    public static void main(String[] args) {
        System.out.println(new B().getValue());
    }
}
