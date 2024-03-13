import java.sql.*;

public class App {
    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/<table>","<username>","<password>");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("<query>");
            while (rs.next()) 
            {
                System.out.println(rs.getString(1)+" "+rs.getString(2));               
            }
            con.close();
        }
            catch(Exception e)
            {
                System.out.println(e);

            }
    }
}
