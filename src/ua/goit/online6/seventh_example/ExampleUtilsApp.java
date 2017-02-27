package ua.goit.online6.seventh_example;

// also you can do static imports : to import static varible or method.
import static ua.goit.online6.seventh_example.ExampleUtils.max;

/**
 * Created by andreymi on 2/27/2017.
 */
public class ExampleUtilsApp {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(ExampleUtils.sum(array));
        System.out.println(max(array));
    }
}
