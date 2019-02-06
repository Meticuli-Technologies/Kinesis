package com.meti.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 2/5/2019
 */
class CapsuleTest {
    @Test
    void equals() {
        Capsule<String> capsule0 = new Capsule<>(false, "test");
        Capsule<String> capsule1 = new Capsule<>(false, "test");
        assertEquals(capsule0, capsule1);
    }

    @Test
    void construct() {
        Capsule<Object> capsule = new Capsule<>();
        assertTrue(capsule.modifiable);
        assertNull(capsule.content);
    }

    @Test
    void constructWithoutInitial() {
        Capsule<Object> capsule = new Capsule<>(true);
        assertTrue(capsule.modifiable);
        assertNull(capsule.content);
    }

    @Test
    void constructWithInitial() {
        Capsule<String> capsule = new Capsule<>(true, "test");
        assertTrue(capsule.modifiable);
        assertEquals("test", capsule.content);
    }

    @Test
    void isModifiable() {
        Capsule<Object> falseCapsule = new Capsule<>(false);
        assertFalse(falseCapsule.isModifiable());

        Capsule<Object> trueCapsule = new Capsule<>(true);
        assertTrue(trueCapsule.isModifiable());
    }

    @Test
    void getContent() {
        Capsule<String> capsule = new Capsule<>(false, "test");
        assertEquals("test", capsule.getContent());
    }

    @Test
    void setContentModifiable() {
        Capsule<String> capsule = new Capsule<>(true, "test0");
        String previous = capsule.setContent("test1");

        assertEquals("test0", previous);
        assertEquals("test1", capsule.content);
    }

    @Test
    void setContentUnmodifiable() {
        Capsule<Object> capsule = new Capsule<>(false);
        assertThrows(IllegalStateException.class, () -> capsule.setContent(null));
    }
}