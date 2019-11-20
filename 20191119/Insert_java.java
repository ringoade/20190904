package db.test;
import java.sql.*;
public class Insert_java {
 public static void main(String[] args) {
	 boolean flag=false;
	 Connection conn = null;
	 try {
		 Class.forName("com.mysql.jdbc.Driver");
  } catch(ClassNotFoundException e) {e.printStackTrace(); }
  PreparedStatement pstmt=null;
  try {
	  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hdbwork","hstud","gkrtod123A!");
	  String sql="INSERT INTO t20141472B (stud_id, stud_passwd, stud_name, stud_email, stud_gender) VALUES(?,?,?,?,?)";
	  pstmt = conn.prepareStatement(sql);
	  pstmt.setString(1,"test");
	  pstmt.setString(2,"0000");
	  pstmt.setString(3,"Name");
	  pstmt.setString(4,"test@email.com");
	  pstmt.setString(5,"male");
	  int cnt = pstmt.executeUpdate();
	  flag=true;
	  System.out.println(flag+""+cnt);
  } catch(Exception e) {e.printStackTrace();
 } finally {
	 try { if(conn !=null) conn.close(); 
	 if(pstmt !=null) pstmt.close();
	 } catch(Exception e) { e.printStackTrace(); }
 }}}
