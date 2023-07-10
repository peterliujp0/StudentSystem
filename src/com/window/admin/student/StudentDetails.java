package com.window.admin.student;

import com.achieve.student.StudentInformationsql;

import javax.swing.*;

public class StudentDetails {
    private JFrame jFrame;
    private JPanel jPanel;
    private Object[] heard = new Object[]{"ID","Name","Sex","Course","Date","Password"};
    private JTable table;
    private JScrollPane jScrollPane;

    public void show(){
        jFrame = new JFrame("Info Table");
        jFrame.setBounds(500,100,500,500);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel(){
        jPanel = new JPanel(null);
        Object [][]data = new Object[99][6];
        StudentInformationsql.studata = data;
        StudentInformationsql.getAll();
        table = new JTable(StudentInformationsql.studata,heard);
        jScrollPane = new JScrollPane(table);
        jScrollPane.setBounds(0,0,500,500);
        jPanel.add(jScrollPane);
        return jPanel;
    }
}
