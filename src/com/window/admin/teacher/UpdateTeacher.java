package com.window.admin.teacher;

import com.achieve.teacher.TeacherInformationsql;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateTeacher {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel id;
    private JTextField idTxt;
    private JLabel phone;
    private JTextField phoneTxt;
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


        phone = new JLabel("Contact Number:");
        phone.setBounds(30,180,50,30);
        jPanel.add(phone);

        phoneTxt = new JTextField();
        phoneTxt.setBounds(100,180,100,30);
        jPanel.add(phoneTxt);

        password = new JLabel("Password:");
        password.setBounds(30,230,50,30);
        jPanel.add(password);

        passwordTxt = new JTextField();
        passwordTxt.setBounds(100,230,100,30);
        jPanel.add(passwordTxt);

        update = new JButton("Update");
        update.setBounds(60,280,80,30);
        jPanel.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TeacherInformationsql.update(Integer.parseInt(idTxt.getText()),Integer.parseInt(phoneTxt.getText()),passwordTxt.getText());
            }
        });
        return jPanel;
    }
}

