package ua.goit.online6.fourth_example;

/**
 * This example is about static nested classes.
 *
 * @author andreymi
 * @since 2/26/2017.
 */
public class StaticClassExample {
    // Before this module we create each class in separate file.
    // Every file with ending .java should have class definition inside.
    // But there is also possibility to create nested classes.
    private class NestedClassA {
        int value;

        // nested classes can use variables of wrap class.
        public void initValue() {
            value = globalX;
        }
    }
    // Nested class can have any visibility modifier
    protected class NestedClassB {
        int value;

        // and can also use methods.
        // to call came method you should use  StaticClassExample.this.*
        @Override
        public String toString() {
            return StaticClassExample.this.toString();
        }

        // you should also play with shading....
        private int globalX;
        void printValues() {
            // as was in example above you can access top level class via StaticClassExample.this.* mechanism.
            System.out.println(globalX +  ": " + StaticClassExample.this.globalX);
        }
    }
    // Each nested class can be object scope and class scope.
    // Class scope nested classes are static classes.
    private static class NestedClassC {
        int value;
        // static nested classes cannot use class variables or methods while it is in class scope.
    }
    // Why needed? For example want to create temporary internal structure
    // and want to use it locally but do not want to expose it outside.
    // Examples: java.util.Collections, java.util.Arrays
    private int globalX;
    private NestedClassA classA;
    private NestedClassB classB;
    private NestedClassC classC;

    public StaticClassExample(int globalX) {
        this.globalX = globalX;
        this.classA = new NestedClassA();
        this.classB = new NestedClassB();
        this.classC = new NestedClassC();
    }

    // to create non-static nested classes must have link to object to create. (looks strange right? :) )
    public static StaticClassExample createObject(int value) {
        StaticClassExample example = new StaticClassExample(value);
        example.classA = example.new NestedClassA();
        example.classA.initValue();
        example.classB = example.new NestedClassB();
        return example;
    }

    public void printA() {
        System.out.println(classA.value);
    }
    public void printB() {
        classB.printValues();
    }
}
