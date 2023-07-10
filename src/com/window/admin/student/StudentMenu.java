package com.window.admin.student;

import com.window.admin.Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class StudentMenu {
    private JFrame jFrame;
    private JPanel jPanel;
    private GridLayout layout;
    private JButton add;
    private JButton delete;
    private JButton update;
    private JButton getAll;
    private JButton breaks;

    public void show(){
        jFrame = new JFrame();
        jFrame.setBounds(400,100,500,300);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel(){
        layout = new GridLayout(5, 1);
        jPanel = new JPanel(layout);

        add = new JButton("Insert New Student");
        jPanel.add(add);
        add.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddStudent().show();
            }
        });

        delete = new JButton("Delete Student Info");
        jPanel.add(delete);
        delete.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DeleteStudent().show();
            }
        });
        update = new JButton("Change Student Info");
        jPanel.add(update);
        update.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UpdateStudent().show();
            }
        });
        getAll = new JButton("Search for A Student");
        jPanel.add(getAll);
        getAll.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StudentDetails().show();
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
        return jPanel;
    }
}

