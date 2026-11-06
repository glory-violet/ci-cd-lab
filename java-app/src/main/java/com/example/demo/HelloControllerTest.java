package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloControllerTest {

    @Test
    void helloReturnsMessage() {
        HelloController controller = new HelloController();
        assertEquals("Hello from the Java CI/CD pipeline!", controller.hello());
    }
}