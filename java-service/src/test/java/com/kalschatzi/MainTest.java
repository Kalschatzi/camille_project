package com.kalschatzi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void TestStaticMethod() {
        assertEquals(Main.StaticMethod(), Main.STATIC_STRING);
    }

}