package com.window.admin.teacher;

import com.achieve.subjectTable.SubjectTablesql;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseDate {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel subjectTeacher;
    private JTextField subjectTeacherTxt;
    private JLabel data;
    private JTextField dataTxt;
    private JLabel classroom;
    private JTextField classroomTxt;
    private JButton set;

    public void show(){
        jFrame = new JFrame();
        jFrame.setBounds(400,100,500,500);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel(){
        jPanel = new JPanel(null);
        subjectTeacher = new JLabel("Tutor:");
        subjectTeacher.setBounds(30,30,80,30);
        jPanel.add(subjectTeacher);

        subjectTeacherTxt = new JTextField();
        subjectTeacherTxt.setBounds(130,30,100,30);
        jPanel.add(subjectTeacherTxt);

        data = new JLabel("Date for class:");
        data.setBounds(30,80,80,30);
        jPanel.add(data);

        dataTxt = new JTextField();
        dataTxt.setBounds(130,80,100,30);
        jPanel.add(dataTxt);

        classroom = new JLabel("Zoom:");
        classroom.setBounds(30,130,80,30);
        jPanel.add(classroom);

        classroomTxt = new JTextField();
        classroomTxt.setBounds(130,130,100,30);
        jPanel.add(classroomTxt);

        set = new JButton("Update");
        set.setBounds(80,180,100,30);
        jPanel.add(set);
        set.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SubjectTablesql.update(subjectTeacherTxt.getText(),dataTxt.getText(),classroomTxt.getText());
            }
        });
        return jPanel;
    }
}
