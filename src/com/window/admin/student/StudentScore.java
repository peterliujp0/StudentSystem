package com.window.admin.student;

import com.achieve.score.Scoresql;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentScore {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel id;
    private JTextField idTxt;
    private JLabel score;
    private JTextField scoreTxt;
    private JButton updateInfo;
    public void show(){
        jFrame = new JFrame();
        jFrame.setBounds(400,100,500,500);

        jFrame.setVisible(true);
    }
    public JPanel panel() {
        jPanel = new JPanel(null);
        id = new JLabel("ID");
        id.setBounds(30, 30, 50, 30);
        jPanel.add(id);

        idTxt = new JTextField();
        idTxt.setBounds(100, 30, 100, 30);
        jPanel.add(idTxt);

        score = new JLabel("Score");
        score.setBounds(30, 80, 50, 30);
        jPanel.add(score);

        scoreTxt = new JTextField();
        scoreTxt.setBounds(100, 80, 100, 30);
        jPanel.add(scoreTxt);

        updateInfo = new JButton("Update");
        updateInfo.setBounds(60, 130, 100, 30);
        jPanel.add(updateInfo);

        updateInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Scoresql.update(Integer.parseInt(idTxt.getText()), Integer.parseInt(scoreTxt.getText()));
            }
        });
        return jPanel;
    }
}
