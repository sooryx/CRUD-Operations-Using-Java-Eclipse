package com.infotech.client;

import java.sql.Connection;
import java.sql.Statement;

import com.infotech.util.*;

public class ClientTest {

	public static void main(String[] args) {
		createstudent();	
		
	}

	private static void deletestud_id() {
		try(Connection connection = DBUtil.getConnection();Statement st = connection.createStatement();) {
			
			String SQLINSERT = "DELETE FROM stud_details WHERE stud_id=3";
			int executeUpdate = st.executeUpdate(SQLINSERT);
			if(executeUpdate ==1){
				System.out.println("Student is deleted..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void updateemailById() {
		try(Connection connection = DBUtil.getConnection();Statement st = connection.createStatement();) {
			
			String SQLINSERT = "UPDATE stud_details set email='SOORYA.com' WHERE stud_id=7";
			int executeUpdate = st.executeUpdate(SQLINSERT);
			if(executeUpdate ==1){
				System.out.println("Email is updated..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createstudent() {
		try(Connection connection = DBUtil.getConnection();Statement st = connection.createStatement();) {
			
			String SQLINSERT = "INSERT INTO stud_details(stud_name,email,fees,date_of_birth,semester) "
					+ "VALUES('SOORYA','sooryajithsajeev5@gmail.com',60000.00,'2000-05-05',4)";
			int executeUpdate = st.executeUpdate(SQLINSERT);
			if(executeUpdate ==1){
				System.out.println("Student is created..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
