package com.window.admin.teacher;

import com.window.admin.Menu;
import com.window.admin.student.DeleteStudent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherMenu {
    private JFrame jFrame;
    private JPanel jPanel;
    private GridLayout layout;
    private JButton add;
    private JButton delete;
    private JButton update;
    private JButton getAll;
    private JButton breaks;
    private JButton CourseDate;

    public void show(){
        jFrame = new JFrame();
        jFrame.setBounds(400,100,500,300);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel(){
        layout = new GridLayout(5, 1);
        jPanel = new JPanel(layout);

        add = new JButton("Register New");
        jPanel.add(add);
        add.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddTeacher().show();
            }
        });

        delete = new JButton("Delete Info");
        jPanel.add(delete);
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DeleteTeacher().show();
            }
        });
        delete.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DeleteStudent();
            }
        });
        update = new JButton("Update Info");
        jPanel.add(update);
        update.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UpdateTeacher().show();
            }
        });
        getAll = new JButton("Search for A Tutor");
        jPanel.add(getAll);
        getAll.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TutorInfoTable().show();
            }
        });
        breaks = new JButton("Return");
        jPanel.add(breaks);
        breaks.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu().show();
                jFrame.setVisible(false);
            }
        });
        CourseDate = new JButton("Course Selection");
        jPanel.add(CourseDate);
        CourseDate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CourseDate().show();
            }
        });
        return jPanel;
    }
}


