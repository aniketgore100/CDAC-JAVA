package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Insert {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("loaded");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac23?useSSL=false", "root", "Gore@9588");
		System.out.println("success");
		
		
		// update
		
		
//		PreparedStatement ps = cn.prepareStatement("update restaurant set name = ? where resId=?");
//		ps.setString(1, "gore");
//		ps.setInt(2, 6);
//		int count = ps.executeUpdate();
//
//		if(count > 0) {
//			System.out.println("updated");
//		}
//		else {
//			System.out.println("failed");
//		}
//		
		
		
		//insert
		
//		int i = ps.executeUpdate();
//		if(i > 0) {
//			System.out.println("success");
//		}else {
//			System.out.println("falied");
//		}
		
		
		
		// delete
		
//		PreparedStatement ps = cn.prepareStatement("delete from restaurant where resId=?");
//		ps.setInt(1, 6);
//		ps.executeUpdate();
		
		// fetch
		
		PreparedStatement ps = cn.prepareStatement("select * from restaurant");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			int Id = rs.getInt("resId");
			String name = rs.getString("name");
			
			System.out.println("Id : " + Id);
			System.out.println("name : " +  name);
		}
		
	}
	
}
