import javax.swing.*;
import java.awt.*;

public class MainWindow extends JPanel {

    CircleArc taskArc = new CircleArc(400, 300, 100, 150);

    final Color startColor = Color.BLUE;
    final Color endColor = Color.RED;

    public MainWindow() {
        setPreferredSize(new Dimension(800, 600));
    }

    @Override
    protected void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        CircleArc.drawInterpolatedArc(taskArc, startColor, endColor, 0, gr);
    }
}
