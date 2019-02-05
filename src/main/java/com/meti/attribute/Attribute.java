package com.meti.attribute;

import com.meti.util.Capsule;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 2/5/2019
 */
public class Attribute {
    final Capsule<Object> value;
    final Object key;

    public Attribute(boolean modifiable, Object content, Object key) {
        this.value = new Capsule<>(modifiable, content);
        this.key = key;
    }

    public Attribute(boolean modifiable, Object key) {
        this.value = new Capsule<>(modifiable);
        this.key = key;
    }
}
