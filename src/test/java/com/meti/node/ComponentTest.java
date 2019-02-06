package com.meti.node;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 2/5/2019
 */
class ComponentTest {

    @Test
    void getAttributes() {
        assertNotNull(new Component().getAttributes());
    }
}