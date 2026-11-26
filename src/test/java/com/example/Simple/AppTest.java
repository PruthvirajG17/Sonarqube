package com.example.Simple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    App app = new App();

    @Test
    void testAdd() {
        assertEquals(11, app.add(5, 6));
    }

    @Test
    void testSub() {
        assertEquals(4, app.sub(10, 6));
    }
}