package com.window.teacher;

import com.achieve.score.Score;
import com.achieve.score.Scoresql;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddScore {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel id;
    private JTextField idTxt;
    private JLabel course;
    private JTextField courseTxt;
    private JLabel courseTeacher;
    private JTextField courseTeacherTxt;
    private JLabel member;
    private JTextField memberTxt;
    private JLabel result;
    private JTextField resultTxt;
    private JButton insert;

    public void show(){
        jFrame = new JFrame();
        jFrame.setBounds(500,100,500,500);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel(){
        jPanel = new JPanel(null);

        id = new JLabel("Student ID:");
        id.setBounds(30,30,50,30);
        jPanel.add(id);

        idTxt = new JTextField();
        idTxt.setBounds(100,30,100,30);
        jPanel.add(idTxt);


        result = new JLabel("Score:");
        result.setBounds(30,80,50,30);
        jPanel.add(result);

        resultTxt = new JTextField();
        resultTxt.setBounds(100,80,100,30);
        jPanel.add(resultTxt);

        insert = new JButton("Insert:");
        insert.setBounds(60,130,100,30);
        jPanel.add(insert);

        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Scoresql.update(Integer.parseInt(idTxt.getText()),Integer.parseInt(resultTxt.getText()));
            }
        });

        return jPanel;
    }

}
