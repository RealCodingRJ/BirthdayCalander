import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Window extends JFrame {
    public Window() {

        super("Birthday Days Left");
        SwingUtilities.invokeLater(() -> {

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(new Dimension(300, 600));

            GregorianCalendar cale = new GregorianCalendar();
            Dates d = new Dates();
            int day = d.Sub(11, cale.get(Calendar.MONTH));
            int Month = d.Sub(17, cale.get(Calendar.DATE));

            JLabel label = getJLabel(day, Month);
            setResizable(false);
            getContentPane().setBackground(new Color(20, 20, 20));

            label.setForeground(new Color(255, 255, 255));
            add(label);

        });
    }
}

void main () {

    Window n = new Window();
    n.setVisible(true);
}

private JLabel getJLabel(int day, int Month) {
    var text = (day + 1) - Month + " Days";
    JLabel label = new JLabel("Your Birthday is in: " + text, SwingConstants.CENTER);

    JFrame frame = new JFrame("Birthday Days Left");

    if ((day + 1) - Month == 17) {

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Happy Birthday");
                frame.setBackground(new Color(255, 0, 0));
                super.mouseClicked(e);
            }
        });

    }

    return label;
}
