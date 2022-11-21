package jdbcithtest;
import java.sql.*;
public class delete {
    public void deleteData(String un){
        int x;
         PreparedStatement pst;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/united","root","");
            pst=con.prepareStatement("delete from emp where uname=?");
                pst.setString(1,un);
		
                x=pst.executeUpdate();
            if(x==1)
            {
            System.out.println("Record has been DELETED");
            }
        }catch(Exception e){System.out.println("please check the data: "+e.getMessage());}  
    }
    
}
