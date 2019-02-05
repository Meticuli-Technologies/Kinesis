package com.meti.util;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 2/5/2019
 */
public class Capsule<T> {
    private final boolean modifiable;
    private T content;

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
}
