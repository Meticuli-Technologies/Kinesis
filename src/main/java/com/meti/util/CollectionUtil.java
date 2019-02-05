package com.meti.util;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 2/5/2019
 */
public class CollectionUtil {
    private CollectionUtil() {
    }

    public static <T> T toSingle(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException(collection + " is empty!");
        }

        if (collection.size() > 1) {
            throw new IllegalArgumentException(collection + " has too many items!");
        }

        return new ArrayList<>(collection).get(0);
    }
}
