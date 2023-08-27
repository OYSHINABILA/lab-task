
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Gui {


    public static void main(String[] args) {
// TODO Auto-generated method stub
        JFrame frame = new JFrame("My First GUI");
        frame.setLayout(null);
//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);

        JLabel l1 = new JLabel("Number 1: ");
        l1.setBounds(20, 20, 80, 20);
        frame.add(l1);
        JTextField txt1 = new JTextField();
        txt1.setBounds(110, 20, 200, 20);
        frame.add(txt1);
        JLabel l2 = new JLabel("Number 2: ");
        l2.setBounds(20, 60, 80, 20);
        frame.add(l2);
        JTextField txt2 = new JTextField();
        txt2.setBounds(110, 60, 200, 20);
        frame.add(txt2);
        JButton b1 = new JButton("Add");
        b1.setBounds(110, 100, 80, 40);

        frame.add(b1);
        frame.setVisible(true);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int val1 = Integer.parseInt(txt1.getText());
                int val2 = Integer.parseInt(txt2.getText());
               int sum=val1+val2;
                JOptionPane.showMessageDialog(null, "Result"+sum);
            }
        });
    }
}