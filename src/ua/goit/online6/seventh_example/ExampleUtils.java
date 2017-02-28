package ua.goit.online6.seventh_example;

/**
 * Static final combinations usages.
 * <p>
 * Created by andreymi on 2/27/2017.
 */
public final class ExampleUtils {
    // This is normal use case when you want to create class that just holds utility methods.
    // This class should have only methods with final code version: so every method should be final.
    // Or this class must be final - because normally no-one will extend utility class.
    // As class do not hold any state - all his methods will be static.

    // As long as class is final - all his methods are impliciply final.
    public static int sum(int[] array) {
        int sum = 0;
        for (int val : array) {
            sum += val;
        }
        return sum;
    }
    // This is also possible, but final keyword is redundant because noone can extend you class.
    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int val : array) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    private ExampleUtils() {

    }

}
