
package jdbcithtest;

import java.sql.*;
public class show {
    
    public void showdata()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/united","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from emp");
            while (rs.next())
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            con.close();
        }catch(Exception e){System.out.println("Do not connect to db:"+e);}

    }
    
}
