import javax.swing.*;
import java.awt.*;

public class MainWindow extends JPanel {

    // здесь тоже накидали параметры на ротан уже третий раз, ФАкел забивает хеттрик. Можешь с ними поиграть
    // посмотреть че получается, да и вообще во все параметры потыкай, чтобы понимать че делают
    CircleArc taskArc = new CircleArc(400, 300, 100, 150); // Центр в (400, 300), радиус 100, дуга 180°
    // С колорами тоже можно поиграть подзаебаться, но нахуй оно нам надо, как говорится работает не трогай нахуй
    // или прод положишь
    // Но ты просто чилловый джун, который снес прод и бэкап (А потом тебе Сеньор кабину)
    final Color startColor = Color.BLUE;
    final Color endColor = Color.RED;

    public MainWindow() {
        setPreferredSize(new Dimension(800, 600));
    }

    // Вызываем блядский родительский метод, потому что это Джава рот ее наоборот и накидываем параметры
    // для полной отрисовки
    @Override
    protected void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        CircleArc.drawInterpolatedArc(taskArc, startColor, endColor, 0, gr); // Начальный угол 0°
    }
}
