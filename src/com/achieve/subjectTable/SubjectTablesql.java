package com.achieve.subjectTable;

import com.achieve.score.Score;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SubjectTablesql {
    private static Connection getConn() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/Information?serverTimezone=UTC";
        String username = "root";
        String password = "root";
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    /**
     *          NAME, COURSE
     * */
    public static int insert(String subjectTeacher,String subject) {
        Connection conn = getConn();
        int i = 0;
        String sql = "insert into subjectTable (subject,subjectTeacher) values(?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, subject);
            pstmt.setString(2, subjectTeacher);
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    /**
     *          STUDENT NAME, ID, COURSE
     * */
    public static int update(String clazz,int id,String name,String subject) {
        Connection conn = getConn();
        int i = 0;
        String sql = "update subjecttable set clazz='" + clazz + "',id='"+id+"',name='"+name+"'where subject='" + subject + "'";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    /**
     *              DATE, ZOOM
     * */
    public static int update(String subjectTeacher,String date,String classroom){
        Connection conn = getConn();
        int i = 0;
        String sql = "update subjecttable set date ='" + date + "',classroom='"+classroom+"'where subjectTeacher='" + subjectTeacher + "'";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
