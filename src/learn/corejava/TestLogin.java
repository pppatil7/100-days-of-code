package learn.corejava;


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
//import javax.swing.JButton;

public class TestLogin {

	static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
	static final String USER = "root";
	static final String PASS = "mysql";
	
	
	public JFrame frame;
	private JTextField txtEnterRollNo;
	private JTextField txtEnterName;
	//private JLabel lblNewLabel_2;
	private JLabel label;
	private JLabel lblRollNo;
	private JLabel lblPassword;
	private JButton btnSubmit;
	static String newroll = "";
	static int upid;

	
	
	private boolean login=false;
	public static String usernameq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestLogin window = new TestLogin();
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
	public TestLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login Portal");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setBounds(130, 5, 350, 260);
		//add(logo);
		logo.setIcon(new ImageIcon("images/img1.jpg"));
		frame.getContentPane().add(logo);
		
		txtEnterRollNo = new JTextField();
		txtEnterRollNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterRollNo.setBounds(186, 297, 214, 33);
		frame.getContentPane().add(txtEnterRollNo);
		txtEnterRollNo.setColumns(10);
		
		txtEnterName = new  JPasswordField();
		txtEnterName.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterName.setBounds(186, 368, 214, 33);
		frame.getContentPane().add(txtEnterName);
		txtEnterName.setColumns(10);
		
		label = new JLabel("");
		label.setBounds(45, 269, 46, 14);
		frame.getContentPane().add(label);
		
		lblRollNo = new JLabel("Username:");
		lblRollNo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblRollNo.setBounds(45, 298, 119, 26);
		frame.getContentPane().add(lblRollNo);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblPassword.setBounds(45, 369, 119, 26);
		frame.getContentPane().add(lblPassword);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(156, 450, 113, 33);
		frame.getContentPane().add(btnSubmit);
		
		btnSubmit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e)
                {				
                	Wrapper conn = null;
                	try
                	{	
						int id;
						String id1="";
						String pswd = "";
                		String status="";
                		id1 = txtEnterRollNo.getText().trim();
                		pswd = txtEnterName.getText().trim();
                		id=Integer.parseInt(id1);
       
                		if (id1.length()==0|| pswd.length()==0)
                		{
							JOptionPane.showMessageDialog(null," Please Enter username and password!","Error",JOptionPane.ERROR_MESSAGE);
						}
						
						else  
						{
							//login=true;
								try
								{
									Class.forName("com.mysql.jdbc.Driver").newInstance();
								    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "mysql");
								    Statement stmt = (Statement) con.createStatement();
								    String query = "SELECT user_id,password,status FROM login;";
								    stmt.executeQuery(query);
								    ResultSet rs = stmt.getResultSet();
			
								    while(rs.next())
								    {
								    	int db_rollno = rs.getInt("user_id");
								    	String db_password = rs.getString("password");
								    	String db_s = rs.getString("status");
								    	
								    	if(db_rollno==id && pswd.equals(db_password))
								    	{			                   
								    		System.out.println("OK");
								    		login = true;
								    		status=db_s;
								    		upid=id;
								    	}
								    	System.out.println("COMPARING ROLL NO.:"+id +"  PASSWORD:"+ pswd + "  WITH DB_ROLLNO:" + db_rollno +"  DB_PASSWORD:"+ db_password);
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
							}
							if(login == true)
							{
								if(status.equals("d"))
								{
									Doctor d=new Doctor();
									d.frame.setVisible(true);
									frame.setVisible(false);
								}
								else
								{
									TestPatient p=new TestPatient();
									p.frame.setVisible(true);
									frame.setVisible(false);
								}
									
								
								//dispose();
							}
							else
							{
								String SMessage = "Incorrect Password Or Roll No.!";
								JOptionPane.showMessageDialog(null,SMessage,"Message",JOptionPane.ERROR_MESSAGE);
							}
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
		});
		
	
	}

}

