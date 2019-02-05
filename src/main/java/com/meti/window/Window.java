package com.meti.window;

import com.meti.attribute.Attribute;
import com.meti.node.Component;

import static com.meti.window.WindowKey.*;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 2/5/2019
 */
public abstract class Window extends Component {
    public Window(String title,
                  int initialWidth,
                  int initialHeight,
                  int initialX,
                  int initialY) {

        attributes.add(new Attribute(true, title, TITLE));
        attributes.add(new Attribute(true, initialWidth, WIDTH));
        attributes.add(new Attribute(true, initialHeight, HEIGHT));
        attributes.add(new Attribute(true, initialX, X));
        attributes.add(new Attribute(true, initialY, Y));
    }
}
