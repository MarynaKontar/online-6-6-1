package ua.goit.online6.fourth_example;

/**
 * Created by andreymi on 2/28/2017.
 */
public class TestIntUtils {
    private static class TestIntImpl implements TestInt {
        @Override
        public int getValue() {
            return -1;
        }
    }

    public static TestInt getTestInt() {
        return new TestIntImpl();
    }

    public static void main(String[] args) {
        TestInt val = getTestInt();
        System.out.println(val.getValue());
    }
}
