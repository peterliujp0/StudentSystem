package com.achieve.score;

import com.achieve.student.Student;

import java.sql.*;

public class Scoresql {
    public static Object[][] scodata = new Object[999][5];
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
     *          insert
     * */
    public static int insert(Score score) {
        Connection conn = getConn();
        int i = 0;
        String sql = "insert into score (id,subject,subjectTeacher,member,result) values(?,?,?,?,?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setInt(1, score.getId());
            pstmt.setString(2, score.getSubject());
            pstmt.setString(3, score.getSubjectTeacher());
            pstmt.setString(4, score.getMember());
            pstmt.setInt(5, score.getResult());
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    /**
     *          update
     * */
    public static int update(int id,String subject,String subjectTeacher,String member,int result) {
        Connection conn = getConn();
        int i = 0;
        String sql = "update score set result='" + result + "',subject='" + subject + "',subjectTeacher='"+subjectTeacher+"',member='"+member+"' where id='" + id + "'";
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
     *          search
     * */
    public static void getAll() {
        Connection conn = getConn();
        String sql = "select * from score";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            int i = 0;
            while (rs.next()) {
                scodata[i][0] = rs.getInt(1);
                scodata[i][1] = rs.getString(2);
                scodata[i][2] = rs.getString(3);
                scodata[i][3] = rs.getString(4);
                scodata[i][4] = rs.getInt(5);
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void get(String subject){
        Connection conn = getConn();
        String sql = "select * from score where subject='"+subject+"'";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            int i = 0;
            while (rs.next()) {
                scodata[i][0] = rs.getInt(1);
                scodata[i][1] = rs.getString(2);
                scodata[i][2] = rs.getString(3);
                scodata[i][3] = rs.getString(4);
                scodata[i][4] = rs.getInt(5);
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     *          delete
     * */
    public static int delete(int id) {
        Connection conn = getConn();
        int i = 0;
        String sql = "delete from score where id='" + id + "'";
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
     *          ID, NAME
     * */
    public static int insert(int id,String number) {
        Connection conn = getConn();
        int i = 0;
        String sql = "insert into score (id,member) values(?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.setString(2, number);
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    /**
     *          COURSE REGISTRATION
     * */
    public static int update(int id,String subject,String subjectTeacher) {
        Connection conn = getConn();
        int i = 0;
        String sql = "update score set subject='" + subject + "',subjectTeacher='"+subjectTeacher+"'where id='" + id + "'";
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
     *         TUTOR ENTERING SCORE
     * */
    public static int update(int id,int result) {
        Connection conn = getConn();
        int i = 0;
        String sql = "update score set result='" + result +"'where id='" + id + "'";
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
     *          SEARCH FOR SCORE
     * */
    public static void get(int id){
        Connection conn = getConn();
        String sql = "select * from score where id='"+id+"'";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            Object[][] data = new Object[999][5];
            scodata = data;
            while (rs.next()){
                scodata[0][0] = rs.getInt(1);
                scodata[0][1] = rs.getString(2);
                scodata[0][2] = rs.getString(3);
                scodata[0][3] = rs.getString(4);
                scodata[0][4] = rs.getInt(5);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
