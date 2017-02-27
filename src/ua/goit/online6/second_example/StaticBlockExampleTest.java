package ua.goit.online6.second_example;

/**
 * Created by andreymi on 2/26/2017.
 */
public class StaticBlockExampleTest {
    // method main is also static - so that java can execute without StaticBlockExampleTest instance creation
    public static void main(String[] args) {
        StaticBlockExample example = new StaticBlockExample();
        System.out.println(example.getValue());
        System.out.println(StaticBlockExample.getaInt());
        // as you see both of them are referenced same static variable.
    }
}
