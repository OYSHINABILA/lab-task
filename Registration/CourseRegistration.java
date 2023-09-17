package Registration;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CourseRegistration extends JFrame{

    private LinkedList<Course> courseList = new LinkedList<Course>();
    private HashMap<String, Course> courseMap = new HashMap<String, Course>();

    public CourseRegistration(String windowTitle) {
        super(windowTitle);
        courseMap.put("CSE115", new Course("CSE115", "Programming in C", 3.0));
        courseMap.put("CSE115L", new Course("CSE115L", "Programming in C", 1.0));
        courseMap.put("CSE173", new Course("CSE173", "Discrete Mathmatics", 3.0));
        courseMap.put("CSE215", new Course("CSE215", "Programming in Java", 3.0));
        courseMap.put("CSE215L", new Course("CSE215L", "Programming in Java", 1.0));
    }

    public void createUI() {
        this.setSize(500, 500);
        this.setLayout(null);

        JLabel label1 = new JLabel("ID: ");
        JLabel label2 = new JLabel("Courses: ");

        label1.setBounds(20, 20, 70, 30);
        label2.setBounds(20, 60, 70, 30);

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

        JButton btnAdd = new JButton("Add");
        JButton btnSave = new JButton("Save");

        btnAdd.setBounds(230, 60, 70, 30);
        btnSave.setBounds(130, 280, 70, 30);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("SL");
        model.addColumn("ID");
        model.addColumn("Title");
        model.addColumn("Credit");

        JTable table = new JTable(model);

        table.getTableHeader().setReorderingAllowed(false);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        table.getColumnModel().getColumn(0).setPreferredWidth(40);
        table.getColumnModel().getColumn(1).setPreferredWidth(70);
        table.getColumnModel().getColumn(2).setPreferredWidth(200);
        table.getColumnModel().getColumn(3).setPreferredWidth(60);

        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(20, 110, 375, 150);

        this.add(label1);
        this.add(label2);
        this.add(txtID);
        this.add(cmbxCourse);
        this.add(btnAdd);
        this.add(sp);
        this.add(btnSave);

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String course = (String)cmbxCourse.getSelectedItem();
                Course c = courseMap.get(course);
                courseList.add(c);
                model.addRow(new Object[] {courseList.size(), c.getID(), c.getTitle(), c.getCredit()});
            }
        });

        this.setVisible(true);
    }
}