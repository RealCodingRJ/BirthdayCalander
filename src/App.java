import javax.swing.*;
import java.awt.*;

void main() {

    JFrame frame = new JFrame("Birthday Day Time Zone");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(new Dimension(300, 600));

    GregorianCalendar cale = new GregorianCalendar();
    Dates d = new Dates();
    int day = d.Sub(11, cale.get(Calendar.MONTH));
    int Month = d.Sub(17, cale.get(Calendar.DATE));

    var text =  (day + 1) - Month + " Days";
    JLabel label = new JLabel("Your Birthday is in: " + text, SwingConstants.CENTER);
    label.setForeground(new Color(255, 255, 255));
    frame.getContentPane().setBackground(new Color(20, 20, 20));

    if ((day + 1) - Month == 17) {

        label = new JLabel("HAPPY BIRTHDAY Man: " + text, SwingConstants.CENTER);
    }

    frame.add(label, BorderLayout.CENTER);
    frame.setResizable(false);
    frame.setVisible(true);
}

