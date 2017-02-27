package ua.goit.online6.third_example;

/**
 * Created by andreymi on 2/26/2017.
 */
public class SingletonExampleApp {
    public static void main(String[] args) {
        System.out.println(SingletonA.getInstance().getValue());
        System.out.println(SingletonA.getInstance().getValue());
        System.out.println(SingletonA.getInstance() ==  SingletonA.getInstance());
        //
        System.out.println(LazySingletonA.getInstance().getValue());
        System.out.println(LazySingletonA.getInstance().getValue());
        System.out.println(LazySingletonA.getInstance() ==  LazySingletonA.getInstance());
    }
}
