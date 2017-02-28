package ua.goit.online6.fourth_example;

/**
 * Created by andreymi on 2/26/2017.
 */
public class StaticClassExampleApp {
    public static class A implements NestedElementsExample.NestedInterfaceA {
        @Override
        public int getVariable() {
            return -1;
        }
    }

    public static class B implements NestedElementsExample.NestedInterfaceA.NestedNestedInterfaceB {

    }

    public static class C implements NestedElementsExample.NestedInterfaceA.NestedNestedInterfaceB.NestedNestedInterfaceC {

    }
    // cool huh? :)

    public static void main(String[] args) {
        // static classes can be accessed from top level class.s
        StaticClassExample.NestedClassB testClassB;

        A a = new A();
        System.out.println(a.getVariable());

        //
        //Calendar calendar = Calendar.getInstance();
        //LocalDateTime time = LocalDateTime.now();
        //Integer integer = Integer.valueOf(1);

        StaticClassExample example = StaticClassExample.createObject(10);
        example.printA();
        example.printB();
    }
}
