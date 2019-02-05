package com.meti.attribute;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 2/5/2019
 */
public class Attributes extends HashSet<Attribute> {
    public Collection<Attribute> byKey(Object key) {
        return stream()
                .filter(attribute -> attribute.key.equals(key))
                .collect(Collectors.toSet());
    }
}
