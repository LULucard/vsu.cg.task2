import java.awt.*;
import java.awt.geom.Arc2D;

public class CircleArc {
    int x = 0;
    int y = 0;
    int radius = 0;
    int arcAngle = 0;

    public CircleArc(int x, int y, int radius, int arcAngle) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.arcAngle = arcAngle;
    }

    public static void drawInterpolatedArc(
            final CircleArc arc,
            final Color startColor,
            final Color endColor,
            final int startAngle,
            Graphics gr
    ) {
        Graphics2D g = (Graphics2D) gr;

        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        GradientPaint gradient = new GradientPaint(
                arc.x - arc.radius, arc.y, startColor,
                arc.x + arc.radius, arc.y, endColor
        );

        g.setPaint(gradient);

        g.draw(new Arc2D.Double(
                arc.x - arc.radius, arc.y - arc.radius,
                arc.radius * 2, arc.radius * 2,
                startAngle, arc.arcAngle,
                Arc2D.OPEN
        ));
    }
}
