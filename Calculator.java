import javax.swing.JFrame;
import javax.swing.JLabel;

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
        jf.add(displayLabel);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // window colse cheymbo exitavn
    }

    public static void main(String[] args) {
        new Calculator();
    }
}