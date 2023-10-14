import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Calc extends JFrame implements ActionListener{
    JTextField tf1, tf2, tf3;

    Calc () {
        setLayout(new FlowLayout());
        JLabel l1 = new JLabel("First No. : ");
        tf1 = new JTextField(20);

        JLabel l2 = new JLabel("Second No. : ");
        tf2 = new JTextField(20);

        JButton b1 = new JButton("SUM");
        JButton b2 = new JButton("SUB");
        JButton b3 = new JButton("MULTIPLY");
        JButton b4 = new JButton("DIVIDE");

        JLabel l3 = new JLabel("Result : ");
        tf3 = new JTextField(20);

        setLayout(new FlowLayout());
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent E) {
        String S = E.getActionCommand();
        int result = 0;
        if (S.equals("SUM")) {
            result = Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText());
        }
        if (S.equals("SUB")) {
            result = Integer.parseInt(tf1.getText()) - Integer.parseInt(tf2.getText());
        }
        if (S.equals("MULTIPLY")) {
            result = Integer.parseInt(tf1.getText()) * Integer.parseInt(tf2.getText());
        }
        if (S.equals("DIVIDE")) {
            result = Integer.parseInt(tf1.getText()) / Integer.parseInt(tf2.getText());
        }
        tf3.setText(Integer.toString(result));
    }

    public static void main(String[] args) {
        Calc Cal = new Calc();
        Cal.setSize(300, 400);
        Cal.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Cal.setVisible(true);
    }
}