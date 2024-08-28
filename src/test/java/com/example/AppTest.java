package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
