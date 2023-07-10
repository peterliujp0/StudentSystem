package com.window.admin.student;

import com.achieve.score.Scoresql;
import com.achieve.student.Student;
import com.achieve.student.StudentInformationsql;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddStudent {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel id;
    private JTextField idTxt;

    private JLabel idExp;
    private JLabel name;
    private JTextField nameTxt;
    private JLabel sex;
    private JTextField sexTxt;
    private JLabel course;
    private JTextField courseTxt;
    private JLabel password;
    private JTextField passwordTxt;

    private JLabel dateOfAddition;

    private JTextField dateOfAdditionTxt;
    private JButton add;
    public void show(){
        jFrame = new JFrame();
        jFrame.setBounds(700,100,400,450);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel(){
        jPanel = new JPanel(null);

        // Integer only
        id = new JLabel("ID:");
        id.setBounds(30,30,50,30);
        jPanel.add(id);

        idTxt = new JTextField();
        idTxt.setBounds(120,30,100,30);
        jPanel.add(idTxt);

        idExp = new JLabel("(Numbers Only)");
        idExp.setBounds(240,30,100,30);
        jPanel.add(idExp);

        name = new JLabel("Name:");
        name.setBounds(30,80,50,30);
        jPanel.add(name);

        nameTxt = new JTextField();
        nameTxt.setBounds(120,80,100,30);
        jPanel.add(nameTxt);

        sex = new JLabel("Sex:");
        sex.setBounds(30,130,50,30);
        jPanel.add(sex);

        sexTxt = new JTextField();
        sexTxt.setBounds(120,130,100,30);
        jPanel.add(sexTxt);

        course = new JLabel("Course:");
        course.setBounds(30,180,50,30);
        jPanel.add(course);

        courseTxt = new JTextField();
        courseTxt.setBounds(120,180,100,30);
        jPanel.add(courseTxt);

        dateOfAddition = new JLabel("Date:");
        dateOfAddition.setBounds(30,230,70,30);
        jPanel.add(dateOfAddition);

        dateOfAdditionTxt = new JTextField();
        dateOfAdditionTxt.setBounds(120,230,100,30);
        jPanel.add(dateOfAdditionTxt);

        // For future features, students' password
        password = new JLabel("Password:");
        password.setBounds(30,280,50,30);
        jPanel.add(password);

        passwordTxt = new JTextField();
        passwordTxt.setBounds(120,280,100,30);
        jPanel.add(passwordTxt);

        add = new JButton("Add");
        add.setBounds(60,330,80,30);
        jPanel.add(add);
        add.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student s = new Student(Integer.parseInt(idTxt.getText()),nameTxt.getText(),sexTxt.getText(),courseTxt.getText(),dateOfAdditionTxt.getText(),passwordTxt.getText());
                StudentInformationsql.insert(s);
                Scoresql.insert(Integer.parseInt(idTxt.getText()),nameTxt.getText());
            }
        });
        return jPanel;
    }
}
