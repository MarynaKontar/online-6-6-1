package ua.goit.online6.fifth_example;

import java.util.Date;

/**
 * Created by andreymi on 2/27/2017.
 */
public class FinalVariablesApp {
    public static void main(String[] args) {
        FinalVariablesExample example = new FinalVariablesExample();
        System.out.println(example.getDate());
        // add 10 seconds to current time in millis from 01/01/1970
        example.setDate(new Date(System.currentTimeMillis() + 10_000));
        System.out.println(example.getDate());

    }
}
