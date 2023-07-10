package com.window.admin.student;

import com.achieve.student.Student;
import com.achieve.student.StudentInformationsql;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class UpdateStudent {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel id;
    private JTextField idTxt;
    private JLabel course;
    private JTextField courseTxt;
    private JLabel password;
    private JTextField passwordTxt;
    private JButton update;
    public void show(){
        jFrame = new JFrame();
        jFrame.setBounds(700,100,400,400);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel(){
        jPanel = new JPanel(null);

        id = new JLabel("ID:");
        id.setBounds(30,30,50,30);
        jPanel.add(id);

        idTxt = new JTextField();
        idTxt.setBounds(100,30,100,30);
        jPanel.add(idTxt);


        course = new JLabel("Course:");
        course.setBounds(30,180,50,30);
        jPanel.add(course);

        courseTxt = new JTextField();
        courseTxt.setBounds(100,180,100,30);
        jPanel.add(courseTxt);

        password = new JLabel("Password:");
        password.setBounds(30,230,50,30);
        jPanel.add(password);

        passwordTxt = new JTextField();
        passwordTxt.setBounds(100,230,100,30);
        jPanel.add(passwordTxt);

        update = new JButton("Update");
        update.setBounds(60,280,80,30);
        jPanel.add(update);
        update.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentInformationsql.update(Integer.parseInt(idTxt.getText()),courseTxt.getText(),passwordTxt.getText());
            }
        });
        return jPanel;
    }
}
