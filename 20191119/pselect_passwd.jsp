<%@ page language="java" contentType="text/html; charset = UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPEhtml><!--pselect_passwd.jsp-->
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<meta name="viewport"content="width=device-width, initial-scale=1"/> 
<title>JDBC pselect_passwd 실습 </title></head>
<body>
<%
Class.forName("com.mysql.jdbc.Driver"); //mySQL
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hdbwork","hstud","gkrtod123A!");
String sql = "SELECT * FROM t20141472A WHERE stud_id=?;";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1,"RingoAde");
ResultSet rs = pstmt.executeQuery();
while(rs.next()) {
   out.println(rs.getString("stud_id"));
   out.println(rs.getString("stud_passwd"));
}
rs.close(); //resultset
pstmt.close();  //statement
conn.close();  //connection
%>
</body></html>