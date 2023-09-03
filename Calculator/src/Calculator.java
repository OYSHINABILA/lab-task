import sun.awt.windows.WFontConfiguration;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator {
    public static String s;
    private static int mod=0;
    private static double ans=0;
    private static boolean sch=true;

    public static void main(String[] args) {



        Color c1 = new Color(245, 157, 127);
        Color c2 = new Color(38, 35, 34);
        Color c3 = new Color(181, 178, 168);

        Font f1 = new Font(null, 0, 32);
        Font f2 = new Font(null, 0, 20);
        Font f3 = new Font(null, Font.BOLD, 20);
        Font f4 = new Font(null, Font.BOLD, 8);


        JFrame frame = new JFrame( "CALCULATOR");
        frame.setSize(275, 465);
        frame.getContentPane().setBackground(c2);
        frame.getColorModel();
        frame.setLayout(null);


        JTextField tf = new JTextField();
        tf.setBounds(0, 0, 260, 100);
        tf.setBackground(Color.darkGray);
        tf.setForeground(c3);
        tf.setFont(f1);
        tf.setBorder(BorderFactory.createLineBorder(Color.white, 5));
        tf.setText(0+"");




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

        b1.setFont(f2);
        b2.setFont(f2);
        b3.setFont(f2);
        b4.setFont(f2);
        b5.setFont(f2);
        b6.setFont(f2);
        b7.setFont(f2);
        b8.setFont(f2);
        b9.setFont(f2);
        b0.setFont(f2);
        bans.setFont(f4);

        b1.setForeground(Color.BLACK);
        b2.setForeground(Color.BLACK);
        b3.setForeground(Color.BLACK);
        b4.setForeground(Color.BLACK);




        bclear.setBounds(0,100,65,65);
        baddsub.setBounds(65,100,65,65);
        bper.setBounds(130,100,65,65);
        bdiv.setBounds(195,100,65,65);
        b7.setBounds(0,165,65,65);
        b8.setBounds(65,165,65,65);
        b9.setBounds(130,165,65,65);
        bmulti.setBounds(195,165,65,65);
        b4.setBounds(0,230,65,65);
        b5.setBounds(65,230,65,65);
        b6.setBounds(130,230,65,65);
        bsub.setBounds(195,230,65,65);
        b1.setBounds(0,295,65,65);
        b2.setBounds(65,295,65,65);
        b3.setBounds(130,295,65,65);
        badd.setBounds(195,295,65,65);
        b0.setBounds(0,360,65,65);
        bdot.setBounds(65,360,65,65);
        bans.setBounds(130,360,65,65);
        bequ.setBounds(195,360,65,65);

        badd.setBackground(c1);
        b1.setBackground(c3);
        bsub.setBackground(c1);
        b2.setBackground(c3);
        bmulti.setBackground(c1);
        b3.setBackground(c3);
        baddsub.setBackground(c1);
        b4.setBackground(c3);
        b5.setBackground(c3);
        b6.setBackground(c3);
        b7.setBackground(c3);
        b8.setBackground(c3);
        b9.setBackground(c3);
        b0.setBackground(c3);
        bdiv.setBackground(c1);
        bclear.setBackground(c1);
        bper.setBackground(c1);
        bequ.setBackground(c1);
        bdot.setBackground(c3);
        bans.setBackground(c3);





        frame.add(badd);
        frame.add(baddsub);
        frame.add(bsub);
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
        frame.add(tf);

        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (sch){
                    tf.setText("");
                    sch=false;
                }
                s=tf.getText();
                tf.setText(s +"1");

            }
        });
        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (sch){
                    tf.setText("");
                    sch=false;
                }
                s=tf.getText();
                tf.setText(s +"2");

            }
        });
        b3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (sch){
                    tf.setText("");
                    sch=false;
                }
                s=tf.getText();
                tf.setText(s +"3");

            }
        });
        b4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (sch){
                    tf.setText("");
                    sch=false;
                }
                s=tf.getText();
                tf.setText(s +"4");

            }
        });
        b5.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {
                if (sch){
                    tf.setText("");
                    sch=false;
                }
                s=tf.getText();
                tf.setText(s +"5");

            }
        });
        b6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (sch){
                    tf.setText("");
                    sch=false;
                }
                s=tf.getText();
                tf.setText(s +"6");

            }
        });
        b7.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (sch){
                    tf.setText("");
                    sch=false;
                }
                s=tf.getText();
                tf.setText(s +"7");

            }
        });
        b8.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (sch){
                    tf.setText("");
                    sch=false;
                }
                s=tf.getText();
                tf.setText(s +"8");

            }
        });
        b9.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (sch){
                    tf.setText("");
                    sch=false;
                }
                s=tf.getText();
                tf.setText(s +"9");

            }
        });
        b0.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (sch){
                    tf.setText("");
                    sch=false;
                }
                s=tf.getText();
                tf.setText(s +"0");

            }
        });
        badd.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                s=tf.getText();
                Modifier(s,mod);
                tf.setText(ans+"");
                mod=1;
            }
        });
        bsub.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                s=tf.getText();
                Modifier(s,mod);
                tf.setText(ans+"");
                mod=2;
            }
        });
        bmulti.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                s=tf.getText();
                Modifier(s,mod);
                tf.setText(ans+"");
                mod=3;
            }
        });
        bdiv.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                s=tf.getText();
                Modifier(s,mod);
                tf.setText(ans+"");
                mod=4;
            }
        });
        bequ.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                s=tf.getText();
                Modifier(s,mod);
                tf.setText(ans+"");
                mod=0;

            }
        });
        bclear.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });
        bdot.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (sch){
                    tf.setText("");
                    sch=false;
                }
                s=tf.getText();
                tf.setText(s +".");


            }
        });
        bclear.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                ans=0;
                mod=0;
                sch=true;
            }
        });























        frame.setVisible(true);

    }
    public static void Modifier(String s, int mod){
        double a= Double.parseDouble(s);

        if(mod==1)
        {
            ans+=a;

        }
        else if (mod==2)
        {
            ans-=a;

        }
        else if (mod==3)
        {
            ans*=a;
        }
        else if (mod==4)
        {
            ans/=a;
        } else if (mod==0) {
            ans=a;

        }
        sch=true;

    }

}
