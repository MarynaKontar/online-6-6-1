package ua.goit.online6.fourth_example;

/**
 * Example of more nested elements.
 *
 * @author andreymi on 2/26/2017.
 */
public class NestedElementsExample {
    // you can create tested enums: nested enums are always static
    private enum NestedEnum {
        A, B, C
    }
    // as enums nested interfaces are also always static
    public interface NestedInterfaceA {
        // and can create even more nested.
        // REMEMBER. Nested interfaces of interfaces are always public and static.
        interface NestedNestedInterfaceB {
            interface NestedNestedInterfaceC {
                 // TODO.....
                // int ~ 2 ^ 31 - 1
            }
        }
        int getVariable();
    }
}
