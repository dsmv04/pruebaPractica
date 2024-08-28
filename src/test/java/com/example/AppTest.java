package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    private final App app = new App();

    @Test
    public void testSum() {
        assertEquals(5, app.sum(2, 3));
    }

    @Test
    public void testIsPositive() {
        assertTrue(app.isPositive(5));
    }
}
