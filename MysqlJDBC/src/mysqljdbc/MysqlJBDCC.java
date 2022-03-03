package mysqljdbc;

import java.sql.*;


public class MysqlJBDCC {


	    public static void main(String[] args) throws Exception {
	        // TODO Auto-generated method stub
	        Class.forName("com.mysql.cj.jdbc.Driver");// step 2  class loader 
	        
	        
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root", "Powerpoint@1");//step 3 create connection
	        
	        Statement st = con.createStatement();// step 4
	       // String query = "create table student(ID int primary key,SName varchar(20), SMarks int)";//step 6
	        //String query4 = " delete from student where id = 3";
	        //String query1 = "insert into student values(1,' madhu',20)";
	        //String query1 = "insert into student values(1,'nancy',20)";
	        //String query1 = "insert into student values(1,'banu',20)";
	        String query5= "update student set SName = 'pallavi' where ID ='2'";
	        st.executeUpdate(query5);//steps 7
	        
	        System.out.println("Student Table created successfully");
	        
	        //System.out.println("Row inserted successfully");
	        
	    st.close();
	    con.close();
	    }

	}


