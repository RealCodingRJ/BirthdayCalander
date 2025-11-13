import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;

void main() {

    JFrame frame = new JFrame("Birthday Day Time Zone");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(new Dimension(300, 600));

    GregorianCalendar cale = new GregorianCalendar();
    Dates d = new Dates();
    int day = d.Sub(11, cale.get(Calendar.MONTH));
    int Month = d.Sub(17, cale.get(Calendar.DATE));

    var text = (day + 1) - Month + " Days";
    JLabel label = new JLabel("Your Birthday is in: " + text, SwingConstants.CENTER);
    label.setForeground(new Color(255, 255, 255));
    frame.getContentPane().setBackground(new Color(20, 20, 20));

    if ((day + 1) - Month == 17) {

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Happy Birthday");
                frame.getContentPane().setBackground(new Color(255, 0,0));
                super.mouseClicked(e);
            }
        });

    }

    frame.add(label, BorderLayout.CENTER);
    frame.setResizable(false);
    frame.setVisible(true);

}

