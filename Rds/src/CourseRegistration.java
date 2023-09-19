import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CourseRegistration extends JFrame{

    private LinkedList<Course> courseList = new LinkedList<Course>();
    private HashMap<String, Course> courseMap = new HashMap<String, Course>();

    public CourseRegistration(String windowTitle) {
        super(windowTitle);
        courseMap.put("CSE115", new Course("CSE115", "Programming in C", 1,3.0));
        courseMap.put("CSE115L", new Course("CSE115L", "Programming in C",1,1.0 ));
        courseMap.put("CSE173", new Course("CSE173", "Discrete Mathmatics",1,3.0 ));
        courseMap.put("CSE215", new Course("CSE215", "Programming in Java",1,3.0));
        courseMap.put("CSE215L", new Course("CSE215L", "Programming in Java",1,3.0));
    }

    public void createUI() {
        this.setSize(520, 500);
        this.setLayout(null);

        JLabel label1 = new JLabel("ID: ");
        JLabel label2 = new JLabel("Courses: ");
        JLabel label3= new JLabel("Section");


        label1.setBounds(20, 20, 70, 30);
        label2.setBounds(20, 60, 70, 30);
        label3.setBounds(20, 100, 70, 30);

        JTextField txtID = new JTextField();
        JComboBox<String> cmbxCourse = new JComboBox<String>();

        txtID.setBounds(90, 20, 120, 30);
        cmbxCourse.setBounds(90, 60, 120, 30);
        cmbxCourse.addItem("CSE115");
        cmbxCourse.addItem("CSE115L");
        cmbxCourse.addItem("CSE173");
        cmbxCourse.addItem("CSE215");
        cmbxCourse.addItem("CSE215L");

        cmbxCourse.setSelectedItem(null);


        JTextField sec = new JTextField();
        JComboBox<String> cmbxCourse2 = new JComboBox<String>();



        cmbxCourse2.setBounds(90, 100, 120, 30);
        cmbxCourse2.addItem("1");
        cmbxCourse2.addItem("2");
        cmbxCourse2.addItem("3");
        cmbxCourse2.addItem("4");
        cmbxCourse2.addItem("5");
        cmbxCourse2.addItem("6");
        cmbxCourse2.addItem("7");
        cmbxCourse2.addItem("8");

        cmbxCourse2.setSelectedItem(null);

        JButton btnAdd = new JButton("Add");
        JButton btnSave = new JButton("Save");
        JButton btnrmv = new JButton("Remove");


        btnAdd.setBounds(250, 60, 70, 30);
        btnSave.setBounds(130, 310, 70, 30);
        btnrmv.setBounds(220,310,100,30);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("SL");
        model.addColumn("ID");
        model.addColumn("Title");
        model.addColumn("Section");
        model.addColumn("Credit");
        model.addColumn("Saved?");

        JTable table = new JTable(model);

        table.getTableHeader().setReorderingAllowed(false);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        table.getColumnModel().getColumn(0).setPreferredWidth(52);
        table.getColumnModel().getColumn(1).setPreferredWidth(80);
        table.getColumnModel().getColumn(2).setPreferredWidth(125);
        table.getColumnModel().getColumn(3).setPreferredWidth(70);
        table.getColumnModel().getColumn(4).setPreferredWidth(70);
        table.getColumnModel().getColumn(5).setPreferredWidth(50);

        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(20, 150, 465, 150);

        this.add(label1);
        this.add(label2);
        this.add(txtID);
        this.add(cmbxCourse);
        this.add(btnAdd);
        this.add(sp);
        this.add(btnSave);
        this.add(label3);
        this.add(cmbxCourse2);
        this.add(btnrmv);

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String course = (String)cmbxCourse.getSelectedItem();
                double section = Double.parseDouble((String)cmbxCourse2.getSelectedItem());
                Course c = courseMap.get(course);
                c.setSection(section);
                courseList.add(c);
                model.addRow(new Object[] {courseList.size(), c.getID(), c.getTitle(), c.getSection(), c.getCredit(), "No"});
            }
        });

        btnrmv.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                int index = table.getSelectedRow();
                courseList.remove(index);
                model.removeRow(index);

                for (int i=0;i<courseList.size();i++){
                    model.setValueAt(i+1,i,0);
                }
            }
        });

        btnSave.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                File file= new File("courses.txt");
                FileWriter fr;
                try {
                    fr = new FileWriter(file, false);
                    fr.write("UserID: " + txtID.getText() + "\n");
                    for(Course c : courseList){
                        fr.write(c.getID() + " " + c.getTitle() + " " + c.getSection() + " " + c.getCredit() + "\n");
                    }
                    fr.close();
                    for (int i = 0; i < courseList.size(); i++) {
                        model.setValueAt("Yes", i, 5);
                    }
                }
                catch(IOException e1){
                    System.out.println("Error");
                }
            }
        });


        this.setVisible(true);
    }
}