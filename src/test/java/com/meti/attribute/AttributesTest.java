package com.meti.attribute;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 2/5/2019
 */
class AttributesTest {

    @Test
    void byKey() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute(false, "test");
        assertTrue(attributes.add(attribute));

        Collection<Attribute> test = attributes.byKey("test");
        assertEquals(1, test.size());
        assertTrue(test.contains(attribute));
    }
}