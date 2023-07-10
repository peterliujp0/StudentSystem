package com.window.student;

import com.achieve.score.Scoresql;
import com.window.Login;

import javax.swing.*;

// Score System, to be featured in the future
public class GetScore {
    private JFrame jFrame;
    private JPanel jPanel;
    private Object []heard = {"Student ID","Subject","Tutor","Name","Score"};
    private JTable table;
    private JScrollPane jScrollPane;

    public void show(){
        jFrame = new JFrame();
        jFrame.setBounds(500,100,500,500);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel(){
        jPanel = new JPanel(null);
        Object[][] data = new Object[999][5];
        Scoresql.scodata = data;
        Scoresql.get(Login.id);
        table = new JTable(Scoresql.scodata,heard);
        jScrollPane = new JScrollPane(table);
        jScrollPane.setBounds(0,0,500,500);
        jPanel.add(jScrollPane);
        return jPanel;
    }

}

