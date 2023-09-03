import java.awt.*;

import javax.swing.*;

public class Calculator {

    public static void main(String[] args) {


        Color c1 = new Color(245, 157, 127);
        Color c2 = new Color(38, 35, 34);
        Color c3 = new Color(181, 178, 168);

        Font f1 = new Font(null, 0, 32);
        Font f2 = new Font(null, 0, 20);
        Font f3 = new Font(null, Font.BOLD, 20);

        JFrame frame = new JFrame( "...CALCULATOR...");
        frame.setSize(210, 380);
        frame.getContentPane().setBackground(c2);
        frame.getColorModel();

        JLabel l1 = new JLabel("History");
        l1.setBounds(210, 113, 190, 20);
        l1.setForeground(c1);
        l1.setFont(f2);
        JTextField tf = new JTextField();
        tf.setBounds(0, 0, 410, 100);
        tf.setBackground(Color.darkGray);
        tf.setForeground(c3);
        tf.setFont(f1);
        tf.setBorder(null);
        tf.setText(0 + "");




        JButton bclear=new JButton("AC");
        JButton baddsub=new JButton("±");
        JButton bper=new JButton("%");
        JButton bdiv=new JButton("/");
        JButton bmulti=new JButton("*");
        JButton badd=new JButton("+");
        JButton bsub=new JButton("-");
        JButton bequ=new JButton("=");
        JButton b1= new JButton("1");
        JButton b2= new JButton("2");
        JButton b3= new JButton("3");
        JButton b4= new JButton("4");
        JButton b5= new JButton("5");
        JButton b6= new JButton("6");
        JButton b7= new JButton("7");
        JButton b8= new JButton("8");
        JButton b9= new JButton("9");
        JButton b0= new JButton("0");
        JButton bans=new JButton("Ans");
        JButton bdot=new JButton(".");

        bclear.setBounds(0,100,50,50);
        baddsub.setBounds(50,100,50,50);
        bper.setBounds(100,100,50,50);
        bdiv.setBounds(150,100,50,50);
        b7.setBounds(0,150,50,50);
        b8.setBounds(50,150,50,50);
        b9.setBounds(100,150,50,50);
        bmulti.setBounds(150,150,50,50);
        b4.setBounds(0,200,50,50);
        b5.setBounds(50,200,50,50);
        b6.setBounds(100,200,50,50);
        bsub.setBounds(150,200,50,50);
        b1.setBounds(0,250,50,50);
        b2.setBounds(50,250,50,50);
        b3.setBounds(100,250,50,50);
        badd.setBounds(150,250,50,50);
        b0.setBounds(0,300,50,50);
        bdot.setBounds(50,300,50,50);
        bans.setBounds(100,300,50,50);
        bequ.setBounds(150,300,50,50);


        frame.add(badd);
        frame.add(bdot);
        frame.add(bper);
        frame.add(bdiv);
        frame.add(bans);
        frame.add(bequ);
        frame.add(bmulti);
        frame.add(bclear);
        frame.add(bdot);
        frame.add(b0);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(l1);
        frame.add(tf);
























        frame.setVisible(true);

    }

}