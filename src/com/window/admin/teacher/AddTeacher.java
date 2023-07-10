package com.window.admin.teacher;

import com.achieve.subjectTable.SubjectTablesql;
import com.achieve.teacher.Teacher;
import com.achieve.teacher.TeacherInformationsql;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTeacher {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel id;
    private JTextField idTxt;
    private JLabel name;
    private JTextField nameTxt;
    private JLabel subject;
    private JTextField subjectTxt;
    private JLabel sex;
    private JTextField sexTxt;
    private JLabel phone;
    private JTextField phoneTxt;
    private JLabel password;
    private JTextField passwordTxt;
    private JButton add;
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

        name = new JLabel("Name:");
        name.setBounds(30,80,50,30);
        jPanel.add(name);

        nameTxt = new JTextField();
        nameTxt.setBounds(100,80,100,30);
        jPanel.add(nameTxt);

        subject = new JLabel("Course:");
        subject.setBounds(30,130,50,30);
        jPanel.add(subject);

        subjectTxt = new JTextField();
        subjectTxt.setBounds(100,130,100,30);
        jPanel.add(subjectTxt);

        sex = new JLabel("Sex:");
        sex.setBounds(30,180,50,30);
        jPanel.add(sex);

        sexTxt = new JTextField();
        sexTxt.setBounds(100,180,100,30);
        jPanel.add(sexTxt);

        phone = new JLabel("Phone number:");
        phone.setBounds(30,230,50,30);
        jPanel.add(phone);

        phoneTxt = new JTextField();
        phoneTxt.setBounds(100,230,100,30);
        jPanel.add(phoneTxt);

        password = new JLabel("Password:");
        password.setBounds(30,280,50,30);
        jPanel.add(password);

        passwordTxt = new JTextField();
        passwordTxt.setBounds(100,280,100,30);
        jPanel.add(passwordTxt);

        add = new JButton("Add");
        add.setBounds(60,330,80,30);
        jPanel.add(add);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Teacher t = new Teacher(Integer.parseInt(idTxt.getText()),nameTxt.getText(),subjectTxt.getText(),sexTxt.getText(),Integer.parseInt(phoneTxt.getText()),passwordTxt.getText());
                TeacherInformationsql.insert(t);
                SubjectTablesql.insert(nameTxt.getText(),subjectTxt.getText());
            }
        });
        return jPanel;
    }
}

