import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle Arc Interpolated");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(new MainWindow());
        frame.pack();
        frame.setVisible(true);
    }
}
