package com.meti.attribute;

import com.meti.util.Capsule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 2/5/2019
 */
class AttributeTest {
    @Test
    void constructWithInitialContent() {
        Attribute attribute = new Attribute(false, "test0", "test1");

        assertEquals(new Capsule<>(false, "test0"), attribute.value);
        assertEquals("test1", attribute.key);
    }

    @Test
    void constructWithoutInitialContent() {
        Attribute attribute = new Attribute(false, "test");

        assertEquals(new Capsule<>(false, null), attribute.value);
        assertEquals("test", attribute.key);
    }
}