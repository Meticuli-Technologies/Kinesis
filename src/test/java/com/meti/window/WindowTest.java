package com.meti.window;

import org.junit.jupiter.api.Test;

import static com.meti.util.CollectionUtil.toSingle;
import static com.meti.window.WindowKey.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 2/5/2019
 */
class WindowTest {
    @Test
    void constructWithAll() {
        Window window = new Window("test", 0, 1, 2, 3) {
        };

        assertEquals("test", toSingle(window.attributes.byKey(TITLE)).value.getContent());
        assertEquals(0, toSingle(window.attributes.byKey(WIDTH)).value.getContent());
        assertEquals(1, toSingle(window.attributes.byKey(HEIGHT)).value.getContent());
        assertEquals(2, toSingle(window.attributes.byKey(X)).value.getContent());
        assertEquals(3, toSingle(window.attributes.byKey(Y)).value.getContent());
    }
}