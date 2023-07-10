package com.window.admin;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Registered {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel user;
    private JLabel password;
    private JTextField userTxt;
    private JTextField passwordTxt;
    private JButton login;
    public void show(){
        jFrame = new JFrame("Admin");
        jFrame.setBounds(700,200,400,300);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel() {
        jPanel = new JPanel(null);

        user = new JLabel("Username: ");
        user.setBounds(50, 50, 50, 30);
        jPanel.add(user);

        userTxt = new JTextField();
        userTxt.setBounds(120, 50, 100, 30);
        jPanel.add(userTxt);

        password = new JLabel("Password: ");
        password.setBounds(50, 100, 50, 30);
        jPanel.add(password);

        passwordTxt = new JTextField();
        passwordTxt.setBounds(120, 100, 100, 30);
        jPanel.add(passwordTxt);

        login = new JButton("Login");
        login.setBounds(80, 150, 70, 30);
        jPanel.add(login);
        login.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu().show();
                jFrame.setVisible(false);
            }
        });
        return jPanel;
    }
}
