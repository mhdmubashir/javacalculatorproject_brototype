import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {
    public Calculator() {
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(200, 200);
        JLabel displayLabel = new JLabel("Junu's Calculator");

        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.blue);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);
        // buttons

        JButton sevenButton = new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        jf.add(sevenButton);

        JButton eightButton = new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        jf.add(eightButton);

        JButton nineButton = new JButton("9");
        nineButton.setBounds(30, 130, 80, 80);
        jf.add(nineButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // window colse cheymbo exitavn
    }

    public static void main(String[] args) {
        new Calculator();
    }
}