package jdbcithtest;
import java.sql.*;
public class insert {
    public void insertdata(String un,String pd,String mob)
    {
        int x;
        try{
            PreparedStatement pst;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/united","root","");
            pst = con.prepareStatement("insert into emp(uname,pass,mob) values (?,?,?)");
            pst.setString(1, un);
            pst.setString(2, pd);
            pst.setString(3, mob);
            x=pst.executeUpdate();
            if(x==1)
                System.out.println("Record has been saved");
            else
                System.out.println("Record not saved");
            
        }catch(Exception e){System.out.println("please check the data: "+e.getMessage());}
        
    }
    
}
