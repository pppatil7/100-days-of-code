package learn.corejava;

/*
 * patient.java
 * 
 * Copyright 2018 patil <patil@patil-HP-Notebook>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */



import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class TestPatient {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
	static final String USER = "root";
	static final String PASS = "mysql";

	public JFrame frame;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JLabel label9;
	private JLabel label10;
	private JLabel label1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestPatient window = new TestPatient();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestPatient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Patient");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel logo = new JLabel();
		logo.setBounds(130, 5, 350, 260);
		//add(logo);
		logo.setIcon(new ImageIcon("images/img1.jpg"));
		frame.getContentPane().add(logo);
		
		label1 = new JLabel();
		label1.setBounds(40, 251, 161, 26);
		frame.getContentPane().add(label1);
		
		label2 = new JLabel();
		label2.setBounds(40, 307, 161, 26);
		frame.getContentPane().add(label2);
		
		label3 = new JLabel();
		label3.setBounds(40, 363, 161, 26);
		frame.getContentPane().add(label3);
		
		label4 = new JLabel();
		label4.setBounds(40, 416, 161, 26);
		frame.getContentPane().add(label4);
		
		label5 = new JLabel();
		label5.setBounds(40, 475, 161, 26);
		frame.getContentPane().add(label5);
		
		label6 = new JLabel();
		label6.setBounds(277, 251, 155, 26);
		frame.getContentPane().add(label6);
		
		label7 = new JLabel();
		label7.setBounds(277, 307, 155, 26);
		frame.getContentPane().add(label7);
		
		label8 = new JLabel();
		label8.setBounds(277, 363, 155, 26);
		frame.getContentPane().add(label8);
		
		label9 = new JLabel();
		label9.setBounds(277, 416, 155, 26);
		frame.getContentPane().add(label9);
		
		label10 = new JLabel();
		label10.setBounds(277, 475, 155, 26);
		frame.getContentPane().add(label10);
		
		Wrapper conn = null;
    	try
    	{	
    		
					try
					{
						Class.forName("com.mysql.jdbc.Driver").newInstance();
					    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "mysql");
					    Statement stmt = (Statement) con.createStatement();
					    String query = "SELECT p1.pid,p1.name,p1.address,p1.admit_date,p1.room_no,p1.doc,p2.dis_date,p2.days,p2.feepd,p2.feesh FROM patient1 p1,patient2 p2 where p1.pid=p2.pid AND p1.pid="+TestLogin.upid+";";
					    stmt.executeQuery(query);
					    ResultSet rs = stmt.getResultSet();

					    while(rs.next())
					    {
					    	String db_pid = rs.getString("pid");
					    	String db_name = rs.getString("name");
					    	String db_addr=rs.getString("address");
					    	String db_adate=rs.getString("admit_date");
					    	String db_room=rs.getString("room_no");
					    	String db_doc=rs.getString("doc");
					    	String db_ddate=rs.getString("dis_date");
					    	String db_days=rs.getString("days");
					    	String db_feepd=rs.getString("feepd");
					    	String db_feesh=rs.getString("feesh");
					    	
					    	label1.setText("PID    :"+db_pid);
					    	label2.setText("Name   :"+db_name);
					    	label3.setText("Addr   :"+db_addr);
					    	label4.setText("Admit Date :"+db_adate);
					    	label5.setText("Room no :"+db_room);
					    	label6.setText("Doctor  :"+db_doc);
					    	label7.setText("Dis Date:"+db_ddate);
					    	label8.setText("Days    :"+db_days);
					    	label9.setText("Doct Fees:"+db_feepd);
					    	label10.setText("Hosp Fees:"+db_feesh);
					    	
					    }
					}
					catch (InstantiationException e1) 
					{
						e1.printStackTrace();
					}
					catch (IllegalAccessException e1) 
					{
						e1.printStackTrace();
					}
					catch (ClassNotFoundException e1) 
					{
						e1.printStackTrace();
					}
					catch (SQLException e1) 
					{
						e1.printStackTrace();
					}
			
					conn = DriverManager.getConnection(DB_URL, USER, PASS);
					System.out.println("Connected database successfully...");
				
				
				((java.sql.Connection)conn).close();
		}				
	
    	catch (SQLException se) 
		{
		
			se.printStackTrace();
		}
		catch (Exception a) 
		{
			a.printStackTrace();
		}
	}
}


