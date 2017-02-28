package ua.goit.online6.first_example;

/**
 * Created by andreymi on 2/26/2017.
 */
public class StaticVariableApp {

    public static void main(String[] args) {
        StaticVariableExample.setValue(1);
        // As mentioned before we can assign static variables to class directly
        StaticVariableExample.intValue = 5;
        System.out.println(new StaticVariableExample());
        System.out.println(new StaticVariableExample());
        System.out.println(new StaticVariableExample());
        // as you see each time we create variable of type StaticVariableExample it will reuse same
        // variable value - 5
        StaticVariableExample.intValue = 7;
        System.out.println(new StaticVariableExample());
        System.out.println(new StaticVariableExample());
        //

    }
}
