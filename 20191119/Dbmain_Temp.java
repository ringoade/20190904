package db.test;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
public class Dbmain_Temp {
	public static void main(String[] args) {
		boolean flag = false;
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e) {e.printStackTrace();}
	
	PreparedStatement pstmt=null;
	String stud_id,stud_passwd,stud_name,stud_email,stud_gender;
	try {
		System.out.println("delete.");
		Mdelete mdelete = new Mdelete();
		flag=mdelete.mdelete("all","");
		
		System.out.println("input RingoAde");
		stud_id = "RingoAde";
		stud_passwd = "5174";
		stud_name = "SH KIM";
		stud_email = "bnb5174@naver.com";
		stud_gender = "male";
		Minsert minst = new Minsert();
		flag=minst.minsert(stud_id,stud_passwd,stud_name,stud_email,stud_gender);
		
		System.out.println("input Hatsune");
		stud_id = "Miku";
		stud_passwd = "3939";
		stud_name = "HatsuneMiku";
		stud_email = "Miku@vocaloid.com";
		stud_gender = "female";
		flag=minst.minsert(stud_id,stud_passwd,stud_name,stud_email,stud_gender);
		
		
	}catch(Exception e) {e.printStackTrace();}
	finally {
		try {if(conn!=null) conn.close(); if(pstmt!=null)pstmt.close();
		  }catch(Exception e) {e.printStackTrace();}
	}
	}
}
