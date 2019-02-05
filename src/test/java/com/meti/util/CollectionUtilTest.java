package com.meti.util;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static com.meti.util.CollectionUtil.toSingle;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 2/5/2019
 */
class CollectionUtilTest {

    @Test
    void toSingleZero() {
        //noinspection ResultOfMethodCallIgnored
        assertThrows(IllegalArgumentException.class, () -> toSingle(Collections.emptyList()));
    }

    @Test
    void toSingleOne() {
        String result = toSingle(Collections.singleton("test"));
        assertEquals("test", result);
    }

    @Test
    void toSingleMultiple() {
        //noinspection ResultOfMethodCallIgnored
        assertThrows(IllegalArgumentException.class, () -> toSingle(Arrays.asList("test0", "test1")));
    }
}