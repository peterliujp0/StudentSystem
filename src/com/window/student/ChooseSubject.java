package com.window.student;

import com.achieve.score.Scoresql;
import com.achieve.student.StudentInformationsql;
import com.achieve.subjectTable.SubjectTable;
import com.achieve.subjectTable.SubjectTablesql;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ChooseSubject {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel id;
    private JTextField idTxt;
    private JLabel subject;
    private JTextField subjectTxt;
    private JLabel subjectTeacher;
    private JTextField CourseTutorTxt;
    private JButton choose;

    public void show(){
        jFrame = new JFrame("Register");
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

        subject = new JLabel("Course:");
        subject.setBounds(30,80,50,30);
        jPanel.add(subject);

        subjectTxt = new JTextField();
        subjectTxt.setBounds(100,80,100,30);
        jPanel.add(subjectTxt);


        subjectTeacher = new JLabel("Tutor:");
        subjectTeacher.setBounds(30,130,50,30);
        jPanel.add(subjectTeacher);

        CourseTutorTxt = new JTextField();
        CourseTutorTxt.setBounds(100,130,100,30);
        jPanel.add(CourseTutorTxt);

        choose = new JButton("Select");
        choose.setBounds(60,180,100,30);
        jPanel.add(choose);
        choose.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Scoresql.update(Integer.parseInt(idTxt.getText()), subjectTxt.getText(),CourseTutorTxt.getText());
                SubjectTablesql.update(StudentInformationsql.getcourse(Integer.parseInt(idTxt.getText())),Integer.parseInt(idTxt.getText()),StudentInformationsql.getname(Integer.parseInt(idTxt.getText())),subjectTxt.getText());
                System.out.println(StudentInformationsql.getname(Integer.parseInt(idTxt.getText())));
            }
        });
        return jPanel;
    }
}
