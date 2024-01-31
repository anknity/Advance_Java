package bcast.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import BCA6.student;

public class Main {

			public static void main(String[] args)throws ClassNotFoundException,SQLException {
				// TODO Auto-generated method stub


		Class.forName("com.mysql.cj.jdbc.Driver");



		String url = "jdbc:mysql://localhost:3306/ank";



		String db= "root";


		String psd = "nity";

		Connection con = DriverManager.getConnection(url,db,psd);



		Scanner sc = new Scanner(System.in);

		student stud = new student();


		stud.insertStudent(con, sc);

		}
		

	}


