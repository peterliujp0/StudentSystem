package com.window;

import com.achieve.student.StudentInformationsql;
import com.achieve.teacher.TeacherInformationsql;
import com.window.admin.Menu;
import com.window.admin.Registered;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Login {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel user;
    private JLabel password;
    private JTextField userTxt;
    private JTextField passwordTxt;
    private JLabel blank;
    private JButton login;
    private JButton registered;
    public static String subject;
    public static int id;
    public void show(){
        jFrame = new JFrame("Sunny Student Info Center");
        jFrame.setBounds(700,200,350,250);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel(){
        jPanel = new JPanel(null);

        user = new JLabel("Username: ");
        user.setBounds(50,50,100,30);
        jPanel.add(user);

        userTxt = new JTextField();
        userTxt.setBounds(120,50,100,30);
        jPanel.add(userTxt);

        password = new JLabel("Password: ");
        password.setBounds(50,100,100,30);
        jPanel.add(password);

        passwordTxt = new JTextField();
        passwordTxt.setBounds(120,100,100,30);
        jPanel.add(passwordTxt);

        blank = new JLabel(" ");
        blank.setBounds(50,50,50,50);
        jPanel.add(blank);

        login = new JButton("Login");
        login.setBounds(80,150,70,30);
        jPanel.add(login);

        registered = new JButton("Admin");
        registered.setBounds(170,150,70,30);
        jPanel.add(registered);

        login.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentInformationsql.getAll();
                TeacherInformationsql.getAll();
                String user = userTxt.getText();
                String password = passwordTxt.getText();
                for (int i = 0; i <StudentInformationsql.studata.length ; i++) {
                    // Students' usage, not featured in this version
                    if (user.equals(StudentInformationsql.studata[i][0]+"")&password.equals(StudentInformationsql.studata[i][5]+"")){
                        id = Integer.parseInt(user);
                        new com.window.student.Menu().show();
                        jFrame.setVisible(false);
                        break;
                        // Teachers' usage, not featured in this version
                    }else if (user.equals(TeacherInformationsql.teadata[i][0]+"")&password.equals(TeacherInformationsql.teadata[i][5]+"")){
                       subject  = TeacherInformationsql.teadata[i][2]+"";
                        new com.window.teacher.Menu().show();
                        jFrame.setVisible(false);
                        break;
                        // Admin usage
                    }else if (user.equals("admin")&password.equals("admin")){
                        new Menu().show();
                        jFrame.setVisible(false);
                        break;
                    }
                }
            }
        });
        registered.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Registered().show();
            }
        });
        return jPanel;
    }
}