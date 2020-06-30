package com.kris.ordermanagement.bootstrap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Value("${order-management.send-notification}")
    private boolean sendNotification;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(" The value of send notification is " + sendNotification);
    }
}
