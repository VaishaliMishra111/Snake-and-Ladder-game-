import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*public class AutomaticButtonClick {
    private JButton button1;
    private JButton button2;

    public AutomaticButtonClick() {
        JFrame frame = new JFrame("Automatic Button Click");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform actions for Button 1
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform actions for Button 2
            }
        });

        panel.add(button1);
        panel.add(button2);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        // Automatically click Button 2 after a delay
        int delay = 2000; // Delay in milliseconds (2 seconds)
        Timer timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2.doClick();
            }
        });
        timer.setRepeats(false); // Only trigger the click once
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AutomaticButtonClick();
            }
        });
    }
}
*/