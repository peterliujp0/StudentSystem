package com.window.admin.teacher;

import com.achieve.teacher.TeacherInformationsql;

import javax.swing.*;

public class TutorInfoTable {
    private JFrame jFrame;
    private JPanel jPanel;
    private Object[] heard = new Object[]{"ID","Name","Course","Sex","Contact Number","Password"};
    private JTable table;
    private JScrollPane jScrollPane;

    public void show(){
        jFrame = new JFrame("Search");
        jFrame.setBounds(500,100,500,500);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel(){
        jPanel = new JPanel(null);
        Object [][]data = new Object[99][6];
        TeacherInformationsql.teadata = data;
        TeacherInformationsql.getAll();
        table = new JTable(TeacherInformationsql.teadata,heard);
        jScrollPane = new JScrollPane(table);
        jScrollPane.setBounds(0,0,500,500);
        jPanel.add(jScrollPane);
        return jPanel;
    }
}

