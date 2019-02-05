package com.meti.util;

import java.util.Objects;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 2/5/2019
 */
public class Capsule<T> {
    final boolean modifiable;
    T content;

    public Capsule() {
        this(true);
    }

    public Capsule(boolean modifiable) {
        this(modifiable, null);
    }

    public Capsule(boolean modifiable, T content) {
        this.modifiable = modifiable;
        this.content = content;
    }

    public boolean isModifiable() {
        return modifiable;
    }

    public T getContent() {
        return content;
    }

    public T setContent(T content) {
        if (!modifiable) {
            throw new IllegalStateException(this + " is not modifiable.");
        }

        T previousContent = this.content;
        this.content = content;
        return previousContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Capsule<?> capsule = (Capsule<?>) o;
        return modifiable == capsule.modifiable &&
                Objects.equals(content, capsule.content);
    }
}
