package builder;

import reference.Stack;

import java.util.Arrays;

import static builder.NyPizza.Size.SMALL;
import static builder.Pizza.Topping.*;

public class ApplicationBuilder {

    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();

        Stack stack = new Stack();
        stack.push(pizza);
        stack.push(calzone);
        System.out.println(stack.peek());
        System.out.println(Arrays.toString(stack.toArray()));
    }
}
