package ua.goit.online6.fifth_example;

import java.util.Date;

/**
 * Example class for final variables
 * <p>
 * Created by andreymi on 2/26/2017.
 */
public class FinalVariablesExample {
    // Final variables usually mean - constant, so that it cannot be changed after it was created
    // In java - final variable apply to references. So that final references cannot be changes since it was created.
    private final int value1 = 1;
    // final variables MUST be assigned always. The last option where we can do this - constuctor. After this we cannot
    // assign ant value to final varibles: this called final barrier.
    private final int value2;

    public FinalVariablesExample() {
        this.value2 = 2;
    }

    // final variables applied to static - gives you classic constant: one per application and not modifiable.
    private static final int CONST_1 = 1;
    // static final variables can be assigned in static blocks.
    private static final int CONST_2;

    static {
        CONST_2 = 2;
    }

    // assume we have final variable date - with default constructor it will give us current date.
    private final Date date = new Date();

    // create method that will update the date with one we need.
    public void setDate(Date date) {
        // line below wont give you much success.
        // this.date = date;
        // but next one will...
        this.date.setTime(date.getTime());
        // so even in case variable is final - this only opplies to references, not to the data inside object.
    }

    // so to have fully final variables - object they hold must be immutable: string, numbers, ...
    public Date getDate() {
        return date;
    }
}
