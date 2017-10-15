package ru.ezhov.dictionary.util;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.logging.Logger;

/**
 *
 * @author ezhov_da
 */
public class LocatedComponent
{
    private static final Logger LOG = Logger.getLogger(LocatedComponent.class.getName());

    public static void locatedInTheCorner(Component component)
    {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Rectangle rect = ge.getMaximumWindowBounds();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        if (rect.getHeight() < screenSize.height & rect.y != 0)
        {
            LOG.info("location component: UP");
            component.setLocation(screenSize.width - component.getWidth(), rect.y);
        } else if (rect.getHeight() < screenSize.height & rect.y == 0)
        {
            LOG.info("location component: DOWN");
            component.setLocation(screenSize.width - component.getWidth(), rect.height - component.getHeight());
        } else if (rect.getWidth() < screenSize.width & rect.x == 0)
        {
            LOG.info("location component: RIGHT");
            component.setLocation(rect.width - component.getWidth(), screenSize.height - component.getHeight());
        } else if (rect.getWidth() < screenSize.width & rect.x != 0)
        {
            LOG.info("location component: LEFT");
            component.setLocation(rect.x, screenSize.height - component.getHeight());
        }
    }
}
