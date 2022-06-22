package com.exzray;

import com.exzray.configuration.BeanConfig;
import com.exzray.model.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        ShoppingCart cart = context.getBean(ShoppingCart.class);
        cart.checkout("PENDING");
        int quantity = cart.quantity();
    }

}
