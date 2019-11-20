package db.test;
import java.sql.*;

public class Mdelete {
		private Connection conn=null;
		
		public boolean mdelete(String idx,String stud_id)throws SQLException{
			boolean flag = false;
			PreparedStatement pstmt=null;
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hdbwork","hstud","gkrtod123A!");
				if(idx=="all") {
					pstmt = conn.prepareStatement("DELETE FROM t20141472B");	
				} else {
					pstmt = conn.prepareStatement("DELETE FROM t20141472B WHERE stud_id=?;");	
					pstmt.setString(1, stud_id);
				}
				pstmt.executeUpdate();
				flag=true;
			}catch(Exception e) {e.printStackTrace();
			}finally {
				try {if(conn!=null) conn.close(); if(pstmt!=null)pstmt.close();
				  }catch(Exception e) {e.printStackTrace();}
		}
			return flag;
		}
}
		
		
		
		
		
		
	