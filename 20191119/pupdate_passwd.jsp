<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import="java.sql.*"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html> <!-- pupdate_passwd.jsp -->
<html><head>
<meta http-equiv="Content-Type"content="text/html; charset=utf-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<title>JDBC pupdate_passwd 실습</title></head><body>
<%
Class.forName("com.mysql.jdbc.Driver"); //mySQL
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hdbwork","hstud","gkrtod123A!");
String sql = "UPDATE t20141472A SET stud_passwd=? WHERE stud_id=?;";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, "5174");
pstmt.setString(2, "RingoAde");
pstmt.executeUpdate();
String sql2 = "SELECT*FROM t20141472A WHERE stud_id=?;";
PreparedStatement pstmt2 = conn.prepareStatement(sql2);
pstmt2.setString(1, "RingoAde");
ResultSet rs = pstmt2.executeQuery();
while(rs.next()) {
  out.println(rs.getString("stud_id"));
  out.println(rs.getString("stud_passwd"));
}
rs.close();
pstmt.close();
pstmt2.close();
conn.close();
%>
</body></html>