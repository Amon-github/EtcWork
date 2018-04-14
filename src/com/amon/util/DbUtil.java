package com.amon.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


/**
* @author Amon E-mail:248779716@qq.com
* @version ����ʱ�䣺2018��3��28�� ����9:25:46
* ���ݿ����ӹ�����
*/
public class DbUtil {
	private static String dbUrl="jdbc:mysql://localhost:3306/db_book";
	private static String userName="root";
	private static String passWord="root";
	private static String jdbcName="com.mysql.jdbc.Driver";
	
	
	
	/**
	 * �������ݿ�����ݱ�
	 * @return
	 */
	public static Connection buildUpDb(){
		 Connection conn=null;
		 try {
			 	//��������
				Class.forName("com.mysql.jdbc.Driver");

			    //һ��ʼ������һ���Ѿ����ڵ����ݿ� 
			    String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8";   
			    conn = DriverManager.getConnection(url, "root", "root"); 
			    Statement stat = conn.createStatement(); 
			      
			    //�������ݿ�db_book
			    stat.executeUpdate("create database if not exists db_book"); 
			      
			    //�򿪴��������ݿ� 
			    stat.close(); 
			    conn.close(); 
			    url = "jdbc:mysql://localhost:3306/db_book?useUnicode=true&characterEncoding=utf-8"; 
			    conn = DriverManager.getConnection(url, "root", "root"); 
			    stat = conn.createStatement(); 
			      
			    //������
			    stat.executeUpdate("CREATE TABLE if not exists `t_book` (`id` int(11) NOT NULL AUTO_INCREMENT,`bookName` varchar(255) DEFAULT NULL,`author` varchar(255) DEFAULT NULL,`sex` varchar(255) DEFAULT NULL,`price` decimal(10,0) DEFAULT NULL,`bookTypeId` int(11) DEFAULT NULL,`bookDesc` varchar(255) DEFAULT NULL,PRIMARY KEY (`id`),KEY `bookTypeid` (`bookTypeId`)) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8"); 
			    stat.executeUpdate("CREATE TABLE if not exists `t_booktype` (`id` int(11) NOT NULL AUTO_INCREMENT,`bookTypeName` varchar(255) DEFAULT NULL,`bookTypeDesc` varchar(255) DEFAULT NULL,PRIMARY KEY (`id`)) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8");
			    stat.executeUpdate("CREATE TABLE if not exists `t_user` (`id` int(11) NOT NULL AUTO_INCREMENT,`userName` varchar(25) DEFAULT NULL,`password` varchar(25) DEFAULT NULL,`usertype` int(11) DEFAULT '2',PRIMARY KEY (`id`)) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8");
			    
			    
			    //�����������ݿ�����һ�����ݣ��ڳ��������ʱִ�У���
			    /*UserDao userDao=new UserDao();
			    User user=new User(1);
			    String result=userDao.selectUserByID(conn, user);
			    if ("��ȡ�û�ID����".equals(result)) {
			    	 stat.executeUpdate("INSERT INTO `t_user` VALUES ('1', 'admin', 'admin', '1')");
				}*/
			   } catch (Exception e) {
					System.out.println("�������ݿ��쳣");
					e.printStackTrace();
				}finally {
					try {
						new DbUtil().closeCon(conn);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} 
		return null;
	}
	
	
	
	/**
	 * ��ȡ���ݿ�����
	 * @return
	 * @throws Exception 
	 * @throws Exception
	 */
	public static Connection getConn() throws Exception  {
		//���ز���ָ�����࣬���ҳ�ʼ������
		Class.forName(jdbcName);
		System.out.println("DbUtil-----���������ɹ�");
		Connection connection=DriverManager.getConnection(dbUrl,userName,passWord);
		System.out.println("DbUtil-----��ȡ���ݿ����ӳɹ�");
		return connection;
		
	}
	
	/**
	 * �ر����ݿ�����
	 * @param con
	 * @throws SQLException
	 */
	public void closeCon(Connection con) throws SQLException{
		if (con!=null) {
			con.close();
		}
	}
	
}
