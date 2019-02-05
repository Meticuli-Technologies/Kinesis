package com.meti.node;

import com.meti.attribute.Attributes;
import com.meti.util.Distinct;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 2/5/2019
 */
public class Component implements Distinct {
    protected final Attributes attributes = new Attributes();

    @Override
    public Attributes getAttributes() {
        return attributes;
    }
}
