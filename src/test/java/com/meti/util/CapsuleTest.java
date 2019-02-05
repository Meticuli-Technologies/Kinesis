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
    void construct() {
        Capsule<Object> capsule = new Capsule<>();
        assertEquals(false, capsule.modifiable);
        assertEquals(null, capsule.content);
    }

    @Test
    void constructWithoutInitial() {
        Capsule<Object> capsule = new Capsule<>(true);
        assertEquals(true, capsule.modifiable);
        assertEquals(null, capsule.content);
    }

    @Test
    void constructWithInitial() {
        Capsule<String> capsule = new Capsule<>(true, "test");
        assertEquals(true, capsule.modifiable);
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
        Capsule<Object> capsule = new Capsule<>();
        assertThrows(IllegalStateException.class, () -> capsule.setContent(null));
    }
}